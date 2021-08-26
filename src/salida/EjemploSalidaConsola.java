/*
 *  Autor: Jairo Seoanes
    Fecha: 26-08-2021
    Descricpcion: Clase que describe el uso de impresion en consola
 */
package salida;

/**
 *
 * @author jairo
 */
public class EjemploSalidaConsola {
   
    /**
     * 
     * @param args - parametros para el metodo
     */
    public static void main(String[] args) {
        
        System.out.print("1.Hola Java--");
        System.out.println("2. Hola Java (Imprime salto de linea )");
        System.out.printf("%d. %s%n", 3, "Hola Java (Imprime con formato)");
    }
    
    /**
     * 
     * @param msg contiene el mensaje a mostra en pantalla (Tipo String)
     * @version 1
     */
    public static void imprimirMensaje(String msg){
        System.out.println(msg);
    }
}
