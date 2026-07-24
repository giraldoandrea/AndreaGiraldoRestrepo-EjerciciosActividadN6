public class ArtículoCientífico {
    public String título;
    public String autor;
    public String[] palabrasClaves = new String[3];
    public String publicación;
    public int año;
    public String resumen; 
    
    public ArtículoCientífico(String título, String autor) {
        this.título = título;
        this.autor = autor;
        }
    
    public ArtículoCientífico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
        this.título = título;
        this.autor = autor;
        this.palabrasClaves = palabrasClaves;
        this.publicación = publicación;
        this.año = año;
        }
    
    
    public ArtículoCientífico(String título, String autor, String[] palabrasClaves, String publicación, int año, String resumen) {
        this(título, autor, palabrasClaves, publicación, año); 
        this.resumen = resumen;
    }
    
    public void imprimir() {
        System.out.println("Título del artículo = " + título);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
            for (int i = 0; i < palabrasClaves.length; i++) {
                System.out.println(palabrasClaves[i]);
            }
        System.out.println("Publicación = " + publicación);
        System.out.println("Año = " + año);
        System.out.println("Resumen = " + resumen);
        }
    
    public void espacio() {
        System.out.println("======================");
        System.out.println("\n");
    }

}

public class Ejercicio211 {

    public static void main(String[] args) {
        String[] palabrasClaves = {"Física","Espacio","Tiempo"};
        ArtículoCientífico artículo1 = new ArtículoCientífico("La teoría especial de la relatividad", "Albert Einstein", palabrasClaves, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        artículo1.imprimir();
        artículo1.espacio();
        
        ArtículoCientífico artículo2 = new ArtículoCientífico("La teoría especial de la relatividad", "Albert Einstein");
        artículo2.imprimir();
        artículo2.espacio();
        
        ArtículoCientífico artículo3 = new ArtículoCientífico("La teoría especial de la relatividad", "Albert Einstein", palabrasClaves, "Anales de Física", 1913);
        artículo3.imprimir();
        artículo3.espacio();
        }
}
