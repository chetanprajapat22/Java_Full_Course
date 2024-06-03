package in.co.oop;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {
    public static void main(String[] args) {

        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();

        for (Object o : keySet){
            String key = (String) o;
            String val= prop.getProperty(key);
            System.out.println(key + " = " + val);
        }
        String country = System.getProperty("user.country");
        System.out.println(country);

        System.clearProperty("user.country"+","+"IN");
        country = System.getProperty("user.country");
        System.out.println(country);
    }
}
