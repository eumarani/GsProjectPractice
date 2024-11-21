import java.util.Stack;

public class TrappingRainWaterStack {
    public static void main(String[] args){
       int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trappedWater(height));
    }
    public static int trappedWater(int[] height){
        int totalWater=0;
        int m=0;

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
               m= st.pop();
                if(st.isEmpty()) break;
                int depth=Math.min(height[i],height[st.peek()])-height[m];
                int width=i-st.peek()-1;
                totalWater += depth*width;
            }
            st.push(i);
        }
        return totalWater;
    }
}
