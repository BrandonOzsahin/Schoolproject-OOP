import java.util.*;
import java.io.*;
import java.text.*;
public class Mockgame {
    public static void main(String[] args){
        // below creates all the players
        Player p1 = new Player("Cloud9", "Vulcan", "Morgana", "flash/exhaust" ,1250, "00/01/03");
        Player p2 = new Player("Cloud9", "Zven", "Xayah", "flash/heal" ,1500, "02/00/01");
        Player p3 = new Player("Cloud9", "Nisqy", "Mordekaiser", "flash/exhaust" ,800, "01/01/00");
        Player p4 = new Player("Cloud9", "Licorice", "Renekton", "teleport/flash" ,1530, "00/00/00");
        Player p5 = new Player("Cloud9", "Blaber", "Master Yi", "flash/smite" ,900, "01/01/01");

        Player op1 = new Player("SKT-1", "Effort", "Leona", "flash/ignite" ,503, "00/02/01");
        Player op2 = new Player("SKT-1", "Teddy", "Jhin", "flash/heal" ,1050, "01/01/01");
        Player op3 = new Player("SKT-1", "Faker", "Zed", "flash/ignite" ,1500, "01/01/01");
        Player op4 = new Player("SKT-1", "Khan", "Riven", "flash/teleport" ,1550, "00/00/00");
        Player op5 = new Player("SKT-1", "Clid", "Fiddlesticks", "flash/smite" ,100, "01/00/02");
        // below creates all the champions
        Morgana s1 = new Morgana("Morgana", "BotSupport", 890, 600);
        Xayah s2 = new  Xayah("Xayah", "BotADC", 980, 350);
        Mordekaiser s3 = new Mordekaiser("Mordekaiser", "Mid", 1100, 210);
        Renekton s4 = new Renekton("Renekton", "Top", 1250, 55);
        MasterYi s5 = new MasterYi("Master Yi", "Jungle", 980, 420);

        Leona os1 = new Leona("Leona", "BotSupport", 1350, 550);
        Jhin os2 = new Jhin("Jhin", "BotADC", 985, 436);
        Zed os3 = new Zed("Zed", "Mid", 975, 200);
        Riven os4 = new Riven("Riven", "Top", 950, 0);
        Fiddlesticks os5 = new Fiddlesticks("Fiddlesticks", "Jungle", 900, 780);

        // below creates the team from the interface
        Cloud9 ex = new Cloud9("Cloud9");
        SKT1 ex2 = new SKT1("SKT-1");
        System.out.println("=========BlueTeam========");
        System.out.println(ex);
        ex.getRegion();
        ex.getScore();
        ex.getFanbase();
        ex.getPlayers();
        System.out.println(p1);
        System.out.println(s1);
        s1.GetItem();
        s1.GetDmg();
        System.out.println("========RedTeam=========");
        System.out.println(ex2);
        ex2.getRegion();
        ex2.getScore();
        ex2.getFanbase();
        ex2.getPlayers();

    }
}
