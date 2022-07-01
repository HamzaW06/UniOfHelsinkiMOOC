import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true){
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pageCount = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int pubYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pageCount, pubYear));
        }

        System.out.println("What information will be printed?");
        String request = scanner.nextLine();

        for (Book book: bookList){
            if(request.equals("everything")){
                System.out.println(book.getEverything());
            }else if(request.equals("name")){
                System.out.println(book.getName());
            }
        }

    }
}
