public class Pilas_Main {

    public static void main(String[] args) {
        Pilas_ADT Pila = new Pilas_ADT(); //Constructor
        Pila.push(11); //Agrega un elemento a la pila
        Pila.push(55);
        Pila.push(32);
        Pila.push(54);
        System.out.println(Pila.peek()); //Muestra  el último elemento
        //agregado a la pila.
        Pila.transversal();
    }
}