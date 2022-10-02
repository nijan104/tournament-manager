import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class createTeams {

    public static ArrayList<Team>  create(String filename) {
        ArrayList<Team> teams = new ArrayList<>(8);

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while((line = reader.readLine()) != null){
                ArrayList<Player> lineup = new ArrayList<>(3);
                lineup.add(new Player(Integer.parseInt(line.substring(0,2))));
                lineup.add(new Player(Integer.parseInt(line.substring(3,5))));
                lineup.add(new Player(Integer.parseInt(line.substring(6,8))));
                String name = line.substring(9);


                teams.add(new Team(lineup, name));


            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        return teams;

    }
}
