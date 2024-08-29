const express = require('express');
const http = require('http');
const mongoose = require('mongoose');
const socketIo = require('socket.io');
const cors = require('cors');

const app = express();
const server = http.createServer(app);
const io = socketIo(server, {
  cors: {
    origin: "http://localhost:3000",
    methods: ["GET", "POST"]
  }
});

app.use(cors());
app.use(express.json());
const MONGOURL = process.env.MONGO_URL;

// Connect to MongoDB
mongoose.connect((MONGOURL), {
  useNewUrlParser: true,
  useUnifiedTopology: true,
}).then(() => console.log('MongoDB connected'))
  .catch(err => console.error(err));

// Handle socket connections
io.on('connection', (socket) => {
    socket.on('join', (username) => {
      socket.broadcast.emit('join', username);
    });
  
    socket.on('message', (data) => {
      io.emit('message', data);
    });
  
    socket.on('disconnect', () => {
      console.log('Client disconnected:', socket.id);
    });
  });
  

const PORT = process.env.PORT || 5000;
server.listen(PORT, () => console.log(`Server running on port ${PORT}`));
