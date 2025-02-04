class Solution {
    public void moveZeroes(int[] nums) {
        
      int i = 0; // Iterator for iterating through the array
        int j = 0; // Position to swap non-zero elements to

        while (i < nums.length) {
            if (nums[i] == 0) {
                // If the current element is zero, just move the iterator forward
                i++;
            } else {
                // If the current element is non-zero, swap it with the element at position j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move both iterators forward
                i++;
                j++;
            }
        }
    }
}
