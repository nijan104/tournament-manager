import java.util.ArrayList;
import java.util.Random;

public class createGroups {

    public static Group[] create(ArrayList<Team> teams){
        Group groupA = new Group(4);
        Group groupB = new Group(4);
        Group[] groups = new Group[2];
        groups[0] = groupA;
        groups[1] = groupB;
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            if (random.nextInt() < 0){
                groupA.addTeam(teams.get(2*i));
                groupB.addTeam(teams.get(2*i+1));
            }
            else {
                groupA.addTeam(teams.get(2*i+1));
                groupB.addTeam(teams.get(2*i));
            }
        }
        System.out.println("Gruppe A:");
        for (Team team : groupA.getTeams()){
            System.out.println(team.getName());
        }
        System.out.println("Gruppe B");
        for (Team team : groupB.getTeams()){
            System.out.println(team.getName());
        }
        return groups;
    }
}
