class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = maxElement(weights);
        int h = sum(weights);

        while(l <= h){
            int mid = l + (h - l) / 2;

            int noOfDays = daysNeeded(weights, mid);

            if(noOfDays <= days){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
        
    }

    private int sum(int[] weights){
        int sum = 0;
        for(int i : weights){
            sum += i;
        }
        return sum;
    }

    private int maxElement(int[] weights){
        int maxi = weights[0];
        for(int j : weights){
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }

    private int daysNeeded(int[] weights, int capacity){
        int day = 1, load = 0;
        int n = weights.length;
        for(int i = 0; i < n; i++){
            if(load + weights[i] > capacity){
                day++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
}