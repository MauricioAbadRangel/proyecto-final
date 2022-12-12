import java.util.ArrayList;

public class ArrayList_Main {
    public static void main(String[] args) {
        ArrayList Arreglo = new ArrayList();
        Arreglo.add(12); //Agrega un elemento al final
        Arreglo.add(14);
        Arreglo.add(35);
        Arreglo.add(65);
        Arreglo.get(8); //Devuelve el elemento en la posición i.
        System.out.println("¿Contiene 00? " + Arreglo.contains(00));
        Arreglo.iterator();
    }
}