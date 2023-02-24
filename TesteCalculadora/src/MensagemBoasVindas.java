
public class MensagemBoasVindas {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String MostrarMensagem(){
		String mensagem="Seja Bem Vindo a Sua Calculadora Digital";
		return (mensagem);
	}
	public String MostarMensagemNome(String nome){
		String mensagem ="Seja Bem Vindo a Sua Calculadora Digital";
		mensagem = mensagem + " " + nome;
		return (mensagem);
	}
	
	public MensagemBoasVindas(){
		
	}
	public MensagemBoasVindas(String nome) {
		super();
		this.nome = nome;
	}
	
}
