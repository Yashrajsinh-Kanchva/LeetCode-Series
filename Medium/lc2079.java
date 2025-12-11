public class lc2079 {
    public static void main(String[] args) {
        Solution2079 s=new Solution2079();
        System.out.println(s.wateringPlants(new int[]{1,1,1,4,2,3}, 4));
    }
}
class Solution2079 {
    public int wateringPlants(int[] plants, int capacity) {
        int step=0;
        int temp=capacity;
        for(int i=0; i<plants.length; i++){
            if(plants[i]<=temp) {
                temp -= plants[i];
                step+=1;
            }
            else{
                step+=2*i;
                temp=capacity;
                temp -= plants[i];
                step+=1;
            }
        }
        return step;
    }
}