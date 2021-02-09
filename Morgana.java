/*
    This exhibits inheritance the Morgana class extends to champion gaining all the attributes a champion will have
    as well as having something only Morgana would have such as her own individual items.
 */
import java.util.*;
public class Morgana extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Morgana(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Morgana's inventory: Frostfang, refillable potions, Boots of Mobility";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Morgana does Ability power magic damage";
        System.out.println(damage);
        return damage;
    }
    public String GetRole()
    {
        role += "Morgana's role is a support mage";
        System.out.println(role);
        return role;
    }
}
