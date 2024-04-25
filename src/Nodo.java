public class Nodo {
    public int num; //con esta variable guardamos el valor del nodo

    public Nodo hijoIzquierda, hijoDerecho;

    public Nodo(int num){ //constructor que inicializa el objeto
        this.num = num; //setea la variable que le paseen como la variable num
        this.hijoIzquierda = null;
        this.hijoDerecho = null;
    }

    @Override
    public String toString() {
        return "Nodo {" + "num = " + num + " , hijoIzquierdo= " + hijoIzquierda +
                " , hijoDerecho= " + hijoDerecho + "}";
    }
}
