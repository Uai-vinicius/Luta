package ufc;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Lutador  jg [] = new  Lutador [ 4 ]; //criando o objeto
		 
		 jg [0] = new Lutador ();
		 //criando o objetos a partir da arrays 
		 
		 jg [1] = new Lutador ();
		 
		 
		 
		 
		Round lt1 = new Round ();
		lt1.marcarLuta(jg [1], jg[0]);
		lt1.lutar();

	}       
	}


