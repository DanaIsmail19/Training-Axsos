class Ninja {
    constructor(name) {
      this.name = name;
      this.health = 100; 
      this.speed = 3; 
      this.strength = 3; 
    }
  
    sayName() {
      console.log(`My name is ${this.name}`);
    }
  
    showStats() {
      console.log(`Name: ${this.name}`);
      console.log(`Strength: ${this.strength}`);
      console.log(`Speed: ${this.speed}`);
      console.log(`Health: ${this.health}`);
    }

    drinkSake() {
      this.health += 10;
      console.log(`${this.name} drinks sake and recovers 10 health.`);
    }
  }
  
  // Sensei class definition
  class Sensei extends Ninja {
    constructor(name) {
      super(name);
      this.health = 200; 
      this.speed = 10; 
      this.strength = 10; 
      this.wisdom = 10; 
    }
  
    speakWisdom() {
      this.drinkSake(); 
    }
    showStats() {
      super.showStats(); 
      console.log(`Wisdom: ${this.wisdom}`);
    }
  }
  const superSensei = new Sensei("Dana");
  superSensei.speakWisdom();
  superSensei.showStats();
 
  