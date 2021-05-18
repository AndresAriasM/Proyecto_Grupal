import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import java.util.*;

public class Programa{

	public static String convertirUnicode(String letra,String cadena){
		
		StringBuilder str = new StringBuilder(cadena);
		int indice = -1;
		char caracter = 0;
		indice = str.lastIndexOf(letra);
		
		if(indice>=0 )
		{
			switch(letra){
				case "Á": caracter = '\u00C1';
						  break;
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
			
			str.replace(indice,indice+1,""+caracter);
		}

		return str.toString();
	}

	public static void imprimir(String cadena)
	{
		String str; 
		str = convertirUnicode("Á",cadena);
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
		StringTokenizer temp;

		for(int i = inicio; i<=fin; i++)
		{
			

			temp = new StringTokenizer(data[i],";");

			while(temp.hasMoreTokens())
			{
				System.out.print(temp.nextToken()+" ");
			}
			System.out.println();
			
		}

		return str;
	}

	public static void Interfaz()
	{
                                                                        
  System.out.println("          _____            _      _____      _       _     __  __           _      ");
  System.out.println("         |  __ \\          | |    |  __ \\    (_)     | |   |  \\/  |         (_)     ");
  System.out.println("         | |__) |___   ___| | __ | |__) | __ _ _ __ | |_  | \\  / |_   _ ___ _  ___ ");
  System.out.println("         |  _  // _ \\ / __| |/ / |  ___/ '__| | '_ \\| __| | |\\/| | | | / __| |/ __|");
  System.out.println("         | | \\ \\ (_) | (__|   <  | |   | |  | | | | | |_  | |  | | |_| \\__ \\ | (__ ");
  System.out.println("         |_|  \\_\\___/ \\___|_|\\_\\ |_|   |_|  |_|_| |_|\\__| |_|  |_|\\__,_|___/_|\\___|");
  System.out.println("");                                                                         

 System.out.println("--------------------------------------------------------------------------------------------------");    
 System.out.println("|                                                                   /`  `'-.                     |");
 System.out.println("|                                                                  |     _  `\\                   |");
 System.out.println("|                                                                  \\'-,'` \\   |                  |");
 System.out.println("|          Bienvenid@ a Rock Print Music                             /a a  |  /                  |");
 System.out.println("|        Ingrese la opción de su preferencia                        \\ __, `/                     |");
 System.out.println("|                                                                      .'`\\___.'('-.__           |");
 System.out.println("|                                                                /__ ;    /_   \\ `\\              |");            
 System.out.println("|        1. Buscar canción                                      .`))'`\\.'`  \\___\\  \\             |");
 System.out.println("|        2. Mostrar información de la canción                  /  ((  |o       ))   \\            |");
 System.out.println("|        3. Mostrar letra                        /   ))  |        ((    \\                        |");
 System.out.println("|        4. Reproducir canción               `-,   `',,,._.-' '-./))  |        (.'   /           |");
 System.out.println("|        5. Detener canción                     '--`//// '-._ _.' (( _|o      .'  _.'            |");
 System.out.println("|        6. Imprimir lista de canciones             \\```';-._'-._ ))( `-._.-'/__ /,              |");
 System.out.println("|        7. Salir                                    `\"\"`    '-._'-;_)      /  /   \\             |");
 System.out.println("|                                                                '-,_'-._(`-||||    \\            |");
 System.out.println("|                                                               _.-' '-.//-.\\\\\\\\_.-.|            |");
 System.out.println("|            ;                   ;;;;;;;;;;;;;;;;;             (     .-' _.. ````;-.|            |");
 System.out.println("|            ;;                  ;               ;              '--;-.`-'   '._.'   /            |");
 System.out.println("|            ;´;.                ;               ;                /   `'.         .'             |");
 System.out.println("|            ;  ;;               ;               ;               /      /`'-----'`|              |");
 System.out.println("|            ;   ;;              ;               ;              /      /    |     |              |");
 System.out.println("|            ;    ;              ;               ;             /     /`     |     |              |");
 System.out.println("|            ;   ;;              ;               ;            |     |       |_    |              |");
 System.out.println("|       ,;;;,;    ´         ,;;;,;          ,;;;,;            |     |         \\     \\            |");
 System.out.println("|       ;;;;;;              ;;;;;;          ;;;;;;            |     |           \\     \\          |");
 System.out.println("|       ´;;;;´              ´;;;;´          ´;;;;´          _.\'`----;          .\'     |          |");
 System.out.println("|                                                          '---'`              `\"\"\"`             |");
 System.out.println("--------------------------------------------------------------------------------------------------");                                                                       
                                                                          

 System.out.println("|    La idea de Rockprint Music es inculcarte cultura musical del género rock, para ello, es     |");
 System.out.println("|   necesario que sigas el orden del menú. Recuerda tener presente el numero que se te asigne    |");	
 System.out.println("|              en el paso 1, deberás digitarlo cada vez que te pida ingresarlo.                  |");
 System.out.println("--------------------------------------------------------------------------------------------------");	

    }

	
  public static void main(String[] args) {
		

		AnsiConsole.systemInstall();
    	Audio audio = new Audio();
        Random randomGenerator = new Random ();
    	int centinela = 0;
        int indice_cancion = 0;
        int inicio_letra = 0, fin_letra = 0;
		Random rand = new Random();
    	
    	String [] canciones = ConsoleFile.readBigFile("recursos/letras.csv");
    	String [][] info_canciones = ConsoleData.dataList(canciones);
        StringBuilder letra_cancion;
       
		int min = 0;
		int max = 18;
		int randomnumber = (int)Math.floor(Math.random()*(max-min+1)+min);
		
  
		try{


			 do{

			 	System.out.println();
			 	Interfaz();
			 	centinela = ConsoleInput.getInt();

			 	if(centinela == 1)
			 	{
			 		System.out.println("Cada canción del programa esta asociada a un número");
			 		System.out.println("Se te asignará uno aleatorio para hacerlo mas divertido");
			 		System.out.println("");
			        System.out.println("El nÚmero de canción aleatoria es: " +  randomnumber);
                    System.out.println("Ese número será la referencia para los demás pasos");
    		                        		                    
                }

			 	if(centinela == 2)
			 	{


			 		imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();


                    imprimir("Autor: "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
                    imprimir(" ");
                    imprimir("Año: "+info_canciones[indice_cancion][ConsoleData.FECHA_CANCION]);                    
                    imprimir(" ");
					imprimir("Inspiración: "+info_canciones[indice_cancion][ConsoleData.INSPIRACION_CANCION]);
					imprimir(" ");
					imprimir("Contexto historico: "+info_canciones[indice_cancion][ConsoleData.DESCRIPCION_CANCION]);
			 	}

			 	if(centinela == 3)
			 	{
			 		imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();

					inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);
					
					letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);
			 	}

			 	if(centinela == 4)
			 	{
			 		imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();
					audio.seleccionarCancion(info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
					audio.reproducir();
			 	}

			 	if(centinela == 5)
			 	{
			 		audio.detener();
			 	}

			 	if(centinela == 6)
			 	{
			 		imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
					indice_cancion = ConsoleInput.getInt();

					inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);

					System.out.println();
					imprimir("Inicio letra "+inicio_letra);
					imprimir("Fin letra "+fin_letra);
					imprimir("Nombre "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]);
					imprimir("Autor "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
					imprimir("Archivo "+info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);

					imprimir("Primera estrofa: "+canciones[inicio_letra]);
					imprimir("Última estrofa: "+canciones[fin_letra]);
			 	}
		    }while(centinela!=7);
		  }
		  catch(Exception e)
		  {
		  	System.out.println(e);
		  }
		  finally{
		  	audio.detener();
		  }  
        
    }

}
