public class TestCaptain {
    public static void main(String[]args) {
        System.out.println("Making Captains...");
        Captain captain1 = Captain.getInstance();
        Captain captain2 = Captain.getInstance();

        System.out.println();

        System.out.println("Setting Captain 1 T-Shirt number to 10...");
        captain1.setTShirtNumber(10);
        System.out.println("Captain 1 T-Shirt number --> " + captain1.getTShirtNumber());
        System.out.println("Captain 2 T-Shirt number --> " + captain2.getTShirtNumber());

        System.out.println();

        System.out.println("Setting Captain 2 T-Shirt number to 7...");
        captain2.setTShirtNumber(7);
        System.out.println("Captain 1 T-Shirt number --> " + captain1.getTShirtNumber());
        System.out.println("Captain 2 T-Shirt number --> " + captain2.getTShirtNumber());
    }
}