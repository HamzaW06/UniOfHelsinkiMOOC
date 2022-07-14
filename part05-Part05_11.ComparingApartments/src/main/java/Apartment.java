
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int a1 = (this.squares * this.princePerSquare);
        int a2 = (compared.squares * compared.princePerSquare);
        if (a1 > a2){
            return a1-a2;
        }
        return a2-a1;
    }
    public boolean moreExpensiveThan(Apartment compared) {
        int a1 = (this.squares * this.princePerSquare);
        int a2 = (compared.squares * compared.princePerSquare);
        if (a1 > a2){
            return true;
        }
        return false;
    }
}
