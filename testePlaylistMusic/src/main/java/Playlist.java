import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<String> minhaPlaylist = new ArrayList<>();

    public Playlist(String nomeMusica) {
        minhaPlaylist = new ArrayList<>();
        this.nome = nomeMusica;
    }

    public Playlist() {

    }

    public int tamanhoLista(){
        return this.minhaPlaylist.size();
    }

    public void adicionar(String musica){

        if (this.minhaPlaylist.contains(musica)) {
            throw new IllegalArgumentException("A música já existe na lista.");
        }

        this.minhaPlaylist.add(musica);
    }

    public void remover(String musica){
        this.minhaPlaylist.remove(musica);
    }

    public boolean containsSong(String musica) {
        return minhaPlaylist.contains(musica);
    }

    public List<String> getMinhaPlaylist() {
        for(int i = 0; i < minhaPlaylist.size(); i ++){
            System.out.println(minhaPlaylist.get(i));
        }
        return minhaPlaylist;
    }
}