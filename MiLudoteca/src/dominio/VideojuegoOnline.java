package dominio;
public class VideojuegoOnline extends Videojuego {
    int numeroJugadoresOnline;
    public VideojuegoOnline(String titulo, String plataforma, int puntuacion, int numeroJugadoresOnline){
        super(titulo, plataforma, puntuacion);
        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }

}
