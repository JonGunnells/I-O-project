import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap game = new HashMap();

        game.put("name", "Doom");
        game.put("difficulty", "hard");
        game.put("genre", "Horror");
        game.put("developer", "io Studios");
        game.put("rating", "mature");


        Game person2 = new Game();

        File f = new File("VideoGame.json");


        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(game);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\z");
        String contents = scanner.next();
        JsonParser parser = new JsonParser();

        Game person3 = parser.parse(contents, Game.class);
        System.out.println(person3);

    }
}