public class Algo4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};
      
        for (int i = 0; i < nums.length ; i++) {
            int temp1 = nums[i];
            int temp2 = nums[nums.length-1-i];

             for (int j = 0; j < nums.length; j++) {
                if(j==i){
                    nums[nums.length-1-j] = temp1;
                    nums[i] = temp2;
                }                
            }
            int temp3 = nums.length/2;
            if(i>=temp3) break;            
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }  
    }
}
