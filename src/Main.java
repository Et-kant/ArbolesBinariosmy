import java.util.Scanner;

/*
Los arboles cuenta con las siguiente caracteristicas:
- Es una estructura de datos
- cuenta con una raíz
- Cada nodo puede tener como maximo dos hijos
- cuenta con niveles
- cuentan con una altura
 */

/*
Operaciones que el arbol debe realizar
- Insertar los nodos
- Buscar los nodos
- Eliminar los nodos
- Obtener la altura
- Obtener el nodo menor
- Obtener el nodo mayor
- Obtener la cantidad de nodos
- Obtener la cantidad de nodos hoja
 */

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Arbol arbol = new Arbol();
        arbol.insertarNodoCadena("10,4,11,13");
        System.out.println("Arbol " + arbol);
    }
}