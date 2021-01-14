/*
Trinity by Ian Smith

Trinity's base class, which handles all user input, and routes commands.
*/

public class Trinity {
    public static void main(String[] args) {
        Engine trinity = new Engine(1);
        String input = "";
        // Handle any arguments that were passed.
        String[] options = args;
        for (String arg : options) {
            //TODO: Create Arg handling.
        }
        do{
            
        } while(!input.equalsIgnoreCase("quit"));
    }
}
