import java.io.*;
class Atributos
{
	public static void main(String[] arg)
	{
		File miF;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		String cd;
		try
		{
			System.out.print("se teclea un archivo con su ruta" + "o bien un directorio");
			System.out.println("termina con linea vacia");
			do
			{
				cd = entrada.readLine();
				miF=new File(cd);
				if (miF.exists())
				{
					System.out.print(cd+ " esta en el disco ");
					if (miF.isFile())
					{
						System.out.print("  es un archivo");
						System.out.print("  y tiene como tamano " + miF.length());
					}
					else if (miF.isDirectory())
						System.out.println("es un directorio");
					else
						System.out.println("se desconoce que es");
				}
				else if (cd.length()> 0)
					System.out.println("no existe el elemento en disco");
			}while (cd.length() > 0);
			}
			catch(IOException e)
			{
				System.out.println("Excepción " + e.getMessage());
			}
		}
	}