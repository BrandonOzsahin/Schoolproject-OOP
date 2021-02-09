/*
  This is a generic champion model every champion should be based on their lane and stats.
 */
import java.util.*;
public class Champion {

    private String name;
    private String lane;
    private int health;
    private int mana;

    public Champion(String name, String lane, int health, int mana) // needed to build a champion based on raw stats
    {
        this.name = name;
        this.lane = lane;
        this.health = health;
        this.mana = mana;
    }

    // Below sets and gets the name of a champ
    public void setName(String name) {
        this.name = name;
    }

    public String GetName() {
        System.out.println(name);
        return name;
    }

    // Below sets and gets the lane of a champ and the same formula continues
    public void setLane(String lane) {
        this.lane = lane;
    }

    public String GetLane() {
        System.out.println(lane);
        return lane;
    }


    public void setHealth() {
        this.health = health;
    }

    public Integer GetHealth() {
        System.out.println(health);
        return health;
    }

    public void setMana() {
        this.mana = mana;
    }

    public Integer GetMana() {
        System.out.println(mana);
        return mana;
    }

    public String toString() // toString to organize the name
    {
        return "Champion: " + name + ", " + lane + ", " + "Health: " + health + ", " + "Mana: " + mana;
    }
}
