public class Medio {
    private String titulo;
    private int duracion; // Duración en segundos

    public Medio(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo el medio: " + titulo);
    }
}
