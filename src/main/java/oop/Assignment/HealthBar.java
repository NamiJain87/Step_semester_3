package main.java.oop.Assignment;

public class HealthBar {

    private int health;
    private final int maxHealth;

    public HealthBar(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int damage) {
        health = health - damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {

        HealthBar player = new HealthBar(100);

        System.out.println("Health: " + player.getHealth());

        player.takeDamage(30);
        System.out.println("After damage: " + player.getHealth());

        player.heal(50);
        System.out.println("After healing: " + player.getHealth());

        player.takeDamage(200);
        System.out.println("After heavy damage: " + player.getHealth());
    }
}