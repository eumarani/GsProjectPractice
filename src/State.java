import java.util.ArrayList;
import java.util.List;

public class State {
    public static void main(String[] args) {
        ArrayList<StateCode> al = new ArrayList<>();
        al.add(new StateCode("MH", "mumbai"));
        al.add(new StateCode("AH", "ahmedabad"));
        al.add(new StateCode("TS", "hyderabad"));
        //System.out.println(al);
        findCity(al);
    }

    public static void findCity(ArrayList<StateCode> al) {


        List<String> cities = new ArrayList<>();
        for (StateCode StateCode : al) {
            String city = StateCode.getCity();
            if (city.startsWith("h")) {
                cities.add(city.toUpperCase());
            } else {
                cities.add(city);
            }


        }
        System.out.println(cities);

    }

}