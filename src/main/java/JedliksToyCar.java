public class JedliksToyCar {

    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return "Battery at 100%";
    }

    public void drive() {
        distance += 20;
        battery -= 1;
    }

}
