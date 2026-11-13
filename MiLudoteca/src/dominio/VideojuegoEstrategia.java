package dominio;

public class VideojuegoEstrategia extends Videojuego{
    int numeroFacciones;
    public VideojuegoEstrategia(String titulo, String plataforma, int puntuacion, int numeroFacciones){
        super(titulo, plataforma, puntuacion);
        this.numeroFacciones = numeroFacciones;
    }

}
