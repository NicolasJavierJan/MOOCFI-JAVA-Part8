
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                first.add(liquid);
            }
            
            if (command.equals("remove")){
                second.remove(liquid);
            }
            
            if (command.equals("move") && liquid > 0){
                if (first.contains() >= liquid){
                    first.remove(liquid);
                    second.add(liquid);
                } else {
                    second.add(first.contains());
                    first.remove(liquid);
                }
            }
            System.out.println("");

        }

    }

}
