package HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String, String>();

        // add a key value pair
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Australia","Canberra");
        countries.put("China","Beijing");


//        countries.remove("USA");
//        countries.clear();
//        System.out.println(countries);

        for(String i : countries.keySet()) {
            System.out.print(i + ", ");
            System.out.println(countries.get(i));
        }
    }
}
