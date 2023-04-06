package HASHING;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhm {
    public static void main(String[] args){
        LinkedHashMap<String , Integer>hm = new LinkedHashMap<>();
        hm.put("India",88);
        hm.put("China",89);
        hm.put("Pakistan",90);hm.put("Afaganistan",91);
        hm.put("Usa",82);

        System.out.println(hm);
    }
}
