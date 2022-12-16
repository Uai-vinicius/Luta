package ufc;
import java.util.Random;

public class Round {
	
	private Lutador desafiado;
	private Lutador desafiante;
	   private int rounds;
	    private boolean aprovada;
	    
	    public void marcarLuta(Lutador jg1, Lutador jg2){
	        if (jg1.getCategoria().equals(jg2.getCategoria()) && jg1 != jg2) {
	            this.aprovada = true;
	            this.desafiado = jg1;
	            this.desafiante = jg2;
	        } else {
	            this.aprovada = false;
	            this.desafiado = null;
	            this.desafiante = null;
	        }
	    }
	    public void lutar(){
	        if (this.aprovada){
	            System.out.println("### DESAFIADO ###");
	            this.desafiado.apresentar();
	            System.out.println("### DESAFIANTE ###");
	            this.desafiante.apresentar();

	            Random aleatorio = new Random();
	            int vencedor = aleatorio.nextInt();
	            switch (vencedor){
	                case 0: //empate
	                    System.out.println("Empatou!");
	                    this.desafiado.empatarLutar();
	                    this.desafiante.empatarLutar();
	                    break;
	                case 1: //desafiado vence
	                    System.out.println("Vitória do: " + this.desafiado.getNome());
	                    this.desafiado.ganharLuta();
	                    this.desafiante.perdeLuta();
	                    break;
	                case 2: //desafiante vence
	                    System.out.println("Vitória do: " + this.desafiante.getNome());
	                    this.desafiante.ganharLuta();
	                    this.desafiado.perdeLuta();
	                    break;
	                default:
	                    break;
	            }
	        }else {
	            System.out.println("A luta não pode acontecer");
	        }
	    }

	    //métodos especiais

	    public Lutador getDesafiado() {
	        return desafiado;
	    }

	    public void setDesafiado(Lutador desafiado) {
	        this.desafiado = desafiado;
	    }

	    public Lutador getDesafiante() {
	        return desafiante;
	    }

	    public void setDesafiante(Lutador desafiante) {
	        this.desafiante = desafiante;
	    }

	    public int getRounds() {
	        return rounds;
	    }

	    public void setRounds(int rounds) {
	        this.rounds = rounds;
	    }

	    public boolean isAprovada() {
	        return aprovada;
	    }

	    public void setAprovada(boolean aprovada) {
	        this.aprovada = aprovada;
	    }
	
	
	
}
