package dominio;

public class VideojuegoDeportivo extends Videojuego{
    String deporte;
    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion, String deporte){
        super(titulo, plataforma, puntuacion);
        this.deporte = deporte;
    }
}
