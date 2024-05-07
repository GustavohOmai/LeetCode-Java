package LeetCode01;

public class Ex01 {

    public static int[] twoSum(int[] nums, int target) {

        int[] resultado = new int[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]+nums[j] == target && i != j){
                    resultado = new int[]{i, j};
                    break;
                }
            }
        }

        return resultado;
    }
}
