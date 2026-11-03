public class Apunte implements Descargable{
    private String tema;

    @Override
    public void descargar() {
        System.out.println("Descargando PDF del apunte...");
    }
    
}
