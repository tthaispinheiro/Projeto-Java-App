package appstorefactory;

import java.util.Scanner;

import appstorefactoryFree_Premium.App_Gratuito;
import appstorefactoryFree_Premium.App_Pago;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		String opcao = null;
		String contas = "E:\\workspace-projeto-final\\Contas\\";
		String aplicativos = "E:\\workspace-projeto-final\\Contas\\Aplicativos\\";

		do {

			System.out.println("Menu");
			System.out.println("1-Criar Conta Desenvolvedor PESSOA FISICA");
			System.out.println("2-Criar Conta Desenvolvedor PESSOA JURIDICA");
			System.out.println(" ");
			System.out.println("3-Cadastrar CART�O PESSOA FISICA");
			System.out.println("4-Cadastrar CART�O PESSOA JURIDICA");
			System.out.println(" ");
			System.out.println("5-Cadastrar APLICATIVO GRATUITO");
			System.out.println("6-Cadastrar APLICATIVO PAGO");
			System.out.println(" ");

			System.out.println("7-EXIBIR CONTAS Pessoa F�SICA");
			System.out.println("8-EXIBIR CONTAS Pessoa JUR�DICA");
			System.out.println(" ");
			System.out.println("9-EXIBIR aplicativos Gratuitos");
			System.out.println("10-EXIBIR aplicativos Pagos");

			System.out.println(" ");

			System.out.println("11-DELETAR CONTA DE PESSOA FISICA");
			System.out.println("12-DELETAR CONTA DE PESSOA JURIDICA");

			System.out.println(" ");
			System.out.println("13-DELETAR APP GRATUITO ");
			System.out.println("14-DELETAR APP PAGO ");

			System.out.println("0 - SAIR");
			System.out.println(" ");

			opcao = ler.nextLine().trim();

			switch (opcao) {

			case "1": {
				{ // CRIAR CONTA PESSOA FISICA

					Fisica pessoaFisica = new Fisica(); // INSTANCIANDO O OBJETO PESSOA FISICA
					System.out.println("Voc� escolheu Criar Conta Desenvolvedor PESSOA FISICA ");
					System.out.println(" ");

					do {

						System.out.print("Nome Completo: ");
						pessoaFisica.setNome(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS
						System.out.println(" ");

					} while (!pessoaFisica.verificarNome()); // TRATAR O NOME

					do {

						System.out.print("Cpf: " + "Formato: 000.000.00 ");
						pessoaFisica.setCpf(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS
						

					} while (!pessoaFisica.verificarCpf()); // TRATAMENTO CPF

					do {
						System.out.print("RG: " + "Formato: 000.000.000-4");
						pessoaFisica.setRg(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarRg()); // TRATAMENTO RG

					do {

						System.out.print("Telefone: " + "Formato: (21)9999-9999 ");
						pessoaFisica.setTelefone(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarTelefone()); // TRATAMENTO TELEFONE

					do {

						System.out.print("Crie um nome de usu�rio: " + " " + "(precisa ter 8 caracteres)");
						pessoaFisica.setNomedeUsuario(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarUsuario()); // TRATAMENTO USUARIO

					do {

						System.out.print("Cria uma senha: " + " " + "(precisa ter 10 caracteres)");
						pessoaFisica.setSenha(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarSenha()); // TRATAMENTO SENHA

					do {

						System.out.print("Endere�o:  ");
						pessoaFisica.setEndereco(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarEndereco()); // TRATAMENTO ENDERE�O

					do {

						System.out.print("Email: " + "Formato: exemple@.com");
						pessoaFisica.setEmail(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarEmail()); // TRATAMENTO EMAIL

					do {

						System.out.print("Site: " + "formato: www.ex.com.br");
						pessoaFisica.setSite(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!pessoaFisica.verificarSite()); // TRATAMENTO SITE

					if (pessoaFisica.cadastrar(contas)) {

						System.out.print("Cadastro de Pessoa F�sica, realizado com sucesso!!");
						System.out.println(" ");

					} else {

						System.out.print("Erro ao cadastrar! Tente novamente ou mais tarde!");
						System.out.println(" ");

					}
				}

				break;
			}

			case "2": { // CRIAR CONTA PESSOA JURIDICA

				Juridica pessoaJuridica = new Juridica(); // INSTANCIANDO OBJETO

				System.out.println("Voc� escolheu Criar Conta Desenvolvedor PESSOA JURIDICA ");
				System.out.println(" ");

				System.out.println("Raz�o Social: ");
				pessoaJuridica.setRazaoSocial(ler.nextLine().trim());

				System.out.println("Nome Fantasia: ");
				pessoaJuridica.setNome(ler.nextLine().trim());

				do {

					System.out.println("CNPJ: " + "Formato: 00.000.000/0001-00");
					pessoaJuridica.setCnpj(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (pessoaJuridica.verificarCnpj()); // TRATAMENTO CNPJ

				do {
					System.out.println("N�mero de Inscri��o: " + "Formato: 000.000.000.000"); // 12
					pessoaJuridica.setNumeroDeInscricao(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (!pessoaJuridica.verificarNumeroInscricao()); // TRATAMENTO CNPJ

				do {

					System.out.println("Telefone Comercial: " + "Formato: (21)3333-3333");
					pessoaJuridica.setTelefone(ler.nextLine()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (!pessoaJuridica.verificarTelefone()); // TRATAMENTO TELEFONE

				do {

					System.out.println("Endere�o Comercial: "); // ENDERE�O COMERCIAL
					pessoaJuridica.setEndereco(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (!pessoaJuridica.verificarEndereco()); // TRATAMENTO ENDERE�O

				do {

					System.out.println("Crie um nome de Usu�rio: " + "(precisa ter 8 caracteres)");
					pessoaJuridica.setNomedeUsuario(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (!pessoaJuridica.verificarUsuario()); // TRATAMENTO USU�RIO

				do {

					System.out.println("Crie uma senha: " + "(precisa ter 10 caracteres)");
					pessoaJuridica.setSenha(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

				} while (!pessoaJuridica.verificarSenha()); // TRATAMENTO SENHA

				do {

					System.out.println("E-mail: " + "Formato: exemplo@.com"); // EMAIL
					pessoaJuridica.setEmail(ler.nextLine().trim());

				} while (!pessoaJuridica.verificarEmail());

				do {

					System.out.println("Caso tenha algum site, favor informar: " + "Formato: www.exx.com.br"); // SITE
					pessoaJuridica.setSite(ler.nextLine().trim());

				} while (!pessoaJuridica.verificarSite());

				if (pessoaJuridica.cadastrar(contas)) {

					System.out.println("Cadastro de Pessoa Jur�dica,realizado com sucesso!!");
					System.out.println(" ");

				} else {

					System.out.println("Erro ao cadastrar! Tente novamente ou mais tarde!");
					System.out.println(" ");

				}

				break;
			}

			case "3": { // CADASTRAR CART�O PESSOA FISICA

				Fisica cdCartao = new Fisica();

				System.out.println("Voc� escolheu Cadastrar CART�O PESSOA FISICA ");
				System.out.println(" ");

				System.out.print("Informe o cpf que deseja cadastrar o cart�o: " + "Formato: 000.000.000-00");																							// USUARIO
				String cpfProcurado = ler.nextLine().trim();

				if (cpfProcurado.equalsIgnoreCase(cpfProcurado)) {

					do {

						System.out.print("N�mero do cart�o: " + "(M�ximo de n�meros: 14 ou 16 n�meros"); // CADASTR
																											// CART�O
						cdCartao.setNumeroCartao(ler.nextLine().trim());

					} while (!cdCartao.verificarCartao());

					do {

						System.out.print("C�digo de seguran�a : " + "(Formato: 123)"); // CADASTR COD SEG
						cdCartao.setCodSeguranca(Integer.parseInt(ler.nextLine().trim()));

					} while (!cdCartao.verificarCodSeguranca());

					do {

						System.out.print("Validade: " + ("formato 00/00")); // CADASTR DATA DE VAL
						cdCartao.setValidadeCartao(ler.nextLine().trim());

					} while (!cdCartao.verificarDataValidade());

					do {

						System.out.print("Titular do Cart�o: " + "(Formato: JO�O S DANTAS)");
						cdCartao.setTitulardoCartao(ler.nextLine().trim());

					} while (!cdCartao.VerificartitularDoCartao());

					if (cdCartao.cadastrarCartao(contas, cpfProcurado)) {

						System.out.print("Cart�o cadastrado com sucesso!!: ");
						System.out.println(" ");

					} else {

						System.out.print("Erro ao cadastrar ");
						System.out.println(" ");

					}

				}

				break;
			}

			case "4": { // CADASTRAR CART�O PESSOA JURIDICA

				Juridica cdCartao = new Juridica();

				System.out.println("Voc� escolheu Cadastrar CART�O PESSOA JUR�DICA ");
				System.out.println(" ");

				System.out.println("Informe o CNPJ que deseja cadastrar o cart�o: "); // CADASTRAR CARTAO
				String cnpjProcurado = ler.nextLine().trim();

				if (cnpjProcurado.equalsIgnoreCase(cnpjProcurado)) {

					do {

						System.out.print("N�mero do cart�o: " + "Formato: 0000 0000  0000 0000"); // NUMERO DO CART�O
						cdCartao.setNumeroCartao(ler.nextLine().trim()); // LIMPANDO OS ESPA�OS VAZIOS

					} while (!cdCartao.verificarCartao()); // LOOPING

					do {

						System.out.print("C�digo de seguran�a : " + "Formato: 155");
						cdCartao.setCodSeguranca(Integer.parseInt(ler.nextLine().trim()));

					} while (!cdCartao.verificarCodSeguranca());

					System.out.print("Validade: " + "Formato: 00/00");
					cdCartao.setValidadeCartao(ler.nextLine());

					System.out.print("Titular do Cart�o: " + "Formato: JOAO S SILVA");
					cdCartao.setTitulardoCartao(ler.nextLine().trim());

					if (cdCartao.cadastrarCartao(contas, cnpjProcurado)) {

						System.out.print("Cart�o cadastrado com sucesso!!: ");
						System.out.println(" ");

					} else {

						System.out.print("Erro ao cadastrar ");
						System.out.println(" ");

					}

				}

				break;
			}

			case "5": {// CADASTRAR APLICATIVO GRATUITO

				App_Gratuito ap = new App_Gratuito();

				System.out.println("Voc� escolheu Cadastrar APLICATIVO GRATUITO ");
				System.out.println(" ");

				do {

					System.out.print("Nome do Aplicativo: "); // NOME DO APP
					ap.setNomeApp(ler.nextLine().trim());

				} while (!ap.verificarNomeApp());

				do {

					System.out.print("Categoria: "); // CATEGORIA
					ap.setCategoria(ler.nextLine().trim());

				} while (!ap.verificarCategoria());

				System.out.print("Vers�o:  " + "Formato: 1.0"); // VERS�O
				ap.setVersao(Double.parseDouble(ler.nextLine()));

				do {

					System.out.print("Notas da Vers�o: "); // NOTAS DAS VERS�O
					ap.setNotasDaVersao(ler.nextLine().trim());

				} while (!ap.verificarNotasDaVersao());

				System.out.print("Politica de privacidade: "); // POLITICA DE PRIVACIDADE
				ap.setPoliticaDePrivacidade(ler.nextLine().trim());

				do {

					System.out.print("E-mail de suporte: " + "Formato: email@outlook.com");
					ap.setEmailSuporte(ler.nextLine().trim());

				} while (!ap.verificarEmail());

				do {

					System.out.print("P�blico Alvo: "); // PUBLICO ALVO
					ap.setPublicoAlvo(Integer.parseInt(ler.nextLine()));

				} while (!ap.verificarPublicoAlvo());

				System.out.print("Permiss�es:  ");
				ap.setPermissoes(ler.nextLine().trim());

				do {

					System.out.print("Compatibilidade: " + "Formato: Android e IOS"); // COMPATIBILIDADE
					ap.setCompatibilidade(ler.nextLine().trim());

				} while (!ap.verificarCompatibilidade());

				do {

					System.out.print("Adicione Anuncios: " + "(Adicionar no m�ximo 4)"); // ADICIONAR ANUNCIOS
					ap.setAddAnuncios(ler.nextLine().trim());

				} while (!ap.verificarAnuncios());

				if (ap.cadastrarApp(aplicativos)) {

					System.out.print("Aplicativo cadastrado com sucesso!");
					System.out.println(" ");

				} else {

					System.out.print("Erro ao tentar cadastrar! Tente novamente ou mais tarde.");
					System.out.println(" ");

				}
				break;
			}

			case "6": { // CADASTRAR APP PAGO

				App_Pago ap = new App_Pago();
				System.out.println("Voc� escolheu Cadastrar APLICATIVO PAGO ");
				System.out.println(" ");

				do {

					System.out.print("Nome do Aplicativo: "); // NOME DO APP
					ap.setNomeApp(ler.nextLine().trim());

				} while (!ap.verificarNomeApp());

				do {

					System.out.print("Categoria: "); // CATEGORIA
					ap.setCategoria(ler.nextLine().trim());

				} while (!ap.verificarCategoria());

				do {

					System.out.print("Vers�o:  " + "Formato: 2.0"); // VERSAO
					ap.setVersao(Double.parseDouble(ler.nextLine().trim()));

				} while (!ap.verificarCategoria());

				do {

					System.out.print("Notas da Vers�o: "); // NOTAS DA VERS�O
					ap.setNotasDaVersao(ler.nextLine().trim());

				} while (!ap.verificarNotasDaVersao());

				System.out.print("Politica de privacidade: "); // POLITICA DE PRIVACIDADE
				ap.setPoliticaDePrivacidade(ler.nextLine().trim());

				do {

					System.out.print("E-mail de suporte: " + "Formato: suport@.com"); // VEFIFICAR EMAIL
					ap.setEmailSuporte(ler.nextLine().trim());

				} while (!ap.verificarEmail());

				do {

					System.out.print("P�blico Alvo: "); // PUBLICO ALVO
					ap.setPublicoAlvo(Integer.parseInt(ler.nextLine().trim()));

				} while (!ap.verificarPublicoAlvo());

				System.out.print("Permiss�es:  "); // PERMISS�ES. VERIFICAR DPS
				ap.setPermissoes(ler.nextLine().trim());

				do {

					System.out.print("Compatibilidade: " + "Formato:  IOS e Android"); // COMPATIBILIDADE IOS/ANDROID
					ap.setCompatibilidade(ler.nextLine().trim());

				} while (!ap.verificarCompatibilidade());

				do {

					System.out.print("Pre�o do Aplicativo: " + "(Valor limite: R$400,00)"); // VERIFICAR PRE�O
					ap.setPreco(Double.parseDouble(ler.nextLine().trim()));

				} while (!ap.verificarPreco());

				do {

					System.out.print("Conte�dos Exclusivos: " + "(Adicionar no m�ximo 7)"); // CONTEUDOS EXCLUS
					ap.setConteudosExclusivos(ler.nextLine().trim());

				} while (!ap.verificarConteudosExc());

				if (ap.cadastrarApp(aplicativos)) { // SALVANDO

					System.out.print("Aplicativo cadastrado com sucesso!");
					System.out.println(" ");

				} else {

					System.out.print("Erro ao tentar cadastrar! Tente novamente ou mais tarde.");
					System.out.println(" ");

				}

				break;
			}

			case "7": { // EXIBIR CONTAS DE PESSOAS FISICAS

				System.out.println("Voc� escolheu EXIBIR contas de Pessoas F�sicas ");
				System.out.println(" ");

				if (contas == null) {

					System.out.print("Nenhuma conta cadastrada! ");
					System.out.println(" ");

				} else {

					System.out.print("Contas cadastradas: ");
					Fisica pf = new Fisica();

					pf.exibirContas(contas);

					break;
				}
			}

			case "8": { // EXIBIR CONTAS DE PESSOAS JURIDICA

				System.out.println("Voc� escolheu EXIBIR contas de Pessoas Jur�dica ");
				System.out.println(" ");

				if (contas == null) {

					System.out.print("Nenhuma conta cadastrada! ");
					System.out.println(" ");

				} else {

					System.out.print("Contas cadastradas: ");
					Juridica pj = new Juridica();
					pj.exibirContas(contas);

					break;
				}
			}

			case "9": { // EXIBIR APP GRATUITO

				System.out.println("Voc� escolheu EXIBIR Aplicativos gratuitos ");
				System.out.println(" ");

				if (aplicativos == null) {

					System.out.print("Nenhuma conta cadastrada! ");

				} else {

					App_Gratuito apg = new App_Gratuito();

					System.out.print("Aplicativos Gratuitos cadastrados: ");
					apg.exibirAplicativos(aplicativos);

					break;
				}
			}

			case "10": { // EXIBIR APP PAGO

				System.out.println("Voc� escolheu EXIBIR Aplicativos pagos ");
				System.out.println(" ");

				if (aplicativos == null) {

					System.out.print("Nenhuma conta cadastrada! ");

				} else {

					App_Pago app = new App_Pago();
					System.out.print("Aplicativos Pagos cadastrados: ");
					app.exibirAplicativos(aplicativos);

					break;

				}
			}

			case "11": { // DELETAR CONTA DE PESSOA FISICA

				System.out.println("Voc� escolheu DELETAR contas de Pessoa F�sica");
				System.out.println(" ");

				if (contas == null) {

					System.out.print("Nenhuma conta cadastrada! ");
				} else {

					System.out.print("Informe o CPF do titular da conta a ser deletada");

					String cpfProcurado = ler.nextLine();
					Fisica pf = new Fisica();

					pf.excluirConta(contas, cpfProcurado);
					System.out.print("Conta deletada com sucesso!");

					break;

				}
			}

			case "12": { // DELETAR CONTA DE PESSOA JURIDICA

				System.out.println("Voc� escolheu DELETAR contas de Pessoa Jur�dica");
				System.out.println(" ");

				if (contas == null) {

					System.out.print("Nenhuma conta cadastrada! ");
				} else {

					System.out.print("Informe o CNPJ da empresa da conta a ser deletada");

					String cnpjProcurado = ler.nextLine();
					Juridica pj = new Juridica();

					pj.excluirConta(contas, cnpjProcurado);

					System.out.print("Conta deletada com sucesso!");

					break;

				}
			}

			case "13": { // DELETAR APP GRATUITO

				System.out.println("Voc� escolheu DELETAR Aplicativos gratuitos");
				System.out.println(" ");

				if (aplicativos == null) {

					System.out.print("Nenhum aplicativo cadastrado! ");

				} else {

					System.out.print("Informe o nome do Aplicativo a ser deletado: ");
					String nomeApp = ler.nextLine();

					App_Gratuito appGratuito = new App_Gratuito();

					appGratuito.excluirApp(aplicativos, nomeApp);
					System.out.print("Aplicativo deletado com sucesso!");

					break;

				}
			}

			case "14": { // DELETAR APP PAGO

				if (aplicativos == null) {

					System.out.print("Nenhum aplicativo cadastrado! ");
				}

				System.out.print("Informe o nome do Aplicativo a ser deletado: ");
				String nomeApp = ler.nextLine();

				App_Pago appPago = new App_Pago();

				appPago.excluirApp(aplicativos, nomeApp);
				System.out.print("Aplicativo deletado com sucesso!");

			}

			case "0": {

				System.out.print("Voc� escolheu Sair");
			}

			default:
				break;
			}

		} while (!opcao.equalsIgnoreCase("0"));

		ler.close();
	}

}