
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0){
                break;
            }
            
            
            if (number > 0){
                sum = sum + number;
                numbers++;
            }
        }
        
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (sum * 1.0) / numbers;
            System.out.println(average);
        }
        
    }
}
