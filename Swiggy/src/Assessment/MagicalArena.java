package Assessment;

import java.util.Random;
import java.util.Scanner;

class Player {
    int health;
    int strength;
    int attack;
    String name;

    public Player(int health, int strength, int attack, String name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }
    // check if the player is alive
    public boolean isAlive() {
        return this.health > 0;
    }
}

class Die {
    private Random random;
    private int sides;

    public Die(int sides) {
        this.random = new Random();
        this.sides = sides;
    }
    
    // it generates random number between [0 to(sides-1)], so in case of a die  add 1 to adjust the range from [1 to 6]
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}

//the main method initializes two players A and B and a six-sided die
public class MagicalArena {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the 1st player to enter the health, strength and attack for player A
        System.out.println("Enter health, strength, and attack for Player A:");
        int healthA = scanner.nextInt();
        int strengthA = scanner.nextInt();
        int attackA = scanner.nextInt();
        
        // Ask the 2nd player to enter the health, strength and attack for player B
        System.out.println("Enter health, strength, and attack for Player B:");
        int healthB = scanner.nextInt();
        int strengthB = scanner.nextInt();
        int attackB = scanner.nextInt();

        Player playerA = new Player(healthA, strengthA, attackA, "Player A");
        Player playerB = new Player(healthB, strengthB, attackB, "Player B");
        Die die = new Die(6);
        
        // Player with lower health will attack first
        // If both have the same health, player A will be the initial attacker
        Player attacker = playerA.health <= playerB.health ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;
        
        // The game goes on until the health of one of the two players falls to zero or below that which means that the player has died
        while (playerA.isAlive() && playerB.isAlive()) {
            takeTurn(attacker, defender, die);
            if (!defender.isAlive()) {
                System.out.printf("%s has died. %s wins %n", defender.name, attacker.name);
                break;
            }
            // Swap attacker and defender as the players attack and defend alternatively
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        scanner.close();
		

	}
	public static void takeTurn(Player attacker, Player defender, Die die) {
        int attackRoll = die.roll();
        int defendRoll = die.roll();

        int attackDamage = attacker.attack * attackRoll;
        int defendDamage = defender.strength * defendRoll;

        int damageToDefender = attackDamage - defendDamage;
        
        // If the attack is greater than the defense then it will reduce the defenders health 
        if (damageToDefender > 0) {
            defender.health -= damageToDefender;
            System.out.printf("%s attacks %s. Attack roll: %d, Defend roll: %d, Damage: %d. %s's health: %d%n",
                    attacker.name, defender.name, attackRoll, defendRoll, damageToDefender, defender.name, defender.health);
        } else {
            System.out.printf("%s attacks %s. Attack roll: %d, Defend roll: %d. No damage dealt.%n",
                    attacker.name, defender.name, attackRoll, defendRoll);
        }
    }

}
