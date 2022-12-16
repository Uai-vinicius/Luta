package ufc;

public class Lutador {
		
		//atributos do jogador 
	
		private String nome;
		private String nacionalidade;
		private int idade;
		private float altura;
		private float peso;
		private String categoria;
		private int vitorias;
		private int derrotas;
		private int empates;
	
		//metodos especiais 
		
		public void Jogador (String nome, String nacionalidade, int idade, float altura, float peso, float f, int vitorias,
				int derrotas, int empates) {
			//super();
			this.nome = nome;
			this.nacionalidade = nacionalidade;
			this.idade = idade;
			this.altura = altura;
			this.peso = peso;
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
		}
		
		//metodos acessores
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
			this.getCategoria();
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			if (this.getPeso() < 52.2) {
	            this.categoria = "inválido";
	        } else if ( this.getPeso() <= 70.3){
	            this.categoria = "Leve";
	        }else if (this.getPeso() <= 83.9) {
	            this.categoria = "Médio";
	        }else if (this.getPeso() <= 120.2) {
	            this.categoria = "Pesado";
	        }else {
	            this.categoria = "Inválido";
	        }
		}
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
		//metodos especiais 
		public void ganharLuta () {
			this.setVitorias(this.getVitorias () +1);
			
		}
		public void perdeLuta () {
			this.setDerrotas(this.getDerrotas () +1);
		} 
		public void empatarLutar () {
			this.setEmpates (this.getEmpates () +1);
		}
		
		//metodos construtores
		public void apresentar () {
			System.out.println("======BEM VINDO UEC======");
			System.out.println("Apresentamos!!!!");
			System.out.println("O lutador: "+ this.nome);
			System.out.println("sua nacionalidade "+ this.nacionalidade);
			System.out.println("medindo "+ this.altura );
			System.out.println("pesando "+ this.peso);
			System.out.println("Lutando pela categoriab " +this.categoria);
			System.out.println("com "+this.vitorias+ "vitorias");
			System.out.println("e " +this.derrotas+ "derrotas");
		} 
			
		
		public void status () {
			System.out.println("É um peso" +getCategoria());
	        System.out.println(this.getVitorias() + " vitórias");
	        System.out.println(this.getDerrotas() + " derrotas");
	        System.out.println(this.getEmpates() + " empates");
		}
		
}
