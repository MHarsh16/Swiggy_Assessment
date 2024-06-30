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
		// TODO Auto-generated method stub

	}

}
