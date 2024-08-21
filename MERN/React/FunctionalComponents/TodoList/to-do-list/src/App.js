import React, { useState } from 'react';
import './App.css';
import Todo from './components/Todo';


// Rendering the React page
function App() {
  const [newTodo, setNewTodo] = useState(""); // Starting value, newTodo --> start value // while the setNewTodo --> change in status
  const [todos, setTodos] = useState([]); // Initial array, current status

  //need to store all todo in array , but this thing isn't efficient
  const handleNewTodoSubmit = (event) => {
    event.preventDefault();
    if (newTodo.length === 0) {
      alert("Please enter a task");
      return;
    }
    const TodoItem = {
      text: newTodo,
      completed: false
    }


    setTodos([...todos, TodoItem]);
    setNewTodo("");
  };

  const handleTodoDelete = (index) => {
    const filteredTodos = todos.filter((_, i) => i !== index);
    setTodos(filteredTodos);
  };

  const updatedTodos = (IDIndex) => {
    // Create a new array with the same length
    const updatedTodo = todos.map((todo, i) => {
      if (i === IDIndex) {
        // To avoid mutating the todo directly
        return { ...todo, completed: !todo.completed };
      }
      // Return the original todo for indices that don't match
      return todo;
    });

    // Update the state with the new array
    setTodos(updatedTodo);
  };


  return (
    <div style={{ textAlign: "center" }}>
      <form onSubmit={handleNewTodoSubmit}>
        <input
          onChange={(event) => setNewTodo(event.target.value)}
          type="text"
          value={newTodo}
        />
        <div>
          <button type="submit">Add</button>
        </div>
      </form>
      <hr></hr>

      {todos.map((todo, i) => {
      return (
          <Todo key={i} todo={todo} updatedTodos={updatedTodos}
           i ={i}
           handleTodoDelete={handleTodoDelete}
           ></Todo>)
      })}
    </div>
  );
}

export default App;
