class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = weights[0];
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
            sum += weights[i];
        }

        int left = max;
        int right = sum;
        int answer = sum;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int dayCount = 1;
            int currWeight = 0;

            for (int i = 0; i < weights.length; i++) {

                if (currWeight + weights[i] <= mid) {
                    currWeight += weights[i];
                } else {
                    dayCount++;
                    currWeight = weights[i];
                }
            }

            if (dayCount <= days) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}