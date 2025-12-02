//Este archivo lee al archivo datos.txt utilizando FileInput despues de haber utilizado FileOutput

import java.io.*;
class ArchivoLeer
{
	public static void main (String [] ars)
	{
		byte [] s = new byte [80];
		try{
			File f= new File("datos1.txt");
			FileInputStream f2= new FileInputStream(f);
			System.out.println("En el archivo datos hay");
			byte c[] = new byte[(int)f.length()];
    	    f2.read(c);
    		String cadena = new String(c);
    		System.out.println(cadena);
    		f2.close();
		}catch(IOException e){}
	}
}