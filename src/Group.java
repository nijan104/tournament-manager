public class Group {
    private Team[] teams;
    private int size = 0;

    Group(int size){
        this.teams = new Team[size];
    }

    public void addTeam(Team team){
        this.teams[size++] = team;
    }

    public Team[] getTeams(){
        return this.teams;
    }

}
