import React, { useState, useEffect, useRef } from 'react';
import io from 'socket.io-client';

const socket = io('http://localhost:5000');

function Chat({ name }) {
  const [messages, setMessages] = useState([]);
  const [message, setMessage] = useState('');
  const chatEndRef = useRef(null);

  useEffect(() => {
    socket.emit('join', name);

    socket.on('message', (msg) => {
      setMessages((prevMessages) => [...prevMessages, msg]);
    });

    socket.on('join', (username) => {
      setMessages((prevMessages) => [...prevMessages, `${username} has joined the chat`]);
    });

    return () => {
      socket.off('message');
      socket.off('join');
    };
  }, [name]);

  const sendMessage = () => {
    socket.emit('message', { name, text: message });
    setMessage('');
  };

  useEffect(() => {
    chatEndRef.current?.scrollIntoView({ behavior: 'smooth' });
  }, [messages]);

  return (
    <div style={{ padding: '10px', maxWidth: '600px', margin: '0 auto' }}>
      <div style={{ border: '1px solid #ccc', height: '400px', overflowY: 'scroll' }}>
        {messages.map((msg, index) => (
          <div key={index} style={{ padding: '5px', backgroundColor: msg.name === name ? '#d1e7fd' : '#f1f1f1' }}>
            {msg.name ? `${msg.name} said: ${msg.text}` : msg}
          </div>
        ))}
        <div ref={chatEndRef} />
      </div>
      <input
        type="text"
        value={message}
        onChange={(e) => setMessage(e.target.value)}
        placeholder="Type a message..."
        style={{ width: '80%', padding: '10px' }}
      />
      <button onClick={sendMessage} style={{ padding: '10px' }}>Send</button>
    </div>
  );
}

export default Chat;
