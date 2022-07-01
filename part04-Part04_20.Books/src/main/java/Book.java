public class Book {
    private String title;
    private int pCount;
    private int pYear;

    public Book(String title, int pCount, int pYear) {
        this.title = title;
        this.pCount = pCount;
        this.pYear = pYear;
    }

    public String getName(){
        return title;
    }

    public void setBookTitle(String newBook){
        this.title = newBook;
    }


    public String getEverything() {
        return title + ", " + pCount + " pages, " + pYear;
    }

}
