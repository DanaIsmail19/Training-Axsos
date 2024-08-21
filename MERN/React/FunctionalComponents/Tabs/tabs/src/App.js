
import React from 'react';
import Tabs from './Tabs';


const App = () => {
  const tabItems = [
    { label: 'Tab 1', content: 'Content for Tab 1' },
    { label: 'Tab 2', content: 'Content for Tab 2' },
    { label: 'Tab 3', content: 'Content for Tab 3' }
  ];

  return (
    <div className="App">
      <h1>Tabs Component</h1>
      <Tabs items={tabItems} />
    </div>
  );
};

export default App;
