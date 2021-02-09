public class Leona extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Leona(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Leona's inventory: Relic shield, cloth armor, mercurial treads";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Leona does Physical damage autoattack damage and also Ability Power Magic damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Leona's role is a support tank";
        System.out.println(role);
        return role;
    }

}
