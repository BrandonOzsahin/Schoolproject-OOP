public class Jhin extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Jhin(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Jhin's inventory: BFsword, Boots, Dorans blade";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Jhin does Physical damage autoattack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Jhin's role is a Marksmen";
        System.out.println(role);
        return role;
    }

}
