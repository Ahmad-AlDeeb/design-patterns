public interface HollywoodMovie {
    void getMovieName();
}
class HollywoodActionMovie implements HollywoodMovie {
    public void getMovieName() {
        System.out.println("Hollywood Action Movie!");
    }
}
class HollywoodComedyMovie implements HollywoodMovie {
    public void getMovieName() {
        System.out.println("Hollywood Comedy Movie!");
    }
}