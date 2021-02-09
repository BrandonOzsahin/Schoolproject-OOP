import java.util.*;

public class game {
    private ArrayList<Player> Player;
    private ArrayList<Champion> Champion;

    public game() {
        Player = new ArrayList<Player>();
        Champion = new ArrayList<Champion>();
    }

    public void AddPlayer(Player c9) {
        Player.add(c9);
    }

    public void AddChamp(Champion ch) {
        Champion.add(ch);
    }

    public String toString() {
        String str = "League of legends game\n";
        return str;
    }
}
