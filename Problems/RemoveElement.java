public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
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
