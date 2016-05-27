
import jodd.json.JsonParser;
        import jodd.json.JsonSerializer;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.HashMap;
        import java.util.Scanner;

        public class Main {

            static final String SAVE_FILE = "videoGame.json";

            public static void main(String[] args) throws FileNotFoundException {

                while (true) {

                    HashMap videoGame = load(SAVE_FILE);
                    if (videoGame == null) {
                        System.out.println("No file found.");
                        videoGame = new HashMap();
                    }
                    update(videoGame);
                    save(videoGame, SAVE_FILE);
                }
            }

            public static void save(HashMap videoGame, String fileName) {
                File f = new File(fileName);
                JsonSerializer serializer = new JsonSerializer();
                String json = serializer.serialize(videoGame);
                try {
                    FileWriter fw = new FileWriter(f);
                    fw.write(json);
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            public static HashMap load(String fileName) {
                File f = new File(fileName);
                try {
                    Scanner scanner = new Scanner(f);
                    scanner.useDelimiter("\\Z");
                    String contents = scanner.next();
                    JsonParser parser = new JsonParser();
                    return parser.parse(contents);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                return null;

            }

            public static void update(HashMap videoGame) {
                System.out.println("Your current video game template");
                System.out.println(videoGame);


                System.out.println("Would you like to update game info? [Y/N]");
                Scanner choiceScanner = new Scanner(System.in);
                String update = choiceScanner.nextLine();

                if (update.equalsIgnoreCase("y")) {
                    System.out.println("What is the name of the game");

                    String name = choiceScanner.nextLine();
                    System.out.println("What Difficulty");
                    String difficulty = choiceScanner.nextLine();
                    System.out.println("Who is the developer");
                    String developer = choiceScanner.nextLine();
                    System.out.println("What is the genre of the game");
                    String genre = choiceScanner.nextLine();
                    System.out.println("What is the rating of the game");
                    String rating = choiceScanner.nextLine();
                    videoGame.put("name", name);
                    videoGame.put("difficulty", difficulty);
                    videoGame.put("developer", developer);
                    videoGame.put("genre", genre);
                    videoGame.put("rating", rating);
                }
            }
        }
