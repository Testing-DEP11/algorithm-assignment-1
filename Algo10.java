import java.util.Scanner;

public class Algo10 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        boolean loop = true;
        do{
            System.out.print("Enter the phone number: ");
            String number = scanner.nextLine().strip();
            char[] chars = number.strip().toCharArray();

            if(number.isBlank()){
                System.out.println("Telephone number can't be empty!");
                loop = false;
            }

            else{
                boolean flag = true;
                if(number.length()==11){
                    
                    for (int i = 0; i < chars.length; i++) {
                        if(i==3 && chars[3]=='-') continue;
                        else{
                            if(!(Character.isDigit(chars[i]))) {
                                flag = false;
                                break;
                            } else {
                                flag = true;
                            }
                        }
                    }
                    if(flag) System.out.println("Number is validated!");
                    else System.out.println("Invalid telephone number!");

                } else if (number.length() == 15){

                    if(!number.startsWith("+94 ")) flag = false;
                        else {
                            for (int i = 4; i < chars.length; i++) {
                            if(!(Character.isDigit(chars[i]) || (chars[i] == ' '))) {
                                flag = false;
                                break;
                            }else {
                                flag = true;
                            }
                        }
                    }
                    if(flag) System.out.println("Number is validated!");
                    else System.out.println("Invalid telephone number!");

                } else {
                    System.out.println("Invalid telephone number!");
                    flag = false;
                    
                }
                loop = true;
            }
        }while(!loop);

    }
}
