public class withoutDI {
    public static void main(String[] args) {
        Multiplayer m = new Multiplayer();
        m.playMusic();
    }

    
}

class Bluetooth{
    public void play(){
        System.out.println("Playing via bluetooth");
    }
}

class Multiplayer{
    private Bluetooth b;

    //constructor
    public Multiplayer(){
        b = new Bluetooth();
    }

    public void playMusic(){
        b.play();
    }

}
