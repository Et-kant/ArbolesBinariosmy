
public class Arbol {
    private Nodo raiz;
    private int cant; //propiedad donde se almacena la cantidad de nodos del arbol
    private int cantHojas; //almacena la cantidad de hojas
    private int nodoMenor;
    private int nodoMayor;

    public Arbol(){
        raiz = null;
    }

    public void addNodo(int num){ //agregra nodos al arbol
        Nodo newNodo = new Nodo(num);

        if (raiz == null){ //si la raiz es nula el nuevo valor sera agragado a esta
            raiz = newNodo;
        }else{ //si la raiz no es nula toca realizar la busqueda para saber donde insertar el nodo
            Nodo aux = raiz; //igualo un auxiliar a la raiz
            Nodo padre;

            while(true){
                System.out.println("Insertando...");
                padre = aux;
                if (num < aux.num){ //comparo los nodos para saber si van hacia la izquiera o la derecha
                    aux = aux.hijoIzquierda; //añado la referencia al auxiliar

                    if (aux == null){
                        padre.hijoIzquierda = newNodo;
                        return;
                    }
                }else{
                    aux = aux.hijoDerecho;

                    if (aux == null){
                        padre.hijoDerecho = newNodo;
                        return;
                    }
                }
            }
        }
    }

    public void insertarNodoCadena(String cadenaNodos){ //parsea la cadena y lo combierto en enteros
        String[] nodos = cadenaNodos.split(",");
        for (String nodo : nodos){
            addNodo(Integer.valueOf(nodo));
        }
    }

    @Override
    public String toString() {
        return "Arbol{ " + "Raiz " + raiz;
    }
}
