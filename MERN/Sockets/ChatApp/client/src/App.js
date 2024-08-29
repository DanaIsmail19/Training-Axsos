import React, { useState } from 'react';
import NameInput from './NameInput';
import Chat from './chat';

function App() {
  const [name, setName] = useState(localStorage.getItem('username') || '');

  return (
    <div>
      {name ? <Chat name={name} /> : <NameInput setName={setName} />}
    </div>
  );
}

export default App;
