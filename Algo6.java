import java.util.Scanner;

public class Algo6 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean flag = true;
        do{
            System.out.print("Enter the input: ");
            String input = scanner.nextLine();
            if(input.strip().length()==0) {

                System.out.println("Input cannot be empty!\n");
                flag = false;

            } else {

                flag = true;
                char[] chars = input.strip().toCharArray();
                int count = 0; // for count no of words in the sentence
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i]==' ') count++;
                }
                String[] str1 = new String[count + 1];
                count = 0;
                String str = "";
                for (int i = 0; i < chars.length; i++) {
                    
                    if(chars[i] == ' ') {
                        str = "";
                        count++;                        
                        continue;
                    }
                    else {
                        str += chars[i];
                    }
                    str1[count] = str;
                }

                String output = "";
                for (int i = 0; i < str1.length; i++) {
                    output += str1[str1.length-1-i] + " ";
                }
                System.out.println("Invert sentence of the input: " + output + "\b ");
                
            }
        } while(!flag);

    }
}
