# Swiggy_Assessment
The task was to design a Magic Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0. 

Two player will fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

## Explanation of the code:

### Player Class:

The Player class represents a player with 'health', 'strength', 'attack' attributes.
Includes the 'name' attribute to identify players.
The 'isAlive' method checks if the player's health is greater than 0.

### Die Class:

The Die class simulates a die with a specified number of sides.
The roll method returns a random integer between 1 and the number of sides.

### MagicalArena Class:

1.User Input: The Scanner class is used to take input from the user for the health, strength, and attack attributes of both players.

2.Player Initialization: Players are initialized with the input values.

3.Game Loop: The initial attacker is determined based on which player has lower health. If both have the same health, playerA will be the initial attacker.
Players attack each other in turns until one player's health drops to 0 or below.


The takeTurn method handles the attack and defense rolls, calculates the damage, and updates the defender's health.


### Output:

The program will output the results of each turn, showing who attacks, the attack and defense rolls, the damage dealt, and the defender's remaining health.
The game ends with a message declaring the winner.

## How to Use:

*Run the program in a Java environment.[I used Eclipse IDE]

