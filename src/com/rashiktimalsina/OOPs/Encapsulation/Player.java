package com.rashiktimalsina.OOPs.Encapsulation;

public class Player {
    private String p_name;
    private int health=100;
    private String weapon;

    public Player(String p_name, int health, String weapon) {
        this.p_name = p_name;
        if(health>0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }

}
