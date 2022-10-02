import java.util.ArrayList;

public class Turniermanager {
    public static void main(String[] args) {
        System.out.println("Initializing");
        Player Hans = new Player(25);
        Player Peter = new Player(65);
        Player Lustig = new Player(45);
        Player Benny = new Player(91);

        Team Holzbeine = new Team();

        Holzbeine.addPlayer(Hans);
        Holzbeine.addPlayer(Peter);
        Holzbeine.addPlayer(Lustig);
        Holzbeine.addPlayer(Benny);

        ArrayList<Player> lineupDreamteam = new ArrayList<>(3);
        lineupDreamteam.add(Benny);
        lineupDreamteam.add(Peter);
        lineupDreamteam.add(Lustig);

        Team Dreamteam = new Team(lineupDreamteam);

        System.out.println(Holzbeine.getMmr());
        System.out.println(Dreamteam.getMmr());
        Dreamteam.addPlayer(Hans);
        Dreamteam.addPlayer(Benny);
        Player Jonny = new Player(32);
        Dreamteam.addPlayer(Jonny);
        Player Codi = new Player(77);
        Dreamteam.addPlayer(Codi);

        System.out.println("Hier gehts los:");
        writeLineups.write("lineups.txt");

        ArrayList<Team> teams = createTeams.create("lineups.txt");
        for (Team team : teams){
            System.out.println(team.getName() + " " + team.getMmr());
        }

    }
}
