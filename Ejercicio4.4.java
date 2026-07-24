public class Ejercicio44 {

    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimir();
    
    }
}

public class Profesor {
    protected void imprimir() { 
        System.out.println("Es un profesor.");
    } 
    
}

public class ProfesorTitular extends Profesor {
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
}
