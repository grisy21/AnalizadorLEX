
package codigo;

import java.io.File;
/**
 *
 * @author Grisely Morales
 */
public class Analizadorlex {

    public static void main(String[] args) {
    String ruta = "C:/Users/Grisely Morales/Documents/NetBeansProjects/analizadorlex/src/main/java/codigo/analizador.flex";
    generarlexer(ruta);
}

  
    public static void generarlexer(String ruta)
    {
    File archivo =new File(ruta);
     JFlex.Main.generate(archivo);
    } 
}
