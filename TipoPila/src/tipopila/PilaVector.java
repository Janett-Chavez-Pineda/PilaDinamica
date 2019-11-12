package tipopila;
import java.util.Vector;
public class PilaVector {

    private static final int INICIAL = 19;
    private int cima;
    private Vector ListaPila;

    public PilaVector() {
        cima = -1;
        ListaPila = new Vector(INICIAL);

    }

    public void insertar(Object elemento) {
        cima++;
        ListaPila.addElement(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if (PilaVacia()) {
            throw new Exception("Pila vacia no se puede extraer.");
        }
        aux = ListaPila.elementAt(cima);
        ListaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (PilaVacia()) {
            throw new Exception("Pila vacia no se puede extraer.");

        }
        return ListaPila.elementAt(cima);

    }

    public boolean PilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!PilaVacia()) {
            quitar();
        }
    }
}
