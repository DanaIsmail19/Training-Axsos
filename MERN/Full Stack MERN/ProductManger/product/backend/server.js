require('dotenv').config()
const express = require('express')
const workoutRoutes = require ("./routes/workouts")

const app = express()

//APP .USE
app.use((req , res , next)=>{
    console.log(req.path,req.method)
    next()
})

// now need react to the request , need route handler
app.use()

//listen for requests
app.listen(process.env.PORT , () =>{
    console.log('listen on port 4000')
})