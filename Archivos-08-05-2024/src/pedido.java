/* Programa que genera un archivo llamado pedido.txt y da el total a pagar */


import java.io.*;
import javax.swing.*;
public class pedido
{
 public static void main(String[] a)throws IOException
 {
 
 
  double[] precios={1350, 400, 890, 6200, 8730};
  int[] unidades={5, 7, 12, 8, 30};
  String [] descripciones={"paquetes de papel ", "lapices ","boligrafos ", "carteras ", "mesas "};
  	try{
  		DataOutputStream salida=new DataOutputStream(new FileOutputStream("pedido.txt", true));
   		for (int i=0; i<precios.length; i ++) {
   			// salida.writeUTF(descripciones[i]);
   		  	          
   	
      	     salida.writeChars(descripciones[i]);
     		 salida.writeChar('\n');
     		 salida.writeInt(unidades[i]);
      		 salida.writeChar('\t');
     		 salida.writeDouble(precios[i]);
         }	     
    salida.close(); 
 	}catch(IOException ex) {
        			
	}
}
}	 
	
	 

