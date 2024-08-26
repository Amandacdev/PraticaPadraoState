package rocketseat.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private State state = new PlayerDesbloqueado();
    ArrayList<String> playlist = new ArrayList<>(Arrays.asList(
            "Bohemian Rhapsody - Queen",
            "Imagine - John Lennon",
            "Hotel California - Eagles",
            "Stairway to Heaven - Led Zeppelin",
            "Billie Jean - Michael Jackson"
    ));

    private int musicaAtual = 0;
    private boolean reprodutorAtivado = false;

    public Player() {
        for(int i = 1; i <= 5; ++i) {
            this.playlist.add("Reproduzindo música " + i);
        }
    }
    public void play() {
        this.state.play(this);
    }

    public void stop() {
        this.state.stop(this);
    }

    public void next() {
        this.state.next(this);
    }

    public void previous() {
        this.state.previous(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean reprodutorAtivado() {
        return this.reprodutorAtivado;
    }

    public String startPlayback() {
        return "Reproduzindo: " + (String)this.playlist.get(this.musicaAtual);
    }

    public String nextTrack() {
        this.musicaAtual = (this.musicaAtual + 1) % this.playlist.size();
        return this.startPlayback();
    }

    public String previousTrack() {
        this.musicaAtual = (this.musicaAtual - 1 + this.playlist.size()) % this.playlist.size();
        return this.startPlayback();
    }

}
