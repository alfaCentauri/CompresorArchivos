/*
 *Programa para comprimir archivos de texto plano en java.
 */

package compresorarchivos;
import java.io.*;
import java.util.zip.*;
/**
 * Programa en java para comprimir archivos.
 * @author Ricardo Presilla
 */
public class CompresorGZIP {
// Lanzar excepciones a la consola:
    public static void main(String[] args) throws IOException {
        File Archivo = new File("Prueba1.txt");
        BufferedReader entrada =new BufferedReader ( new FileReader(Archivo) ) ;
        BufferedOutputStream salida = new BufferedOutputStream (new GZIPOutputStream( new FileOutputStream("prueba2.gz") ) ) ;
        System.out.println("Escribiendo el archivo");
        int c;
        while ( (c = entrada.read( ) ) != -1)
            salida. write (c) ;
        System.out.println("Tamaño del archivo antes de comprimir: "+Archivo.length()+" B");
        entrada.close( ) ;
        salida.close( ) ;
        System.out.println ("Leyendo el archivo") ;
        BufferedReader entrada2 = new BufferedReader ( new InputStreamReader( new GZIPInputStream ( new FileInputStream ("prueba2.gz") ) ) ) ;
        String S;
        while ( (S = entrada2.readLine( ) ) != null)
        System.out.println(S) ;
    }
}
