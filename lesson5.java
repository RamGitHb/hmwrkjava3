import java.util.HashMap;
import java.util.Map;

public class lesson5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> collect = new HashMap<>();

        collect.put("Фамилия1", 657186565);
        collect.put("Фамилия2", 987196541);
        collect.put("Фамилия3", 321000879);
        collect.put("Фамилия4", 810098465);
        collect.put("Фамилия5", 984635849);
        
        System.out.print(collect);
    }
}
