package OOPS.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.acc();
//        car.stop();
//
//        Media carMedia= new Car() ;
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.acc();
        car.startMusic();
        car.upgradeEngine();

        car.stop();

    }
}
