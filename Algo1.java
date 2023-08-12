import java.util.Scanner;

public class Algo1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean flag = false;
        do{
            
            System.out.print("Enter a number for a Fibonacci Sequence: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number < 0){
                System.out.println("Invalid Number\n");
                flag = false;
            }else if(number == 0) System.out.println("Fibonacci Sequence for 0: "+number); 
            else if(number == 1) System.out.println("Fibonacci Sequence for : "+(number-1)+","+ number);
            else{

                int[] num = new int[number+1];
                num[0] = 0;
                num[1] = 1;

                for (int i = 1; i < number; i++) {
                    num[i + 1] = num[i]+num[i-1];                     
                }
                  
               String numList = "";

               for (int i = 0; i < num.length; i++) {
                    numList +=  num[i] + ",";
               }

               System.out.println("Fibonacci Sequence for " + number + ": " + numList + "\b ");
                
            }

        } while(!flag);
    }
}