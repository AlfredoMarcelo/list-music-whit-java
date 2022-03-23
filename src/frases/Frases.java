package frases;

public class Frases {
	
	public static void main(String[] args) {
		/*if(args.length == 0) {
			//System.out.println("Ingresa 0 para ver las canciones");
			mostrarCancion();
		}else {
			mostrarLista();
		}*/
		
		String opcion = args[0];
		switch (opcion) {
		case "cancion":
			mostrarCancion();
			break;
		case "lista":
			mostrarLista();
			break;
		default:
			System.out.println("Debes escribir *cancion* para ver una cancion al azar o *lista* si deseas ver todas las canciones");
			break;
		}
	}
	
	public static String[] canciones = {
		"A-Ha – Take On Me",
		"Al Corley – Square Rooms",
		"Anything Box – Living In Oblivion",
		"Baltimora – Tarzan Boy",
		"Boy George – The Crying Game",
		"Bruce Springsteen – Dancing In The Dark",
		"Erasure – Little a Respect",
		"Freddie Mercury – Living On My Own",
		"F. R. David – Words",
		"George Michael – Careless Whisper",
		"Glenn Frey – You Belong To The City",
		"Limahl – The Neverending Story",
		"Madonna – La Isla Bonita",
		"Orchestral Manoeuvres In The Dark – Pandora’s Box",
		"Q Lazzarus – Goodbye Horses",
		"Rick Astley – Never Gonna Give You Up",
		"Spandau Ballet – True",
		"The Beloved – Sweet Harmony",
		"The Cars – You Are The Girl",
		"When In Rome – The Promise"
	};
	
	//manera de crear funciones en java linea 40 y 49
	
	public static void mostrarCancion() {
		double numeroAleatorio = Math.random() * canciones.length;
		int numeroAleatorioEntero = (int) numeroAleatorio; //esto es hacer casting 
		System.out.println("Aquí está tu tema, disfrutalo :) \n" + canciones[numeroAleatorioEntero]);
	}
	
	
	public static void mostrarLista() {
		for(int i = 0; i < canciones.length; i++) {
			System.out.println(i+1 +". " + canciones[i]);
		}

		
	}
	
	

}
