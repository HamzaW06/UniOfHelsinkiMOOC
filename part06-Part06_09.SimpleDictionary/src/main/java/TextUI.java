import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary book;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.book = simpleDictionary;
    }
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("add")){
                String word;
                String translation;

                System.out.println("Word:");
                word = scanner.nextLine();

                System.out.println("Translation:");
                translation = scanner.nextLine();

                book.add(word,translation);
            }
            else if(command.equals("search")){
                String wordTranslated;
                System.out.println("To be translated");
                wordTranslated = scanner.nextLine();

                if (book.translate(wordTranslated) == null){
                    System.out.println("Word " + wordTranslated +" was not found");
                }else{
                    System.out.println(book.translate(wordTranslated));
                }


            }
            else if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else{
                System.out.println("Unknown command");

            }

        }



    }
}
