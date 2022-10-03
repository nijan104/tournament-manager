import javax.swing.*;

public class GroupsDisplayGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel groupA;
    private JLabel groupB;
    private JLabel teamNameA1;
    private JLabel teamNameA2;
    private JLabel teamNameA3;
    private JLabel teamNameA4;
    private JLabel teamNameB1;
    private JLabel teamNameB2;
    private JLabel teamNameB3;
    private JLabel teamNameB4;
    private JLabel teamA1Sets;
    private JLabel teamA2Sets;
    private JLabel teamA3Sets;
    private JLabel teamA4Sets;
    private JLabel teamB1Sets;
    private JLabel teamB2Sets;
    private JLabel teamB3Sets;
    private JLabel teamB4Sets;
    private JLabel teamA1Points;
    private JLabel teamA2Points;
    private JLabel teamA3Points;
    private JLabel teamA4Points;
    private JLabel teamB1Points;
    private JLabel teamB2Points;
    private JLabel teamB3Points;
    private JLabel teamB4Points;
    private JLabel match1;
    private JLabel match1Sets;
    private JLabel match1Points;
    private JLabel match1Time;
    private JButton enterMatchResultButton;
    private JCheckBox checkBox1;

    GroupsDisplayGUI(Group[] groups){
        super("Groupstage");

        String teamA1 = groups[0].getTeams()[0].getName();
        String teamA2 = groups[0].getTeams()[1].getName();
        String teamA3 = groups[0].getTeams()[2].getName();
        String teamA4 = groups[0].getTeams()[3].getName();
        String teamB1 = groups[1].getTeams()[0].getName();
        String teamB2 = groups[1].getTeams()[1].getName();
        String teamB3 = groups[1].getTeams()[2].getName();
        String teamB4 = groups[1].getTeams()[3].getName();


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.teamNameA1.setText(teamA1);
        this.teamNameA2.setText(teamA2);
        this.teamNameA3.setText(teamA3);
        this.teamNameA4.setText(teamA4);
        this.teamNameB1.setText(teamB1);
        this.teamNameB2.setText(teamB2);
        this.teamNameB3.setText(teamB3);
        this.teamNameB4.setText(teamB4);
        this.match1.setText(teamA1 + " : " + teamA3);
        this.pack();
    }
}
