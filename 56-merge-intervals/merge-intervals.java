

class Solution {
    public int[][] merge(int[][] intervals) {
        // Agar array mein 0 ya 1 interval hai, toh merge karne ki zarurat nahi
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Intervals ko unke 'start' time ke hisaab se sort karna
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Har interval ko check karna aur merge karna
        for (int[] interval : intervals) {
            // Agar list khali hai, YA current interval pichle wale se overlap nahi karta
            // (Current ka Start > Pichle ka End)
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } 
            // Agar overlap karta hai, toh pichle wale ka 'End' time update kar do
            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: List ko wapas 2D int array mein convert karke return karna
        return merged.toArray(new int[merged.size()][]);
    }
}