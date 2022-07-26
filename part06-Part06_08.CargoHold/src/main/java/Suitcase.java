import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    public void addItem(Item item){
        int totalWeight = 0;
        for (Item temp: items){
            totalWeight += temp.getWeight();
        }
        if ((totalWeight + item.getWeight()) <= maxWeight){
            items.add(item);
        }

    }
    public String toString(){
        int numItems = items.size();
        int totalWeight = 0;
        for (Item temp: items){
            totalWeight += temp.getWeight();
        }
        if (items.isEmpty()){
            return "no items (0 kg)";
        }
        if (items.size() == 1){
            return numItems + " item (" + totalWeight + " kg)";
        }
        return numItems + " items (" + totalWeight + " kg)";
    }
    public void printItems(){
        items.forEach(System.out::println);
    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Item temp: items){
            totalWeight += temp.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item returnItem = items.get(0);
        for (Item temp: items){
            if (returnItem.getWeight() < temp.getWeight()){
                returnItem = temp;
            }
        }
        return returnItem;
    }

}
