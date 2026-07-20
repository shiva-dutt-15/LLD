package Aggregation;

import java.util.ArrayList;
import java.util.List;

class Team{
    String teamName;
    List<Player> players = new ArrayList<>();

    Team(String teamName){
        this.teamName = teamName;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void showPlayers(){
        System.out.println("Team has players:");

        for(Player p: players){
            System.out.println("- " + p.name);
        }
    }

}