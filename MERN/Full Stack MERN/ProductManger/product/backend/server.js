require('dotenv').config();
const express = require('express');
const mongoose = require('mongoose');
const workoutRoutes = require('./server/routes/product.routes');

const app = express();

//APP .USE
app.use((req, res, next) => {
    console.log(req.path, req.method);
    next();
});

// Now need react to the request, need route handler
app.use('/api/workouts', workoutRoutes);

// Connect to db
mongoose.connect(process.env.MONGODB_URI)
    .then(() => { 
        // Listen for requests
        app.listen(process.env.PORT, () => {
            console.log(`Listening on port ${process.env.PORT}`);
        });
    })
    .catch((err) => {
        console.error('Unable to connect to database:', err);
    });
