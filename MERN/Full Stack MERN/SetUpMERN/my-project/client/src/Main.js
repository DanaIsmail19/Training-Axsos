import React, { useEffect, useState } from 'react';
import axios from 'axios';

export default () => {
    const [message, setMessage] = useState("loading...");

    useEffect(() => {
        axios.get('http://localhost:8000/api')
        .then(response => {
            setMessage(response.data.message);
        })
        .catch(error => {
            console.error("There was an error fetching the data!", error);
            setMessage("Error loading message");
        });
    }, []);

    return (
        <div>
            <h2>Message from backend</h2>
            <p>{message}</p> {/* Hello*/}
        </div>
    );
}


