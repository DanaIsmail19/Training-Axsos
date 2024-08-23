# Ninja Class Implementation

This document provides a detailed description of the `Ninja` class implementation in JavaScript. The `Ninja` class is designed to represent a ninja character with attributes such as `name`, `health`, `speed`, and `strength`. Additionally, the class provides methods to interact with these attributes.

-----------------------------------------------------------------------------------------------
## Features

### 1. Attributes

- name: A string representing the ninja's name.
- health: A numeric value representing the ninja's health.
- speed: A numeric value representing the ninja's speed. Default value is set to `3`.
- strength: A numeric value representing the ninja's strength. Default value is set to `3`.

### 2. Methods

- sayName(): Logs the ninja's name to the console.
- showStats(): Displays the ninja's name, strength, speed, and health in the console.
- drinkSake(): Increases the ninja's health by `10`.

### Key Points:

1. Constructor:
   - Initializes `name` with the provided value.
   - Sets the default `health` to `100`.
   - Sets the default `speed` and `strength` to `3`.

2. sayName() Method:
   - Simply logs the name of the ninja to the console.

3. showStats() Method:
   - Displays the ninja's `name`, `strength`, `speed`, and `health` in a formatted output.

4. drinkSake() Method:
   - Adds `10` to the ninja's `health` attribute each time it's called.

--------------------------------------------------------------------------------

## Conclusion

This `Ninja` class serves as a basic blueprint for creating ninja objects with specific attributes and methods. The provided example demonstrates how to create a ninja, display their stats, and modify their health using the class methods. This implementation can be expanded with additional features as needed.
