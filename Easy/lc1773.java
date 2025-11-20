import java.util.Arrays;
import java.util.List;

public class lc1773 {
    public static void main(String[] args) {
        Solution1773 s=new Solution1773();
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        System.out.println(s.countMatches(items,"type","phone"));
    }
}
class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        switch (ruleKey) {
            case "type" -> {
                for (List<String> item : items) {
                    if (item.getFirst().equals(ruleValue))
                        count++;
                }
            }
            case "color" -> {
                for (List<String> item : items) {
                    if (item.get(1).equals(ruleValue))
                        count++;
                }
            }
            case "name" -> {
                for (List<String> item : items) {
                    if (item.get(2).equals(ruleValue))
                        count++;
                }
            }
        }
        return count;
    }
}