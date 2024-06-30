package Assessment;

import java.util.Random;

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


public class MagicalArena {

	public static void main(String[] args) {
		

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
