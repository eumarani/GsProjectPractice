public class StateCode {

    private String state;
    private String city;
    public StateCode(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StateCode{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }



}
