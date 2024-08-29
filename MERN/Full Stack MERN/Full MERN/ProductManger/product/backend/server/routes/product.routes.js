const express = require('express');
const ProductController = require('../controllers/product.controller');

const router = express.Router();

// Define the route for creating a product
router.post('/', ProductController.createProduct);

// Export the router
module.exports = router;
