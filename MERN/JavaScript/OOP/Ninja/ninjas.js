class Ninja {
    constructor(name) {
      this.name = name;
      this.health = 100; 
      this.speed = 3; // default speed value
      this.strength = 3; // default strength value
    }

    sayName() {
      console.log(`My name is ${this.name}`);
    }
  
    // Method to show the Ninja's stats
    showStats() {
      console.log(`Name: ${this.name}`);
      console.log(`Strength: ${this.strength}`);
      console.log(`Speed: ${this.speed}`);
      console.log(`Health: ${this.health}`);
    }
  
    // Method to increase the Ninja's health by 10
    drinkSake() {
      this.health += 10;
      console.log(`${this.name} drinks sake and recovers 10 health.`);
    }
  }
  
  // Example usage:
  const ninja1 = new Ninja("Dana");
  ninja1.sayName(); 
  ninja1.showStats();

  ninja1.drinkSake();
  ninja1.showStats();

  