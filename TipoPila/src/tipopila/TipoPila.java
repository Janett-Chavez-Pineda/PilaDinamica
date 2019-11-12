package tipopila;
import javax.swing.JOptionPane;
public class TipoPila {   
    public static void main(String[] args) throws Exception {
        
 int a, b;
        int pila[] = new int[10];
        PilaVector objPilaEnteros = new PilaVector();

        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¡Que operacion desea ejecutar?" + "\n 1- Insertar valor" 
                        + "\n 2-Eliminar"
                    + "\n 3-Visualizar Pila de nùmeros" 
                        + "\n 4-Visualizar la Cima" 
                        + "\n 5-Visualizar el Fondo"
                    + "\n 6-No hacer nada"
            ));

            switch (a) {
                case 1:
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe"
                            + " el numero a insertar en la Pila"));
                    objPilaEnteros.insertar(b);
                    break;
                case 2:
                    objPilaEnteros.quitar();
                    break;
                case 3:
                    objPilaEnteros.cimaPila();
                    break;
                case 4:
                    objPilaEnteros.PilaVacia();
                    break;
                case 5:
                    objPilaEnteros.limpiarPila();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        } while (true);    }
    
}
