public class Test {
    public static void main(String[] args) {
     int temp1 = (int)Math.pow(2,31);
     int temp2 = (int)Math.pow(10,9);

        System.out.println(temp1);
        System.out.println(temp2);
    }

    public int[] twoSum(int[] nums, int target) {
        //return 代码优化
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i]+nums[j])==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];

        //TODO 用hashmap来优化该题
    }
}
