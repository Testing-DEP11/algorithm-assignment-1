public class Algo8 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        int[] intersection = new int[numA.length];
        int[] combined = new int[numA.length + numB.length];
        int[] symmetricDiff = new int[combined.length];
        int[] differenceAB = new int[numA.length];
        int[] differenceBA = new int[numB.length];


        int count = 0;
        for (int i = 0; i < numA.length; i++) {
            int num1 = numA[i];
            
            for (int j = 0; j < numB.length; j++) {
                
                if(num1 == numB[j]){
                   
                    intersection[count] = num1;
                    count++;
                }
               
            }       
            
        }

        String intersectionNum = "";

        for (int i = 0; i < count; i++) {
            intersectionNum += intersection[i] + ",";
        }
        System.out.println("Intersecton of two Arrays: " + intersectionNum + "\b ");

        System.out.println("--------------------------------------");

        for (int i = 0; i < combined.length; i++) {
                if( i < numA.length) combined[i] = numA[i];
                else if (i < combined.length) combined[i] = numB[i-numB.length];
        }

        String unionStr = "";
        for (int i = 0; i < combined.length; i++) {
            int number = combined[i];
            int num = 0;
            for (int j = 0; j < combined.length; j++) {
                if(j<=i) continue;
                else{
                    if(number == combined[j]) num++;
                }
            }
            if(num==0) unionStr += number + ",";
        }

        System.out.println("Union of two Arrays: " + unionStr + "\b ");

        System.out.println("--------------------------------------");
        
        int x = 0;
        for (int i = 0; i < numA.length; i++) {
                int num = numA[i];
                int count1 = 0;
                for (int j = 0; j < numB.length; j++) {
                    if(num == numB[j]) count1++;              
                }
                if(count1 == 0){ 
                    differenceAB[x] = num;
                    x++;
                }
        }

        String diffAB = "";

        for (int i = 0; i < differenceAB.length; i++) {
            if(differenceAB[i]!=0) diffAB += differenceAB[i] + ",";
        }

        System.out.println("Difference of A-B(A\\B): " + diffAB + "\b ");

        System.out.println("--------------------------------------");

        int y = 0;
        for (int i = 0; i < numB.length; i++) {
                int num = numB[i];
                int count2 = 0;
                for (int j = 0; j < numA.length; j++) {
                    if(num == numA[j]) count2++;              
                }
                if(count2 == 0){ 
                    differenceBA[y] = num;
                    y++;
                }
        }

        String diffBA = "";

        for (int i = 0; i < differenceBA.length; i++) {
            if(differenceBA[i]!=0) diffBA += differenceBA[i] + ",";
        }

        System.out.println("Difference of B-A(B\\A): " + diffBA + "\b ");

        System.out.println("--------------------------------------");

      

        int k = 0;
        for (int i = 0; i < combined.length; i++) {
                int num = combined[i];
                int count1 = 0;
                for (int j = 0; j < intersection.length; j++) {
                    if(num == intersection[j]) count1++;              
                }
                if(count1==0){ 
                    symmetricDiff[k] = num;
                    k++;
                }
        }

        String symmetricDiffNumbers = "";

        for (int i = 0; i < symmetricDiff.length; i++) {
            if(symmetricDiff[i]!=0) symmetricDiffNumbers += symmetricDiff[i] + ",";
        }

        System.out.println("Symmetric Difference of two Arrays: " + symmetricDiffNumbers + "\b ");

        System.out.println("--------------------------------------");


    }
}
