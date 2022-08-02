import java.util.Scanner;

public class UserInterface {
    private JokeManager registry;
    private Scanner scanner;

    public UserInterface(JokeManager registry, Scanner scanner) {
        this.registry = registry;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Commands: \n1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop");
            String command = scanner.nextLine();
            if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                registry.addJoke(joke);
            }else if (command.equals("2")){
                System.out.println(registry.drawJoke());
            }else if(command.equals("3")){
                registry.printJokes();
            }else if(command.equals("X")){
                break;
            }

        }
    }
}
