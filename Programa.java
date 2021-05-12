import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import java.util.*; // Pendiente!

public class Programa{

	public static void main(String[] args) {
                                                                        
       System.out.println("  _____            _      _____      _       _     __  __           _      ");
       System.out.println(" |  __ \\          | |    |  __ \\    (_)     | |   |  \\/  |         (_)     ");
       System.out.println(" | |__) |___   ___| | __ | |__) | __ _ _ __ | |_  | \\  / |_   _ ___ _  ___ ");
       System.out.println(" |  _  // _ \\ / __| |/ / |  ___/ '__| | '_ \\| __| | |\\/| | | | / __| |/ __|");
       System.out.println(" | | \\ \\ (_) | (__|   <  | |   | |  | | | | | |_  | |  | | |_| \\__ \\ | (__ ");
       System.out.println(" |_|  \\_\\___/ \\___|_|\\_\\ |_|   |_|  |_|_| |_|\\__| |_|  |_|\\__,_|___/_|\\___|");
       System.out.println("");                                                                         

 
     
      System.out.println("                                                                   /`  `'-.");
      System.out.println("                                                                  |     _  `\\");
      System.out.println("                                                                  \\'-,'` \\   |");
      System.out.println("          Bienvenid@ a Rock Print Music                             /a a  |  /");
      System.out.println("        Ingrese la opción de su preferencia                        \\ __, `/");
      System.out.println("                                                                      .'`\\___.'('-.__");
      System.out.println("                                                                /__ ;    /_   \\ `\\");            
      System.out.println("        1. Buscar canción                                      .`))'`\\.'`  \\___\\  \\");
      System.out.println("        2. Mostrar información de la canción                  /  ((  |o       ))   \\");
      System.out.println("        3. Mostrar letra                        /   ))  |        ((    \\");
      System.out.println("        4. Reproducir canción               `-,   `',,,._.-' '-./))  |        (.'   /");
      System.out.println("        5. Detener canción                     '--`//// '-._ _.' (( _|o      .'  _.'");
      System.out.println("        6. Imprimir lista de canciones             \\```';-._'-._ ))( `-._.-'/__ /,");
      System.out.println("        7. Salir                                    `\"\"`    '-._'-;_)      /  /   \\");
      System.out.println("                                                                '-,_'-._(`-||||    \\");
      System.out.println("                                                               _.-' '-.//-.\\\\\\\\_.-.|");
      System.out.println("                                                              (     .-' _.. ````;-.|");
      System.out.println("                                                               '--;-.`-'   '._.'   /");
      System.out.println("                                                                 /   `'.         .'");
      System.out.println("                                                                /      /`'-----'`|");
      System.out.println("                                                               /      /    |     |");
      System.out.println("                                                              /     /`     |     |");
      System.out.println("                                                             |     |       |_    |");
      System.out.println("                                                             |     |         \\     \\");
      System.out.println("                                                             |     |           \\     \\");
      System.out.println("                                                           _.\'`----;          .\'     |");
      System.out.println("                                                          '---'`              `\"\"\"`");                                                                      
	}


	public static String convertirUnicode(String letra,String cadena){
		
		StringBuilder str = new StringBuilder(cadena);
		int indice = -1;
		char caracter = 0;
		indice = str.lastIndexOf(letra);
		
		if(indice>=0 )
		{
			switch(letra){
				
				case "á": caracter = '\u00E1';
					      break;
				case "é": caracter = '\u00E9';
					      break;
				case "í": caracter = '\u00ED';
					      break;
		        case "ó": caracter = '\u00F3';
					      break;
			    case "ú": caracter = '\u00FA';
					      break;
				case "ñ": caracter = '\u00F1';
					      break;
			}
			// System.out.println("\\u" + Integer.toHexString('÷' | 0x10000).substring(1));
			str.replace(indice,indice+1,""+caracter);
		}

		return str.toString();
	} 


	public static void imprimir(String cadena)
	{
		String str; 
		
		str = convertirUnicode("á",str);
		str = convertirUnicode("é",str);
		str = convertirUnicode("í",str);
		str = convertirUnicode("ó",str);
		str = convertirUnicode("ú",str);
		str = convertirUnicode("ñ",str);

		System.out.println(str);
	}

	public static StringBuilder obtenerLetraCancion(int inicio,int fin, String[]data)
	{
		StringBuilder str = new StringBuilder();
		

		for(int i = inicio; i<=fin; i++)
		{
		  str.append(data[i]+"\n");
		}

		return str;
	}

	public static void main(String[] args) {
		
		//AnsiConsole.systemInstall();
		
		Audio audio = new Audio();
		int centinela = 0;	
		int indice_cancion = 0;
		int inicio_letra = 0, fin_letra = 0;
		String [] canciones;
		String [][] info_canciones;
		StringBuilder letra_cancion;

		canciones = ConsoleFile.readBigFile("recursos/letras.csv");
		info_canciones = ConsoleData.dataList(canciones);







}
                                                                        
	

	     
	
