
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && liquid > 0){
                first = first + liquid;
                if (first > 100){
                    first = 100;
                }
            }
            
            if (command.equals("move") && liquid > 0){
                if (liquid <= first){
                    first = first - liquid;
                    second = second + liquid;
                } else if (liquid > first){
                    second = second + first;
                    first = 0;
                }
                if (second > 100){
                    second = 100;
                }
            }
            
            if (command.equals("remove") && liquid > 0){
                if (liquid <= second){
                    second = second - liquid;
                } else if (liquid > second){
                    second = 0;
                }
            }
            System.out.println(" ");
        }
    }
}
