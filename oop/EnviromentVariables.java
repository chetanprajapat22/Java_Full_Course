package in.co.oop;

import java.util.Map;
import java.util.Set;

public class EnviromentVariables {
    public static void main(String[] args) {

        String path = System.getenv("PATH");
        System.out.println("$PATH = " + path);

        Map<String,String> envMap = System.getenv();

        Set<String> Keyset = envMap.keySet();
        for (String key: Keyset){
            String val = envMap.get(key);
            System.out.println(key + " = " + val);
        }

    }
}
