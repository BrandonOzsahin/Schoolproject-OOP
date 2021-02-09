public class Mordekaiser extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Mordekaiser(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Mordekaiser's inventory: Dorans shield, haunting guise";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Mordekaiser does Ability power magic damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Mordekaiser's role is a Bruiser";
        System.out.println(role);
        return role;
    }

}
