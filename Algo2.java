public class Algo2 {
    public static void main(String[] args) {
        
        int nums[] = {-5, 2, 7, 10, 58, -7, 8, 23} ;

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(min>nums[i]){
                min = nums[i];
            }            
        }

        for (int i = 1; i < nums.length; i++) {
            if(max<nums[i]){
                max = nums[i];
            }            
        }

        System.out.println("Minimum number in the array: " + min);
        System.out.println("Maximum number in the array: " + max);

    }
}
