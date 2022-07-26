public class Gift {
    private int weightOfGift;
    private String name;

    public Gift(String name, int weightOfGift) {
        this.weightOfGift = weightOfGift;
        this.name = name;
    }
    public int getWeight(){
        return this.weightOfGift;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return name + " (" + this.weightOfGift + " kg)";
    }
}
