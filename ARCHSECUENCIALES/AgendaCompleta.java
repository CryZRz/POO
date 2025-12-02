/*
Programa que crea un archivo con datos de alto nivel y los despliega
en pantalla
*/
import java.io.*;

public class AgendaCompleta {
    public static void main(String[] args) throws IOException {
		int Semestre=0, ciclo=0;
		String Nombre="", NControl="", Observation="";
    	//entrada de datos
    	BufferedReader wrt = new BufferedReader(new InputStreamReader (System.in));
		DataOutputStream salida = new DataOutputStream(new FileOutputStream ("agenda.txt",true));
		do{
			System.out.println("Nombre del alumno: ");
			Nombre=wrt.readLine();
			salida.writeUTF(Nombre);
			
			System.out.println("Semestre en curso: ");
			Semestre=Integer.parseInt(wrt.readLine());
			salida.writeInt(Semestre);
			
			System.out.println("No. de Control: ");
			NControl=wrt.readLine();
			salida.writeUTF(NControl);
			
			System.out.println("Observaciones: ");
			Observation=wrt.readLine();
			salida.writeUTF(Observation);
			
			System.out.println("Si desea salir presione 1");
			ciclo=Integer.parseInt(wrt.readLine());
		}while(ciclo!=1);
		salida.close();
		
		int sem=0;
		String name, num, obv;
		//salida
		DataInputStream entrada = new DataInputStream(new FileInputStream ("agenda.txt"));
		try{
			
			while((name=entrada.readUTF())!=null){
				sem=entrada.readInt();
				num=entrada.readUTF();
				obv=entrada.readUTF();
				System.out.println("Nombre: "+name+" esta en el semestre "+sem+
				" Numero de Control: "+num+" Observaciones. "+obv);
			}
			entrada.close();
		}catch (EOFException e){}
    }
}


