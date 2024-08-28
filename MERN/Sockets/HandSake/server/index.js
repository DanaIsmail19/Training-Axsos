const express = require('express');
const http = require('http');
const socketIo = require('socket.io');

const app = express();
const server = http.createServer(app);
const io = socketIo(server); // Initialize socket.io with the server

// Set up a basic route
app.get('/', (req, res) => {
    res.send('Server is running...');
});

// Handle Socket.IO connections
io.on('connection', (socket) => {
    console.log('Nice to meet you. (shake hand)');
    
    // Send a welcome message to the client
    socket.emit('welcome', 'Welcome to the server!');

    // Handle disconnection
    socket.on('disconnect', () => {
        console.log('Client disconnected');
    });
});

// Start the server
const PORT = process.env.PORT || 5000;
server.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
