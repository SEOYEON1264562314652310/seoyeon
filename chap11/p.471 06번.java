mport java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map1 = Map.of("호랑이","tiger","사자","lion","표범","leopard");
        Map<String,String> map2 = new HashMap<>(map1);
        
        System.out.println("변경 전 : " + map2);
        
        map2.replaceAll((k,v)->v.toUpperCase());
        System.out.println("변경 후 : " + map2);
    }
}
