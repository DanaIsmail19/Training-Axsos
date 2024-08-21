import React, { useState } from 'react';
import './App.css'; 

const App = () => {
  const [pokemonNames, setPokemonNames] = useState([]);

  const fetchPokemon = async () => {
    try {
      const response = await fetch('https://pokeapi.co/api/v2/pokemon?limit=807');
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      const names = data.results.map(pokemon => pokemon.name);
      setPokemonNames(names);
    } catch (error) {
      console.error("Error fetching the Pokémon data", error);
    }
  };

  return (
    <div className="app-container">
      <button className="fetch-button" onClick={fetchPokemon}>Fetch Pokémon</button>
      <ul className="pokemon-list">
        {pokemonNames.map((name, index) => (
          <li key={index} className="pokemon-list-item">{name}</li>
        ))}
      </ul>
    </div>
  );
};

export default App;
