class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        // Sorting the intervals based on the starting value
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            // If the current interval overlaps with the previous one, merge them
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // Otherwise, add the new interval to the result list
                newInterval = interval;
                result.add(newInterval);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}