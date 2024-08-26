package rocketseat.com;

public class PlayerDesbloqueado implements State {
    public PlayerDesbloqueado() {
    }
    public void play(Player player) {
        player.setState(new PlayerState());
    }
    public void stop(Player player) {
        player.setState(new PlayerBloqueado());
        System.out.println("Reprodução interrompida.");
    }
    public void previous(Player player) {}
    public void next(Player player) {}
}
