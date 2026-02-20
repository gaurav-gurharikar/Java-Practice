public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxAmount=0;
        for(int i=0; i<height.length; i++) {
            for(int j=i+1; j<height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int b = j-i;
                int area = h*b;
                maxAmount = Math.max(area, maxAmount);
            }
        }
        return maxAmount;
    }
}