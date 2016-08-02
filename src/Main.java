
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static final String GAME = "videoGame.json";
    public static void main(String[] args) {

        HashMap game = new HashMap();
        Scanner choiceScanner = new Scanner(System.in);


            System.out.println("Enter name");
            String name = choiceScanner.nextLine();
            System.out.println("Enter Difficulty ");
            String difficulty = choiceScanner.nextLine();
            System.out.println("Enter Genre");
            String genre = choiceScanner.nextLine();
            System.out.println("Enter Developer");
            String developer = choiceScanner.nextLine();
            System.out.println("Enter Rating");
            String rating = choiceScanner.nextLine();
            game.put("Name", name);
            game.put("Difficulty", difficulty);
            game.put("Genre", genre);
            game.put("Developer", developer);
            game.put("Rating", rating);


        save(game, GAME);
    }



    public static void save(HashMap game, String fileName) {
        File f = new File(fileName);
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(game);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
