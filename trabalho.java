import java.io.*;
import java.net.*;

class Servidor {
	public static void main(String argv[]) throws Exception {
		
		String fraseCliente;
		String frase;

		ServerSocket socketRecepcao = new ServerSocket(6789);
		/*Cria servidor com porta 6789*/
		
		while(true) {
			Socket socketConexao = socketRecepcao.accept();
			/*Aceita conexões*/
			
			BufferedReader doCliente = new BufferedReader(new InputStreamReader(socketConexao.getInputStream()));
			/*Buffer para ler do cliente*/
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
			/*Buffer para ler do teclado*/
			
			DataOutputStream paraCliente = new DataOutputStream(socketConexao.getOutputStream());
			/*Conexão para enviar mensagens para o cliente*/
			
			fraseCliente= doCliente.readLine();
			/*Le a frase enviada do cliente*/
			
			/*Verificar se o cliente digitou sair, se sim sai.*/
			if(fraseCliente.equalsIgnoreCase("Sair")){
				System.out.println("Finalizando aplicação...");
				socketConexao.close();
				return;
			}
			
			System.out.println("Frase do seu amigo: " + fraseCliente);
			/*Faz o Print da frase do cliente*/
			
			System.out.println("Digite uma resposta: ");
			frase= reader.readLine();
			/*Le frase do teclado*/
			
			paraCliente.writeBytes(frase + "\n");
			/*Manda mensagem para o cliente*/
			
			/*Caso eu ter digitado Sair encerra minha conexão*/
			if(frase.equalsIgnoreCase("Sair")){
				System.out.println("Finalizando aplicação...");
				socketConexao.close();
				return;
			}
		}
	}
}

