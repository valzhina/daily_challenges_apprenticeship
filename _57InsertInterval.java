/*57. Insert Interval
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        System.out.println(insertInterval(intervals, newInterval));
    }

    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        for (; i < intervals.length && intervals[i][1] < newInterval[0]; i++) {
            result.add(intervals[i]);
        }

        for (; i < intervals.length && intervals[i][0] < newInterval[1]; i++) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        }
        result.add(newInterval);

        for (; i < intervals.length; i++) {
            result.add(intervals[i]);
        }

        return result.toArray(new int[result.size()][]);
    }
//        int x = newInterval[0];
//        int y = newInterval[1];
//
//        int left = 0;
//        int right = 0;
//
//        for(int[] item: intervals){
//            if (item[1] < x) {
//                left += 1;
//            }
//            if (item[0] > y) {
//                right += 1;
//            }
//        if (left + right != intervals.length){
//            x = Math.min(intervals[left][0], x);
//            y = Math.max(intervals[-right-1][1], y);
//        }
//        result.add(newInterval);
////        return intervals[:left] + [[x,y]] + intervals[intervals.length-right:]
//          return result.toArray(new int[result.size()][]);
}
