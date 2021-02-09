public class Renekton extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Renekton(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Renekton's inventory: Dorans shield, refillable potions, Boots, broadswords x2";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Renekton does Physical damage attack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Renekton's role is a bruiser";
        System.out.println(role);
        return role;
    }

}
