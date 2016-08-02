import java.util.Arrays;


public class Game {
    static int fieldSize = 10;
    public String name;
    public String difficulty;
    public String genre;
    public String developer;
    public String rating;
    public Game[] field = new Game[fieldSize];

    public Game() {

    }

    public Game(String name, String difficulty, String genre, String developer, String rating) {
        this.name = name;
        this.difficulty = difficulty;
        this.genre = genre;
        this.developer = developer;
        this.rating = rating;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", genre='" + genre + '\'' +
                ", developer='" + developer + '\'' +
                ", rating='" + rating + '\'' +
                ", field=" + Arrays.toString(field) +
                '}';
    }
}


