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

### *Run the program in a Java environment.[I used Eclipse IDE]

### Steps to import the Swiggy_Assessment-main Git ZIP file into Eclipse IDE and run the project :


### 1.Extract the ZIP file:

Download and locate the ZIP file on your computer.
Right-click the file and select Extract All or use your preferred extraction tool.
Choose a destination folder for the extracted files.
Open Eclipse and Import the Project:

### 2.Open Eclipse IDE.
Go to File > Import

### 3.Select Import Source:

Select Existing Projects into Workspace and click Next.

### 4.Select Root Directory:

Click Browse and navigate to the folder where you extracted the ZIP file.
Select the folder and ensure that Eclipse detects the project.
Ensure the Copy projects into workspace option is checked if you want to copy the project to your workspace directory.

### 5.Finish Importing:

Ensure the project is selected.
Click Finish.

### 6.Run the Project:

In the Package Explorer, locate your main class file.
Right-click on the file, select Run As > Java Application.

### 7.Provide input 
The console will prompt you to enter the health, strength, and attack values for Player A and Player B.
Enter the values as prompted.
For example- 100, 20, 15 for player A & 120, 10, 10 for player B

The game will proceed with the entered values and declare the winner.


## Conclusion:

By following the above steps, you will create a new Java project in Eclipse IDE and run the MagicalArena game where you can input player attributes and simulate the battle.

