public class Program16 {
    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class Smartphone implements Camera, MusicPlayer {
        @Override
        public void takePhoto() { System.out.println("Smartphone clicked a photo."); }

        @Override
        public void playMusic() { System.out.println("Smartphone is playing music."); }
    }

    public static void main(String[] args) {
        System.out.println("Camera     MusicPlayer");
        System.out.println("     \\     /");
        System.out.println("      \\   /");
        System.out.println("    Smartphone");
        System.out.println();
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}
