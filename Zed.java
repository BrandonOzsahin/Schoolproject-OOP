public class Zed extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Zed(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Zed's inventory: Serrated dirk, Boots, longsword";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Zed does Physical damage autoattack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Zed's role is a melee assassin";
        System.out.println(role);
        return role;
    }

}
