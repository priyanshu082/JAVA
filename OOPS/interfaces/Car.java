package OOPS.interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine is stopping");
    }

    @Override
    public void start() {
        System.out.println("Car Engine is starting");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }

}
