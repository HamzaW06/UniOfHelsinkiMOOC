import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        readFile();
        showCommands();
        while (true) {
            String cmd = askCommand();
            int check = readCommand(cmd);
            if (check == -1) {
                break;
            }
        }

    }

    public void readFile() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        String recipes = "";
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                if (line.equals("")) {
                    recipes += line + "\n";
                } else {
                    recipes += line + ",";
                }

            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        addToCollection(recipes);

    }

    public void showCommands() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    public String askCommand() {
        System.out.print("Enter command: ");
        return askWord();
    }

    public int readCommand(String cmd) {
        if (cmd.equals("list")) {
            listCmd();
            return 1;
        }

        if (cmd.equals("stop")) {
            return -1;
        }

        if (cmd.equals("find name")) {
            findCmd();
            return 1;
        }

        if (cmd.equals("find cooking time")) {
            findTimeCmd();
            return 1;
        }

        if (cmd.equals("find ingredient")) {
            findIngredientCmd();
            return 1;
        }

        return 1;
    }

    public void addToCollection(String recipesRead) {

        String[] recipe = recipesRead.split("\n");
        for (int i = 0; i < recipe.length; i++) {
            Recipe newRec = new Recipe();
            newRec.add(recipe[i]);
            this.recipes.add(newRec);
        }
    }

    public void listCmd() {
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void findCmd() {
        System.out.print("Searched word :");
        String wrd = askWord();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(wrd)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public String askWord() {
        String word = scanner.nextLine();
        return word;
    }

    public void findTimeCmd() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(askWord());
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if(recipe.getTime() <= time){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void findIngredientCmd(){
        System.out.print("Igredient: ");
        String ingr = askWord();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if(recipe.getIngredients().contains(ingr)){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
}