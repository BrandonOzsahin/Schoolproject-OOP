public class Fiddlesticks extends Champion {

    private String item = ""; // removes null from string
    private String damage = "";
    private String role = "";

    public Fiddlesticks(String name, String lane, int health, int mana) {
        super(name, lane, health, mana);

    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String GetItem() {
        item += "Fiddlestick's inventory: Stalkers blade, Boots, amplifying tome";
        System.out.println(item);
        return item;
    }

    public String GetDmg()
    {
        damage += "Fiddlesticks does Ability power magic damage";
        System.out.println(damage);
        return damage;
    }

    public String GetRole()
    {
        role += "Fiddlesticks's role is a jungle mage";
        System.out.println(role);
        return role;
    }

}
