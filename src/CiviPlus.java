package inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CiviPlus {
	
	public Connection abrirConexao() throws SQLException {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/CIVI_PLUS";
		String pass = "EuGostoDeHQ#1997";
		String user = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Drver");
			
			con = DriverManager.getConnection(url, user, pass);
			
			if(con != null) {
				System.out.println("Conectado com sucesso!");
			}
			else {
				System.out.println("Conexão falhou!");
				
			}
		}catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado..." + e);
			
		}catch(SQLException ex) {
			System.out.println("Nao foi possivel se coectar ao banco..." + ex);
			
		}
		
	}
	
	public void fecharConexao() {
		
		if(con != null) {
			try {
				con.close;
			}catch(SQLException e) {
				System.out.println("Falha ao fechar conexão..." + e);
			}
		}	
	}

	public static void main(String[] args){
		
		abrirConexao();

		Scanner sc = new Scanner(System.in);
		
		//declarando variaveis login e senha
		
		String login, senha;
		char resp;
		int pais, continente;
		int cont = 0;
		
		//tela de login (ou inicial)
		
		System.out.println("----------------------");
		System.out.println("        CIVI+       ");
		System.out.println("----------------------");
		
		System.out.println();
		
		//Dados de acesso
		
		System.out.println("Voce ja possui acesso(S/N)? ");
		resp = sc.next().charAt(0);
		
		if(resp == 's' || resp =='S') {
		
			do{
				
				System.out.print("Login: ");
				login = sc.nextLine();
				System.out.println();	
					
				System.out.print("Senha: ");
				sc.nextLine();
				senha = sc.nextLine();
				
				cont++;
		
			}while(login != "gabriel" && senha != "1234" || cont<3);
		
		
		//caso o usuario supere o numero de tentativas sera direcionado
		//para pagina de segurança
		
			if(cont==3) {
				System.out.print("%nVoce atingiu o limite de tentativas de acesso!%n");
				System.out.println("%Redefinir senha");
				
			}
			
			
		//usuario digitou dados de acesso corretamente 
		
			System.out.println("----------------------");
			System.out.println("     Dados vacinais   ");
			System.out.println("----------------------");
			
		//aqui sera apresentado a quantidade e quais vacinas o usuario tomou
		//e quais vacinais
			
			
		//seleção de pais para encontrar informações e
		//saber se tem a vacina necessaria para adentrar no pais de desejo
			
			System.out.println("Pais se encontra em qual continente: ");
			System.out.println("1 para Europa");
			System.out.println("2 para America do norte");
			System.out.println("3 para America Central e do Sul");
			System.out.println("4 para Asia");
			System.out.println("5 para Oceania");
			System.out.println("6 para Africa");
			continente = sc.nextInt();
			
			switch(continente) 
			{
			
			case 1:
				System.out.println("EUROPA selecionada!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para Inglaterra");
				System.out.println("2 para França");
				System.out.println("3 para portugal");
				System.out.println("4 para Espanha");
				System.out.println("5 para Italia");
				System.out.println("6 para Alemanha");
				pais = sc.nextInt();
				
				switch(pais)
				{
				case 1:
					System.out.println("INGLATERRA selecionado!");
				break;
				
				case 2:
					System.out.println("FRANÇA selecionado!");
				break;
				
				case 3:
					System.out.println("PORTUGAL selecionado!");
				break;
				
				case 4:
					System.out.println("ESPANHA selecionado!");
				break;
				
				case 5:
					System.out.println("ITALIA selecionada!");
				break;
				
				case 6:
					System.out.println("ALEMANHA selecionado!");
				break;
				
				default:
					System.out.println("Opção invalida!");
				break;
				}
				
			break;
			
			case 2:
				System.out.println("AMERICA DO NORTE selecionada!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para EUA");
				System.out.println("2 para Canada");
				pais = sc.nextInt();
				
				switch(pais)
				{
				
				case 1:
					System.out.println("EUA selecionado!");
				break;
				
				case 2:
					System.out.println("CANADA selecionado!");
				break;
				
				default:
					System.out.println("Opção invalida!");
				break;
				}
			break;
			
			case 3:
				System.out.println("AMERICA CENTRAL e AMERICA DO SUL selecionados!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para Brasil");
				System.out.println("2 para Mexico");
				System.out.println("3 para Chile");
				System.out.println("4 para Argentina");
				System.out.println("5 para Uruguai");
				System.out.println("6 para Colombia");
				pais = sc.nextInt();
				
				switch(pais)
				{
				
				case 1:
					System.out.println("BRASIL selecionado!");
				break;
				
				case 2:
					System.out.println("MEXICO selecionado!");
				break;
				
				case 3: 
					System.out.println("CHILE selecionado!");
				break;
				
				case 4:
					System.out.println("ARGENTINA selecionada!");
				break;
				
				case 5:
					System.out.println("URUGUAI selecionado!");
				break;
				
				case 6:
					System.out.println("COLOMBIA seleionada!");
				break;
				
				default:
					System.out.println("Opção invalida!");
				break;
				}
			break;
			
			case 4:
				System.out.println("ASIA selecionada!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para China");
				System.out.println("2 para Coreia do Sul");
				System.out.println("3 para Japão");
				System.out.println("4 para India");
				System.out.println("5 para Tailandia");
				pais = sc.nextInt();
				
				switch(pais) {
				
				case 1:
					System.out.println("CHINA selecionada!");
				break;
			
				case 2:
					System.out.println("COREIA DO SUL selecionada!");
				break;
			
				case 3: 
					System.out.println("JAPÃO selecionado!");
				break;
			
				case 4:
					System.out.println("INDIA selecionada!");
				break;
			
				case 5:
					System.out.println("TAILANDIA selecionado!");
				break;
			
				default:
					System.out.println("Opção invalida!");
				break;
				}
			break;
			
			case 5:
				System.out.println("OCEANIA selecionada!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para Australia");
				System.out.println("2 para Nova Zelandia");
				pais = sc.nextInt();
				
				switch(pais) {
				
				case 1:
					System.out.println("AUSTRALIA selecionada!");
				break;
				
				case 2:
					System.out.println("NOVA ZELANDIA selecionada!");
				break;
				
				default:
					System.out.println("Opção invalida!");
				break;
				
				}
			break;
			
			case 6:
				System.out.println("AFRICA selecionada!");
				System.out.println("Qual pais deseja ingressar: ");
				System.out.println("1 para Africa do Sul");
				System.out.println("2 para Egito");
				pais = sc.nextInt();
				
				switch(pais) {
				
				case 1:
					System.out.println("AFRICA selecionada!");
				break;
				
				case 2:
					System.out.println("EGITO selecionada!");
				break;
				
				default:
					System.out.println("Opção invalida!");
				break;
				}
			break;
			
			default:
				System.out.println("Opção invalida!");
			break;
			}
			
		//usuario nao possui acesso
			
		}else if(resp =='n' || resp =='N') {
			
			System.out.println("Informe login e senha: ");
			System.out.print("%nLogin: ");
			login = sc.nextLine();
			sc.nextLine();
			System.out.print("%nSenha: ");
			senha = sc.nextLine();
			System.out.print("%nRepita a senha: ");
			sc.nextLine();
			String senha2 = sc.nextLine();
			
			while(senha != senha2) {
				System.out.print("%nSenha: ");
				senha = sc.nextLine();
				System.out.print("%nRepita a senha: ");
				sc.nextLine();
				String senha2 = sc.nextLine();
				
				if(!senha.equals(senha2)) {
					System.out.println("Senha digitada incorretamente...");
				}
				if(!senha.contains(int) && !senha.contains("!") || !senha.contains("@") || !senha.contains("#") || !senha.contains("$")
					|| !senha.contains("%") || !senha.contains("&") || !senha.contains("*") || !senha.contains("_") || !senha.contains("-")
					|| !senha.contains("+") || !senha.contains("=") || !senha.contains("/") || !senha.contains("?") || !senha.contains("¨")) {
					
					System.out.println("Senha não contém caracteres especiais ou numericos...");
				}
					
			}
			
		//usuario digitou opção diferente de S ou N
			
		}else {
			System.out.println("Opção invalida!");
		}
		
		fecharConexao();
		sc.close();
	}

}
