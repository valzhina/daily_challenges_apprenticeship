import java.util.Arrays;

public class _42TrappingRainWater {
    public static void main(String[] args) {


        int[] height = {4,2,0,3,2,5};

        System.out.println(rainWater(height));
//        rainWater(new int[] {0,1,0,2,0,3,2,1,2,1});

//        int[][] result = insertInterval(intervals, newInterval);
//        for(int[] res: result) {
//            System.out.println(Arrays.toString(res));
//        }
    }

    //Find the tallest peak
    //Find the tallest remaining peak
    //Find the water captured by the two peaks
    //set discovered peak as new tallest
    //repeat for a new peak

    public static int rainWater(int[] height){
        int maxHeight = 0, maxHeightIndex = -1;

        if (height.length == 1 || height.length == 0) return 0;
        //Find the tallest peak
        for(int i = 0; i < height.length; i++){
            if(maxHeight < height[i]){
                maxHeight = height[i];
                maxHeightIndex = i;
            }
        }
        return findRain(height, maxHeightIndex, -1) + findRain(height, maxHeightIndex, 1);

    }

    public static int findRain(int[] height, int start, int dir){

        int endHeight = 0, endIndex = -1;
        //Find the tallest remaining peak
        for(int i = start + dir; i < height.length && i >= 0; i += dir){
            if(endHeight < height[i]){
                endHeight = height[i];
                endIndex = i;
            }
        }
        if(endIndex == -1) return 0;

        int rain = 0;

        for(int i = endIndex - dir; i != start; i -= dir){
            rain += endHeight - height[i];
        }

        return rain + findRain(height, endIndex, dir);
    }
}
