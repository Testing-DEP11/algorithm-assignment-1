import java.util.Scanner;

public class Algo9 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean flag = true;
        do{
            System.out.print("Enter the input: ");
            String input = scanner.nextLine().strip();
            if(input.strip().length()==0) {
                System.out.println("Input cannot be empty!\n");
                flag = false;
            } else if(input.contains(" ")){
                System.out.println("Only input a single word!\n");
                flag = false;
            } else {
                flag = true;
                char[] chars = input.toCharArray();
                String chars1 = "";
                for (int i = 0; i < chars.length; i++) {
                    chars1 += chars[chars.length - 1 - i];
                }

                if(input.equals(chars1)) System.out.println("Palindrom");
                else System.out.println("Not a palindrome");
            }
        } while(!flag);
    }
}
