# It's Time to Duel - Card Game Simulation

This document provides a simple guide to creating and using `Unit` and `Effect` classes in a card game scenario. The scenario involves playing out actions with two units and three effects as described.

## Classes Overview

### 1. Unit Class

The `Unit` class represents a unit card in the game with the following attributes:

- name: The name of the unit (e.g., "Red Belt Ninja").
- cost: The cost to play the unit.
- power: The power value of the unit.
- resilience: The resilience value of the unit.

Methods:
- attack(target): Reduces the resilience of the target unit by this unit's power.

### 2. Effect Class

The `Effect` class represents an effect card in the game with the following attributes:

- name: The name of the effect (e.g., "Hard Algorithm").
- cost: The cost to play the effect.
- text: A description of what the effect does.
- stat: The stat that the effect modifies (e.g., "resilience" or "power").
- magnitude: The magnitude by which the stat is modified.

Methods:
- play(target): Applies the effect to the target unit.

## Scenario Setup and Execution

### 1. Create Unit Instances

```javascript
const redBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);
```

### 2. Create Effect Instances

```javascript
const hardAlgorithm = new Effect("Hard Algorithm", 2, "increase target's resilience by 3", "resilience", 3);
const unhandledPromiseRejection = new Effect("Unhandled Promise Rejection", 1, "reduce target's resilience by 2", "resilience", -2);
const pairProgramming = new Effect("Pair Programming", 3, "increase target's power by 2", "power", 2);
```

### 3. Play Out the Scenario

1. Turn 1:
   - Play `Red Belt Ninja`.
   - Apply `Hard Algorithm` on `Red Belt Ninja` to increase its resilience by 3.

2. Turn 2:
   - Play `Black Belt Ninja`.
   - Apply `Unhandled Promise Rejection` on `Red Belt Ninja` to reduce its resilience by 2.

3. Turn 3:
   - Apply `Pair Programming` on `Red Belt Ninja` to increase its power by 2.
   - `Red Belt Ninja` attacks `Black Belt Ninja`.

### 4. Final Stats

- Red Belt Ninja: Power: 5, Resilience: 5
- Black Belt Ninja: Power: 5, Resilience: -1 (Defeated)

-------------------------------------------------------------------------------
## Conclusion

This README outlines the basic setup and gameplay for a simple card game scenario using the `Unit` and `Effect` classes. The scenario demonstrates how to create instances of units and effects, and how to apply those effects to simulate a duel between two ninja characters.
