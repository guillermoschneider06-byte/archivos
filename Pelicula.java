public class Pelicula extends Medio {
    private String director;

    public Pelicula(String titulo, String director, int duracion, String genero) {
        super(titulo, duracion);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + getTitulo() + " Dirigida por: " + director);
    }
    
}
