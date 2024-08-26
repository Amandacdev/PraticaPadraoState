package rocketseat.com;

public class PlayerBloqueado implements State {
    public PlayerBloqueado() {
    }

    public void play(Player player) {
        if (player.reprodutorAtivado()) {
            player.setState(new PlayerDesbloqueado());
        }
    }

    public void stop(Player player) {
        if (player.reprodutorAtivado()) {
            player.setState(new PlayerDesbloqueado());
        }
    }

    public void next(Player player) {
    }
    public void previous(Player player) {
    }
}
