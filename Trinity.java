/*
Trinity by Ian Smith

Trinity's base class, which handles all user input, and routes commands.
*/
import java.util.Scanner;
public class Trinity {
    public static void main(String[] args) {
        Engine trinity = new Engine(1);
        Scanner scan = new Scanner(System.in);
        String input;
        // Handle any arguments that were passed.
        do{
            input = scan.nextLine();
            switch(input){
                case "protocol_version":
                    System.out.println(trinity.getProtocolVersion() + "\n");
                    break;
                case "name":
                    System.out.println(trinity.getName() + "\n");
                    break;
                case "version":
                    System.out.println(trinity.getVersion() + "\n");
                    break;
                case "list_commands":
                    trinity.list();
                    break;
                default:
                    break;
            }
            input = "";
        } while(!input.equals("quit"));
        scan.close();
    }
}
