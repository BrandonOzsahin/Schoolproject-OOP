public class Riven extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Riven(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Riven's inventory: Phage, Boots, Dorans blade,";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Riven does Physical damage autoattack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Riven's role is a melee assassin";
        System.out.println(role);
        return role;
    }

}
