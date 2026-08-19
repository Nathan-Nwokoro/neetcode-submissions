class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = maxSpeed(piles);
        int speed = 0;
        while (min <= max) {
            int middle = min + (max - min)/2;
            int hours = 0;
            for (int p: piles) {
                if (p % middle == 0) {
                    hours += p / middle;
                } else if (p % middle != 0) {
                    hours += (p / middle) + 1;
                }
                
            }
            if (hours == h) {
                speed = middle;
                max = middle - 1;
            } else if (hours < h) {
                speed = middle;
                max = middle - 1;

            } else if (hours > h) {
                min = middle + 1;
                continue;
            } else {
                continue;
            }

        }
        return speed;


    }

    public int maxSpeed(int[] piles) {
        int max = 0;
        for (int p: piles) {
            if (p > max) {
                max = p;
            }
        }
        return max;
    }
}
