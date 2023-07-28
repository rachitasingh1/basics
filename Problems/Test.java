public class Test {
    public static int removeElement(int[] nums, int val) {
        // int temp = 0;
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == val) {
        //         count++;
        //         temp = nums[i];
        //         nums[i] = nums[i + 1];
        //         i++;
        //         nums[nums.length-1 - i] = temp;
        //     }
        // }
        // return nums.length - count;
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;                
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 0, 4, 5, 6, 7, 0, 8, 9 };
        System.out.println(removeElement(array, 0));
    }
}
