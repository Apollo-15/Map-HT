import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        String stroka = "Java is great, and Java is powerful.";
        String replased = stroka.replaceAll("[,.]", "");
        String[] splitted = replased.split(" "); 
        
        // System.out.println(stroka);
        // System.out.println(splitted);

        Map<String, Integer> map = new HashMap<>();


        for (String word : splitted) {
            if (map.containsKey(word)){
                
            };
         
        }


        System.out.println("Вывод: " + map);
    }
}
