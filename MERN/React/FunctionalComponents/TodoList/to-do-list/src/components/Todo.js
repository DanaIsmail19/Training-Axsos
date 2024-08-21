import React from 'react';
import './Todo.css'; // Assuming you will create a separate CSS file for Todo

const Todo = (props) => {
    const todoClasses = ["todo-item"];
    if (props.todo.completed) {
        todoClasses.push("completed");
    }

    return (
        <div className="todo-container">
            <input 
                onChange={() => props.updatedTodos(props.i)}
                checked={props.todo.completed}
                type='checkbox'
                className="todo-checkbox"
            />
            <span className={todoClasses.join(" ")}>{props.todo.text}</span>
            <button
                onClick={() => props.handleTodoDelete(props.i)}
                className="todo-delete-btn"
            >
                Delete
            </button>
        </div>
    );
};

export default Todo;
