import org.junit.Test;
import static org.junit.Assert.*;

public class testePlaylist {

    @Test
    public void listaVazia(){
        Playlist playlist = new Playlist();
        int aux = playlist.tamanhoLista();
        assertEquals(0, aux);
        System.out.println(aux);
    }

    // Eu não Desisto - Jessé
    // Pra Sempre - Fernandinho
    // Aleluia - Gabriela Rocha

    @Test
    public void adicionarMusica(){
        Playlist playlist = new Playlist();

        playlist.adicionar("Aleluia - Gabriela Rocha");
        playlist.adicionar("Eu não Desisto - Jessé");
        playlist.adicionar("Pra Sempre - Fernandinho");
        //playlist.adicionar("Pra Sempre - Fernandinho");

        int aux = playlist.tamanhoLista();
        assertEquals(3, aux);

        playlist.getMinhaPlaylist();
    }

    @Test
    public void removerMusica(){
        Playlist playlist = new Playlist();

        playlist.adicionar("Aleluia - Gabriela Rocha");
        playlist.adicionar("Eu não Desisto - Jessé");
        playlist.adicionar("Pra Sempre - Fernandinho");
        String songToRemove = "Aleluia - Gabriela Rocha";
        playlist.remover(songToRemove);

        int aux = playlist.tamanhoLista();

        assertEquals(2, aux);
        assertFalse(playlist.containsSong(songToRemove));
        assertTrue(playlist.containsSong("Eu não Desisto - Jessé"));
        assertTrue(playlist.containsSong("Pra Sempre - Fernandinho"));

        playlist.getMinhaPlaylist();
    }
}