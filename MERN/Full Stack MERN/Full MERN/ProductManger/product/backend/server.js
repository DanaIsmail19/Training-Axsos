const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 8000;

app.use(cors());
app.use(express.json());

// Routes
const productRoutes = require('./server/routes/product.routes');
app.use('/api/products', productRoutes);

const MONGOURL = process.env.MONGO_URL;

// Connect to MongoDB
mongoose.connect((MONGOURL), { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => console.log('Connected to MongoDB'))
  .catch(err => console.error(err));

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));


