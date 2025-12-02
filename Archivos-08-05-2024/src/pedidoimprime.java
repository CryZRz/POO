/* Parte que despliega los valores del archivo pedido.txt*/ 

import java.io.*;
 class pedidoimprime{
 
 	
 	public static void main(String mio[])throws IOException{
 	
 	double precio;
 	int unidad;
  	String descripcion;
  	double total=0.0;

  	DataInputStream entrada=new DataInputStream(new FileInputStream("pedido.txt"));
  	try {
      while ((descripcion=entrada.readLine())!=null) {
          unidad=entrada.readInt();
          entrada.readChar();       //lee el carácter tabulador
          precio=entrada.readDouble();
          System.out.println("has pedido "+unidad+" "+descripcion+" a "+precio+" pesos cada uno");
          System.out.println();
          total=total+unidad*precio;
      }
	  entrada.close();
  	}catch (EOFException e) {}
  	catch(IOException ex) {
        			
	}
  	System.out.println("por un TOTAL de: "+total+" pts.");
      

 }
}