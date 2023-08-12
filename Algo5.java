import java.util.Scanner;

public class Algo5 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean flag = true;
        do{
            System.out.print("Enter the input: ");
            String input = scanner.nextLine();
            if(input.strip().length()==0) {
                System.out.println("Input cannot be empty!");
                flag = false;
            } else {
                flag = true;
                char[] chars = input.toCharArray();
                String chars1 = "";
                for (int i = 0; i < chars.length; i++) {
                    chars1 += chars[chars.length - 1 - i];
                }
                System.out.println("Invert sequence of '" + input + "' is: " + chars1);
            }
        } while(!flag);
    }
}
