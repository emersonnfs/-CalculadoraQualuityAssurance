import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemBoasVindasTeste {
	@Test
	   public void testeMensagemBoasVindas() {
	       String boasVindasTeste = "Seja Bem Vindo a Sua Calculadora Digital";
	       MensagemBoasVindas mensagem = new MensagemBoasVindas();
	       String boasVindasReal = mensagem.MostrarMensagem();
	       assertEquals(boasVindasTeste, boasVindasReal);
	       System.out.println(boasVindasTeste);
	   }
	
	@Test
	   public void testeMensagemBoasVindasNome() {
	       String boasVindasTeste = "Seja Bem Vindo a Sua Calculadora Digital Emerson";
	       String nome = "Emerson";
	       MensagemBoasVindas mensagem = new MensagemBoasVindas();
	       String boasVindasReal = mensagem.MostarMensagemNome(nome);
	       assertEquals(boasVindasTeste, boasVindasReal);
	       System.out.println(boasVindasTeste);
	   }
}
