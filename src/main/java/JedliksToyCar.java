public class JedliksToyCar {

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven 0 meters";
    }

    public String batteryDisplay() {
        return "Battery at 100%";
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }

}
