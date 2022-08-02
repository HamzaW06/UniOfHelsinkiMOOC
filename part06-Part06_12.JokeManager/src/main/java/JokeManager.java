import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();

    }
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        Random rand = new Random();
        if (jokes.isEmpty()){
            return("Jokes are in short supply.");

        }
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }
    public void printJokes(){
        jokes.forEach(System.out::println);
    }

}
