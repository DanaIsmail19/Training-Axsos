import React, { useState } from 'react';
import './Tabs.css'; // Import the CSS file for styling

const Tabs = ({ items }) => {
  // Initialize the active tab state to the first tab
  const [activeTab, setActiveTab] = useState(items[0].label);

  // Function to handle tab clicks
  const handleTabClick = (label) => {
    setActiveTab(label);
  };

  return (
    <div className="tabs-container">
      <div className="tabs-headers">
        {items.map((item) => (
          <div
            key={item.label}
            className={`tab-header ${activeTab === item.label ? 'active' : ''}`}
            onClick={() => handleTabClick(item.label)}
          >
            {item.label}
          </div>
        ))}
      </div>
      <div className="tab-content">
        {items
          .filter((item) => item.label === activeTab)
          .map((item) => (
            <div key={item.label}>{item.content}</div>
          ))}
      </div>
    </div>
  );
};

export default Tabs;
