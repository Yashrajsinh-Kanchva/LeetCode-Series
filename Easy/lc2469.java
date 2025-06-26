public class lc2469 {
    public static void main(String[] args) {
        Solution2469 s=new Solution2469();
        double[] ans=s.convertTemperature(36);
        System.out.println("Kelvin: "+ans[0]);
        System.out.println("Celsius: "+ans[1]);
    }
}
class Solution2469 {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15, celsius*1.8 +32};
    }
}
