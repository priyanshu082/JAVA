package OOPS._5_interfaces;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();
        
        // Upgrade to electric engine
        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
