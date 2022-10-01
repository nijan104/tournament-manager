import java.util.ArrayList;

public class Team {
    private int mmr = 0;
    private int players = 0;
    private final int playerCap = 5;
    private ArrayList<Player> lineup = new ArrayList<>(playerCap);


    Team(){

    }

    Team(ArrayList<Player> lineup){
        this.players = lineup.size();
        this.lineup = lineup;
        mmr = 0;
        for (Player player : lineup) {
            mmr += player.getMmr();
        }
    }

    public void addPlayer(Player p){
        if (this.players < playerCap) {
            if (!this.lineup.contains(p)) {
                this.players++;
                this.mmr += p.getMmr();
                this.lineup.add(p);
            }
            else{
                System.out.println("Der Spieler ist bereits Teil des Teams");
            }
        }
        else{
            System.out.println("Die maximale Spieleranzahl ist bereits erreicht");
        }
    }

    public void removePlayer(Player p){
        if (this.lineup.remove(p)){
            this.players--;
            this.mmr -= p.getMmr();
        }
        else{
            System.out.println("Der Spieler gehörte nicht zum Team");
        }
    }

    public int getMmr(){
        return this.mmr;

    }
}
