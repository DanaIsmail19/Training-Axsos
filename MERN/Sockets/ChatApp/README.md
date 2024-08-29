# MERN Chat Application

This project is a simple real-time chat application built using the MERN stack (MongoDB, Express, React, Node.js) along with Socket.io for real-time communication. The application allows multiple users to join a chat room, send messages, and see messages from other users in real-time.

## Features

- User Authentication: Users can enter a name to join the chat.
- Real-Time Messaging: Messages are broadcast to all users in real-time.
- Chat History: Users can see the messages that were sent before they joined the chat.
- User Notifications: Users are notified when someone joins the chat.
- Auto Scroll: The chat window automatically scrolls to the latest message.

## Project Structure

- `server/`: Contains the Node.js and Express server code.
- `client/`: Contains the React application code.

## Prerequisites

To run this project locally, you need to have the following installed:

- Node.js
- npm (Node Package Manager)
- MongoDB

## Installation

### 1. Clone the Repository

git clone https://github.com/your-username/mern-chat-app.git
cd mern-chat-app

### 2. Install Dependencies

server:

cd server
npm install

client:

cd client
npm install

### 3. Start MongoDB

Make sure MongoDB is running on your local machine. You can start MongoDB using the following command:
mongod

### 4. Run the Application

Backend:

cd server
node server.js

Frontend:

cd client
npm start

The application should now be running on `http://localhost:3000`.

## Usage

1. Open `http://localhost:3000` in your browser.
2. Enter a name to join the chat.
3. Start sending and receiving messages in real-time.
4. Open another browser window or tab to simulate another user joining the chat.

## Screenshots

Here are some screenshots of the application in action:

### 1. Chat Interface

![Chat Interface]![Screenshot 2024-08-29 105600](https://github.com/user-attachments/assets/b12fc8e0-e662-4f9e-9015-158c398a0378)

### 2. Server Console
![Server Console]![Screenshot 2024-08-29 105813](https://github.com/user-attachments/assets/58912d3b-7066-42b9-a4eb-796f506c54f3)

## Contributing

If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.
