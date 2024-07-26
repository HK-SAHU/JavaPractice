public class histogramBruteForce {

    public static int histogram(int[] heights){
        int n= heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            int minHeight=heights[i];
            for(int j=i;j<n;j++){
                minHeight= Math.min(minHeight,heights[j]);
                int width=j-i+1;
                int area= minHeight*width;
                maxArea= Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3,1};
        System.out.println(histogram(heights));
    }
}
