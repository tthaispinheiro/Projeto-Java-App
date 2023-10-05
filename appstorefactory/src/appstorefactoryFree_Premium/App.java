package appstorefactoryFree_Premium;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class App {

	private String nomeApp;
	private String categoria;
	private double versao;
	private String notasDaVersao;
	private String politicaDePrivacidade;
	private String emailSuporte;
	private int publicoAlvo;
	private String permissoes;
	private String compatibilidade;

	public App() { // CONSTRUTOR VAZIO
		super();

	}

	public App(String nomeApp, String categoria, double versao, String notasDaVersao, String politicaDePrivacidade,
			String emailSuporte, int publicoAlvo, String permissoes, String compatibilidade) { // CONSTRUTOR CHEIO
		super();
		this.nomeApp = nomeApp;
		this.categoria = categoria;
		this.versao = versao;
		this.notasDaVersao = notasDaVersao;
		this.politicaDePrivacidade = politicaDePrivacidade;
		this.emailSuporte = emailSuporte;
		this.publicoAlvo = publicoAlvo;
		this.permissoes = permissoes;
		this.compatibilidade = compatibilidade;
	}

	// METODOS

	public void exibirAplicativos(String aplicativos) {

		try {

			FileReader fr = new FileReader(aplicativos);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {

				String linha = br.readLine();

				String vetor[] = linha.split("#");

				System.out.println("Nome do Aplicativo: " + vetor[0] + " " + "Categoria: " + vetor[1] + " " + "Versão: "
						+ vetor[2] + " " + "Notas da Versão: " + vetor[3] + " " + "Política de Privacidade: " + vetor[4]
						+ " " + "E-mail para Suporte: " + vetor[5] + " " + "Público Alvo: " + vetor[6] + " "
						+ "Permissões: " + vetor[7] + " " + "Compatibilidade: " + vetor[8]);

			}

			br.close();
			fr.close();

		} catch (Exception e) {

		}

	}

	public boolean verificarNomeApp() { // VERIFICAR NOMEAPP

		if (nomeApp.length() > 3 && nomeApp.length() == 30) {

			return true;

		}

		if (nomeApp.contains("!") && nomeApp.contains("$")) {

			return false;

		}

		if (nomeApp.contains("@") && nomeApp.contains("&")) {

			return false;

		}

		return true;

	}

	public boolean verificarCategoria() { // VERIFICAR APP CATEGORIA

		if (nomeApp.length() >= 20) {

			return true;

		}

		if (nomeApp.contains("!") && nomeApp.contains("$")) {

			return false;

		}

		if (nomeApp.contains("@") && nomeApp.contains("&")) {

			return false;

		}
		return true;

	}

	public void verificarVersao() {

	}

	public boolean verificarNotasDaVersao() { // VERIFICAR NOTAS DA VERSÃO

		if (notasDaVersao.length() >= 30) {

			return true;

		} else {

			return false;
		}

	}

	public boolean verificarEmail() { // VERIFICAÇÃO DE E-MAIL

		if (emailSuporte.contains("@") && emailSuporte.contains(".com")) {

			return true;
		} else {

			return false;
		}

	}

	public boolean verificarPublicoAlvo() { // VERIFICAR PUBLICO ALVO

		if (publicoAlvo >= 5) {

			return true;

		}

		if (publicoAlvo >= 18) {

			return true;
		}

		else {

			return false;
		}

	}

	public boolean verificarCompatibilidade() { // VERIFICAR COMPATIBILIDADE

		if (compatibilidade.equalsIgnoreCase("ios")) {

			return true;
		}

		if (compatibilidade.equalsIgnoreCase("android")) {

			return true;
		}

		else {

			return false;
		}

	}

	// public void cadastrarCategoria(String opcaoCategoria) {

	// System.out.println("Categoria do App a ser cadastrado: ");
	// System.out.println("1- App");
	// System.out.println("2- Jogo");

	// switch (opcaoCategoria) {

	// case "1": {
	// System.out.println("Categorias: ");

	// System.out.println("a- Arte e design");
	// System.out.println("b- Automóveis e veículos");

	// if(opcaoCategoria.equalsIgnoreCase("a") &&
	// opcaoCategoria.equalsIgnoreCase("b")) {

	// System.out.println("Categoria cadastrada com sucesso!");

	// }

	// break;
	// }

	// default:
	// break;
	// }
	// }

	public boolean excluirApp(String aplicativos, String nomeApp) { // EXCLUIR APP

		try {

			FileReader fr = new FileReader(aplicativos);
			BufferedReader br = new BufferedReader(fr);

			String temporario = aplicativos.replace(".txt", "temporario.txt");
			FileWriter fw = new FileWriter(temporario);
			BufferedWriter bw = new BufferedWriter(fw);

			while (br.ready()) {

				String linha = br.readLine();
				String vetor[] = linha.split("#");

				if (vetor[0].equalsIgnoreCase(nomeApp)) {

				} else {

					bw.write(linha);
					bw.newLine();
				}

			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
			transferir(temporario, aplicativos);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public void transferir(String aplicativosOrigem, String aplicativosDestino) { // TRANSFERINDO ARQ

		try {

			FileReader fr = new FileReader(aplicativosOrigem);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(aplicativosDestino);
			BufferedWriter bw = new BufferedWriter(fw);

			while (br.ready()) {

				String linha = br.readLine();
				bw.write(linha);
				bw.newLine();

			}

			bw.close();
			fw.close();
			br.close();
			fr.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// GET E SET
	public String getNomeApp() {
		return nomeApp;
	}

	public void setNomeApp(String nomeApp) {
		this.nomeApp = nomeApp;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getVersao() {
		return versao;
	}

	public void setVersao(double versao) {
		this.versao = versao;
	}

	public String getNotasDaVersao() {
		return notasDaVersao;
	}

	public void setNotasDaVersao(String notasDaVersao) {
		this.notasDaVersao = notasDaVersao;
	}

	public String getPoliticaDePrivacidade() {
		return politicaDePrivacidade;
	}

	public void setPoliticaDePrivacidade(String politicaDePrivacidade) {
		this.politicaDePrivacidade = politicaDePrivacidade;
	}

	public String getEmailSuporte() {
		return emailSuporte;
	}

	public void setEmailSuporte(String emailSuporte) {
		this.emailSuporte = emailSuporte;
	}

	public int getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(int publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public String getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}

	public String getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}

}
