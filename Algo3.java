public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        int[] reversed  = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }

        nums = reversed;
        
        for (int i = 0; i < reversed.length; i++) {
            System.out.println(nums[i]);

        }

    }
}
