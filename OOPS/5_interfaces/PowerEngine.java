package OOPS.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void stop() {
        System.out.println("Power Engine is stopping");
    }

    @Override
    public void start() {
        System.out.println("Power Engine is starting");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine is accelerating");
    }

}
