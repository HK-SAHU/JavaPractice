import java.util.Stack;

public class LargestRectangleInHistogram {

    // BETTER solution

    public static int LargestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st= new Stack<>();
        int[] left= new int[n];
        int[] right= new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) left[i]=0;
            else left[i]= st.peek()+1;
            st.push(i);
        }

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) right[i]= n-1;
            else right[i]= st.peek()-1;
            st.push(i);
        }

        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea= Math.max(maxArea, heights[i]*(right[i]-left[i]+1));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3,1};
        System.out.println("maximum area of the histogram is: "+ LargestRectangleArea(heights));
    }
}
