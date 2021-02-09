/*
    A generic for player these "players" will have access to:
    gold the lane they play in and the team and score they have.
    similarly built like the champion class
    however this can be repeated for every person since thats all that would change
 */
import java.util.*;
public class Player {
    private String name;
    private String champ;
    private int gold;
    private String score;
    private String team;
    private String summoner;

    public Player(String team, String name, String champ, String summoner, int gold, String score) {
        this.name = name;
        this.champ = champ;
        this.summoner = summoner;
        this.gold = gold;
        this.score = score;
        this.team = team;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getChamp() {
        System.out.println(champ);
        return champ;
    }

    public String getTeam() {
        System.out.println(team);
        return team;
    }

    public String getSummoner() {
        System.out.println(summoner);
        return summoner;
    }

    public void setGold() {
        this.gold = gold;
    }
    public Integer GetGold() {
        System.out.println(gold);
        return gold;
    }


    public String GetScore() {
        System.out.println(score);
        return score;
    }

    public String toString() // toString to organize the name
    {
        return "Team: "+  team +", " +"Player: " + name + ", " + "Champion: " + champ +", " +"Summoner spells: " + summoner +", " + "Gold: " + gold + ", " + "Score: " + score + " ";
    }

}
