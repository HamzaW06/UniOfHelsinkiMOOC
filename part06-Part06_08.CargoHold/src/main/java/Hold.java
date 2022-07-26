import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();

    }
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        for (Suitcase temp: suitcases){
            totalWeight += temp.totalWeight();
        }
        if ((totalWeight + suitcase.totalWeight()) <= maxWeight){
            suitcases.add(suitcase);
        }
    }
    public String toString(){
        int totalWeight = 0;
        int numSuitcases = suitcases.size();
        for (Suitcase temp: suitcases){
            totalWeight += temp.totalWeight();
        }
        return numSuitcases + " suitcases (" + totalWeight + " kg)";
    }
    public void printItems(){
        for (Suitcase sc: suitcases){
            sc.printItems();

        }
    }

}
