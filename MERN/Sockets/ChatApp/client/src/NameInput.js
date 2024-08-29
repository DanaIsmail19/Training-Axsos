import React, { useState } from 'react';

function NameInput({ setName }) {
  const [input, setInput] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    setName(input);
    localStorage.setItem('username', input);
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2>MERN Chat</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          placeholder="My name..."
        />
        <button type="submit">Start Chatting</button>
      </form>
    </div>
  );
}

export default NameInput;
