package rocketseat.com;

public class PlayerState implements State {
    public PlayerState() {
    }
    public void play(Player player) {
        player.setState(new PlayerDesbloqueado());
    }
    public void stop(Player player) {
        player.setState(new PlayerBloqueado());
    }
    public void next(Player player) {
        System.out.println(player.nextTrack());
    }

    public void previous(Player player) {
        System.out.println(player.previousTrack());
    }
}

