import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeLineups {

    public static void write(String filename) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write("""
                    10 20 30 Koln
                    20 30 40 Buffola
                    40 50 60 Lever
                    50 60 70 Renne
                    60 70 80 Sion
                    45 23 56 Huston
                    34 67 25 Farbe
                    37 24 79 Belge""");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
