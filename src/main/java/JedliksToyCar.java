public class JedliksToyCar {

    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        if (distance > 2000) return "Driven 2000 meters";
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery <= 0) return "Battery empty";
        return "Battery at " + battery + "%";
    }

    public void drive() {
        distance += 20;
        battery -= 1;
    }

}
