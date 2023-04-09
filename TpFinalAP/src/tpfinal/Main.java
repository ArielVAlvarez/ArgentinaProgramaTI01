package tpfinal;

public class Main {

	public static void main(String[] args) {

		//no me deja lle el archivos donde esan los tuyos, no 
		//entiendo porque puse una carpeta \ArgentinaProgramaTI01\archivos
		//para que lo encuentre fijate si enconras el error.
		
		Participantes participantes = new Participantes();
		
		participantes.armarListaParticipantes("archivos/participantes.csv");
		participantes.ListarParticipantes();
		
		//Juego juego = new Juego();
		//juego.resolverJuego();

	}

}
