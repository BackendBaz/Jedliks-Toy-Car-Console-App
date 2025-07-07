public class JedliksToyCar {

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven 0 meters";
    }

    public String batteryDisplay() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }

}
