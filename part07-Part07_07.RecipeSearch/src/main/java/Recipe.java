import java.util.ArrayList;


public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void add(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public void add(String rcp) {
        String[] parts = rcp.split(",");
        this.name = parts[0];
        this.time = Integer.valueOf(parts[1]);
        for (int i = 2; i < parts.length; i++) {
            if (!parts[i].equals("")) {
                this.ingredients.add(parts[i]);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
    
    