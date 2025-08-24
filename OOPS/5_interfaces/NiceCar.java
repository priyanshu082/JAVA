package OOPS.interfaces;

import java.security.PrivateKey;

public class NiceCar {
    private Engine engine;
    private Media player= new CDplayer();
    private  boolean music=false;
    public NiceCar(){
        engine= new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine= engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        if(music==true) player.stop();
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void startMusic(){
        music=true;
        player.start();
    }
    public void stopMusic(){
        music=false;
        player.stop();
    }

    public  void upgradeEngine(){
        this.engine= new ElectricEngine();
    }


}
