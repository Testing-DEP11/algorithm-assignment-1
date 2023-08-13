import java.util.Scanner;

public class Algo7 {
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

                int min = str1[0].length();
                int max = str1[0].length();
                int countMin = 0;
                int countMax = 0;
                

                for (int i = 0; i < str1.length; i++) {
                    
                    if(str1[i].length()<min) min = str1[i].length();
                    else if(str1[i].length()>max) max = str1[i].length();

                }

                for (int i = 0; i < str1.length; i++) {     
                    if(str1[i].length()==min) countMin++;
                    else if(str1[i].length()==max) countMax++;
                }

                String[] minArray = new String[countMin];
                String[] maxArray = new String[countMax];
                String[] sortedMin = new String[minArray.length];
                String[] sortedMax = new String[maxArray.length];

                // shortest and longest words adding to minArray and maxArray respectively

                int minIndex = 0;
                int maxIndex = 0;
                for (int i = 0; i < str1.length; i++) {
                    if(str1[i].length()==min) {
                        minArray[minIndex] = str1[i];
                        minIndex++;                        
                    } 
                    else if(str1[i].length()==max) {
                        maxArray[maxIndex] = str1[i];
                        maxIndex++;
                    }
                }

                // sorting minArray for any duplicates
                
                String resultMin = "";

                for (int i = 0; i < minArray.length; i++) {
                    String str2 = minArray[i];
                    int count1 = 0;
                    for (int j = 1; j < minArray.length; j++) {
                        
                        if(j <= i) continue ;
                        else{
                            if(str2.equals(minArray[j]))count1++;
                        }
                                                
                    }if(count1==0) {sortedMin[i] = str2;}       
                    
                    if(!(sortedMin[i]==null)) resultMin += sortedMin[i]+",";
                }
                System.out.println("Shortes word length: "+ minArray[0].length() + " & Shortest word(s): " + resultMin +"\b ");

                 // sorting maxArray for any duplicates

                String resultMax = "";

                for (int i = 0; i < maxArray.length; i++) {
                    String str3 = maxArray[i];
                    int count2 = 0;
                    for (int j = 1; j < maxArray.length; j++) {
                        
                        if(j <= i) continue ;
                        else{
                            if(str3.equals(maxArray[j]))count2++;
                        }
                                                
                    }if(count2==0) {sortedMax[i] = str3;}  
                    
                    if(!(sortedMax[i]==null)) resultMax += sortedMax[i]+",";
                }

                System.out.println("Longest word length: "+ maxArray[0].length() + " & Longest word(s): " + resultMax +"\b ");

            }
        } while(!flag); 
    }
}
