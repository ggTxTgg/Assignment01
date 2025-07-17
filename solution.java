public class solution {
    public static int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int width=right-left;
            int currentHeight=height[left];
            if(height[left]<height[right]){
                currentHeight=height[left];
            }
            else{
                currentHeight=height[right];
            }
            int area=width*currentHeight;
            if(area>max){
                max=area;
            }
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String []args){
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}