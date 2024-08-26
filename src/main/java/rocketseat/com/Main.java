package rocketseat.com;
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Bem vindo ao player!");
        player.play();
        player.next();
        player.next();
        player.next();
        player.previous();
        player.play();
        player.stop();
        player.play();
        player.next();
    }
}