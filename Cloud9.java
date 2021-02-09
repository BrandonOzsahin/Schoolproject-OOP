/*
    This uses the team interface  to create cloud 9 a team
 */
import java.util.*;
public class Cloud9 implements Team{
    private int score = -1;
    private int players = 5;
    private String region = "";
    private String name;

    public Cloud9(String name)
    {
       this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getRegion() {
        region += "Based: North America";
        System.out.println(region);
    }

    @Override
    public void getScore() {
        System.out.println(name+ "'s " +  "score is: " + score);
    }

    @Override
    public void getFanbase() {
        if(score > 0 && score >= 1){
            System.out.println("They are popular!");
        }
        else{
            System.out.println("They are the underdog!");
        }

    }

    @Override
    public void getPlayers() {
        System.out.println("Amount of players: "+ players);
    }
    public String toString() // toString to organize the name
    {
        return "Team name: "+  name;
    }
}
