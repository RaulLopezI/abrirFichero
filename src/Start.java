import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Start {
	static String ruta = "C:/Users/raull/eclipse-workspace/AbrirTexto/hola.txt";
    public static void main(String[] args) throws IOException {
 
        String cont = "";
        // contenido del fichero
 
        File archivo = new File(ruta);
        // creación de archivos
 
 
        try {
            FileReader fr = new FileReader(archivo);
            // lectura del fichero
 
            BufferedReader br = new BufferedReader(fr);
            //lectura del contenido
 
            System.out.println("El contenido del fichero" +  " es: ");
 
            while (cont != null) {
                // ejecutaremos la lectura en bucle
 
                cont = br.readLine();
                // leer linea a linea
 
 
                if (cont != null) {
                 
                    System.out.println(cont);
                }
            }
 
            br.close();
            fr.close();
 
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El fichero no puede abrirse");
        }
 
 
    }
}