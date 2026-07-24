public class Ejercicio46 {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor();
        profesor1.imprimir();
        profesor1.espaciado();
        
        ProfesorTitular profesor2 = new ProfesorTitular ();
        profesor2.años = 15;
        profesor2.imprimir();
        profesor2.imprimirAños();
        profesor2.espaciado();
    }
}

public class Profesor {
    protected void imprimir() {
        System.out.println("Es un profesor.");
    }
    public void espaciado() {
        System.out.println("================\n");
        System.out.println("================\n");
    }
}

public class ProfesorTitular extends Profesor {
    public int años = 0;

    protected void imprimir() {
        System.out.println("Es un profesor titular.");
        }
    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }
}
