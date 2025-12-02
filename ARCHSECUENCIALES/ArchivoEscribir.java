import javax.swing.*;
import java.io.*;
class ArchivoEscribir
{
	public static void main(String [] ars)
	{
		
		String cad="Programacion OO";
		byte [] s = new byte[cad.length()];// tanto elementos que tenga la cadena
		try
		{
			FileOutputStream f= new FileOutputStream("datos1.txt",true);
			cad.getBytes(0,cad.length(),s,0);// copia la cadena en s;
			f.write(s,0,cad.length());
			f.write((byte)'\n');
			System.out.println("ya terminé");
		}
		catch (IOException e)
		{
			System.out.println("anomalía en flujo de salida");
		}
	}
}