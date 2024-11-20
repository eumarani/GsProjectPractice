import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedAmount(height));

    }
    public static int trappedAmount(int[] height){
        int n=height.length;
        int[] lmax=lmax(height);
        int[] rmax=rmax(height);

        int trappedWater=0;

        for(int i=0;i<n;i++){
            trappedWater += Math.min(lmax[i],rmax[i])-height[i];
        }
       return trappedWater;
    }

    public static int[] lmax(int[] height){
        int n=height.length;
        int[] lmax=new int[n];
        lmax[0]=height[0];
        for(int i=1;i<n;i++){

           lmax[i]=Math.max(lmax[i-1],height[i]);
        }
       return lmax;
    }
    public static int[] rmax(int[] height){
        int n=height.length;
        int[] rmax=new int[n];
        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],height[i]);
        }
      return rmax;

    }
}
