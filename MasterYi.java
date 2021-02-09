public class MasterYi extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public MasterYi(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Master Yi's inventory: JungleHunterBlue, Boots, dagger";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Master Yi does Physical damage autoattack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Master Yi's role is a jungle assassin";
        System.out.println(role);
        return role;
    }

}
