class Solution {
    public int numSubarraysWithSum(int[] arr, int sum) {
     int count = 0;

        for (int left = 0; left < arr.length; left++) {
            int currentSum = 0;

            for (int right = left; right < arr.length; right++) {
                currentSum += arr[right];

                if (currentSum == sum) {
                    count++;
                }
            }
        }

        return count;
    }
}