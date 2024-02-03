public interface BollywoodMovie {
    void getMovieName();
}

class BollywoodActionMovie implements BollywoodMovie {
    public void getMovieName() {
        System.out.println("Bollywood Action Movie!");
    }
}
class BollywoodComedyMovie implements BollywoodMovie {
    public void getMovieName() {
        System.out.println("Bollywood Comedy Movie!");
    }
}

