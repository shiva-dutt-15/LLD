package Aggregation;

class AggregationDemo{
    public static void main(String[] args){
        Player p1 = new Player("Don");
        Player p2 = new Player("Kreig");

        Team team = new Team("Doom");
        team.addPlayer(p1);
        team.addPlayer(p2);
        team.showPlayers();

    }
}