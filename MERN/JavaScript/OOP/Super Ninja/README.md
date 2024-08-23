# Sensei Class Implementation

This document provides a detailed description of the `Sensei` class, which extends the `Ninja` class in JavaScript. The `Sensei` class inherits all attributes and methods from the `Ninja` class while introducing additional attributes and methods specific to a Sensei character.

## Features

### 1. Inheritance from Ninja Class

The `Sensei` class extends the `Ninja` class, inheriting the following attributes and methods:

- name: A string representing the Sensei's name.
- health: A numeric value representing the Sensei's health, which is set to `200` by default.
- speed: A numeric value representing the Sensei's speed, which is set to `10` by default.
- strength: A numeric value representing the Sensei's strength, which is set to `10` by default.
- sayName(): Logs the Sensei's name to the console.
- showStats(): Displays the Sensei's name, strength, speed, and health in the console.
- drinkSake(): Increases the Sensei's health by `10`.

### 2. New Attribute

- wisdom: A numeric value representing the Sensei's wisdom. Default value is set to `10`.

### 3. New Method

- speakWisdom(): This method calls the `drinkSake()` method from the `Ninja` class, which increases the Sensei's health by `10`, and then logs a wise message to the console.

### Key Points:

1. Constructor in Sensei:
   - Calls the parent `Ninja` class constructor using `super(name)`.
   - Sets default values for `health` to `200`, `speed` to `10`, `strength` to `10`, and `wisdom` to `10`.

2. speakWisdom() Method:
   - Calls the `drinkSake()` method from the `Ninja` class to increase the Sensei's health by `10`.
   - Logs a wise message to the console.

-----------------------------------------------------------------------
## Conclusion

The `Sensei` class extends the functionality of the `Ninja` class by introducing a new attribute, `wisdom`, and a new method, `speakWisdom()`, which reflects the wisdom and experience of a Sensei character. The provided example demonstrates how to create a Sensei, enhance their stats, and utilize the methods inherited from the `Ninja` class.
