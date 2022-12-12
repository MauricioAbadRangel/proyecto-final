public class ListaSimplementeLigada_Main {

    public static void main(String[] args) {
        LSL_ADT Lista = new LSL_ADT(); //Constructor
        Lista.agregarAlInicio(5); //Agrega al inicio.
        Lista.agregarAlInicio(6);
        Lista.agregarAlInicio(7);
        Lista.agregarAlFinal(8); //Agrega al final.
        Lista.agregarAlFinal(34);
        Lista.agregarAlFinal(35);
        Lista.transversal(); 
        Lista.actualizarValor(6, 8); //Remplazar el valor
        Lista.agregarDespuesDe(5, 27); //Añadir un elemento despues de una pociscion dada
        Lista.transversal();
        Lista.eliminarElFinal();
        Lista.eliminarElPrimero();
        Lista.eliminar(4);
        Lista.transversal();
    }
}