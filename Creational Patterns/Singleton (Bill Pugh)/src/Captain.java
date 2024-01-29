public class Captain  {
    // Unique instance attribute
    private int tShirtNumber = 0;

    // Private constructor to enforce Singleton pattern
    private Captain() {}

    ////////// Getters & Setters //////////
    public int getTShirtNumber() {
        return tShirtNumber;
    }
    public void setTShirtNumber(int tShirtNumber) {
        this.tShirtNumber = tShirtNumber;
    }

    ////////// Singleton (Bill Pugh) implementation //////////
    private static class CaptainHelper {
        private static final Captain captain = new Captain();
    }
    public static Captain getInstance() {
        return CaptainHelper.captain;
    }
}
