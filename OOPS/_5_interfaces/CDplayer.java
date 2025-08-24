package OOPS._5_interfaces;

public class CDplayer implements Media {
    @Override
    public void start() {
        System.out.println("CD player starts");
    }
    
    @Override
    public void stop() {
        System.out.println("CD player stops");
    }
}
