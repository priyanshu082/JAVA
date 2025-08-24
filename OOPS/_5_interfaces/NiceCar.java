package OOPS._5_interfaces;

public class NiceCar {
    private Engine engine;
    private Media mediaPlayer;
    
    public NiceCar() {
        this.engine = new PowerEngine();
        this.mediaPlayer = new CDplayer();
    }
    
    public NiceCar(Engine engine, Media mediaPlayer) {
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }
    
    public void start() {
        engine.start();
    }
    
    public void stop() {
        engine.stop();
    }
    
    public void startMusic() {
        mediaPlayer.start();
    }
    
    public void stopMusic() {
        mediaPlayer.stop();
    }
    
    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
    
    public void upgradeMedia(Media media) {
        this.mediaPlayer = media;
    }
}
