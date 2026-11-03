public class Cancion extends Medio implements Descargable{
    private String autor;

    public Cancion(String titulo, String autor, int duracion, String genero) {
        super(titulo, duracion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getTitulo() + " Artista: " + autor);
    }

    @Override
    public void descargar() {
        System.out.println("Descargando archivo mp3 de la canción...");
    }
    
}
