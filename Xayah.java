public class Xayah extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Xayah(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Xayah's inventory: BFsword, Boots, Dorans blade, dagger";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Xayah does Physical damage autoattack damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Xayah's role is a Marksmen";
        System.out.println(role);
        return role;
    }

}
