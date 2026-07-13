class Solution {

    private boolean canWePlace(int[] position, int distance, int balls) {
        int placed = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= distance) {
                placed++;
                last = position[i];

                if (placed >= balls)
                    return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int balls) {
        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(position, mid, balls))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return high;
    }
}