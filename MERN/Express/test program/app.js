// import express
// import { Request, Response } from 'express';

const express = require('express')
const app = express ()

app.use(express.json())

const users = []

// HTTP method , endpoint classification
// GET - Retrive Data
//make a welcome page (wwlcome home)

app.get('/', (req, res) => {
    res.send('Welcome Home')
    })

app.get('/users',(req ,res) => {
    if(users.length == 0)
    {
        res.status(404).send('No User Found')
        return
    }
    res.status(200).send(users)
})

// POST -Create Data
app.post('/users', (req ,res) =>
{
    //try to find user
    const user = req.body
    //check if user already exists
    if(users.find(u => u.id === user.id))
        {
            res.status(400).send('User Already Exists')
            return
        }
    //pass the value into user array
    users.push(req.body)
    res.status(201).send('Data Created')
})

// PUT -
// DELETE - need to delete user by Id
 app.delete('/users/:id', (req, res) => {
    const id = req.params.id
    const index = users.findIndex(user => user.id === id)
    if(index === -1)
        {
            res.status(404).send('User Not Found')
            return
        }
        users.splice(index, 1)
        res.status(200).send('User Deleted')
        })

//need listing port 2421
const port = 2421
app.listen(port, () => {
    console.log(`Server is running on port ${port}`
)})