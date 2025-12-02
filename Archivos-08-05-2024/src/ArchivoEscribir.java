import javax.swing.*;
import java.io.*;
class ArchivoEscribir
{
	public static void main(String [] ars)
	{
		
		String cad="Hello world";
		byte [] s = new byte[cad.length()];// tanto elementos que tenga la cadena
		try
		{
			FileOutputStream f= new FileOutputStream("regalos_para_mama.txt");
			cad = JOptionPane.showInputDialog("Ingresa el regalo");
			cad.getBytes(0,cad.length(),s,0);// copia la cadena en s;
			f.write(s,0,cad.length());
			f.write((byte)'\n');
			System.out.println("ya termin�");
		}
		catch (IOException e)
		{
			System.out.println("anomal�a en flujo de salida");
		}
	}
}