import React, { useEffect } from 'react';
import { io } from 'socket.io-client';

const Chat = () => {
    useEffect(() => {
        // Connect to the Socket.IO server
        const socket = io('http://localhost:5000'); // Replace with your server's address if different

        // Listen for the 'welcome' event from the server
        socket.on('welcome', (data) => {
            console.log('Server says:', data);
        });

        // Cleanup the socket connection when the component unmounts
        return () => {
            socket.disconnect();
        };
    }, []);

    return (
        <div>
            <h2>Chat Component</h2>
        </div>
    );
}

export default Chat;
