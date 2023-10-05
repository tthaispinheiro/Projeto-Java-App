package appstorefactoryFree_Premium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App_Gratuito extends App {

	private String addAnuncios;

	public App_Gratuito() { // CONSTRUTOR VAZIO
		super();
	}

	public App_Gratuito(String addAnuncios) { // CONSTRUTOR CHEIO
		super();
		this.addAnuncios = addAnuncios;
	}

	// METODOS

	public App_Gratuito(String nomeApp, String categoria, double versao, String notasDaVersao,
			String politicaDePrivacidade, String emailSuporte, int publicoAlvo, String permissoes,
			String compatibilidade) {
		super(nomeApp, categoria, versao, notasDaVersao, politicaDePrivacidade, emailSuporte, publicoAlvo, permissoes,
				compatibilidade);
		// TODO Auto-generated constructor stub
	}

	public boolean cadastrarApp(String aplicativos) { // CADASTRAR APP GRATUITO

		aplicativos = aplicativos + "appgratuito.txt";

		try {

			FileWriter fw = new FileWriter(aplicativos, true); // ABRINDO ARQUIVO EM MODO ESCRITA
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(getNomeApp() + "#" + getCategoria() + "#" + getVersao() + "#" + getNotasDaVersao() + "#"
					+ getPoliticaDePrivacidade() + "#" + getEmailSuporte() + "#" + getPublicoAlvo() + "#"
					+ getPermissoes() + "#" + getCompatibilidade() + "#" + addAnuncios);

			bw.newLine();

			bw.close();
			fw.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

	public void exibirAplicativos(String aplicativos) { // EXIBIR APP GRATUITO

		aplicativos = aplicativos + "appgratuito.txt";
		try {

			FileReader fr = new FileReader(aplicativos);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {

				String linha = br.readLine();

				String vetor[] = linha.split("#");

				System.out.println("Nome do Aplicativo: " + vetor[0] + "\n" + "Categoria: " + vetor[1] + "\n"
						+ "Vers�o: " + vetor[2] + "\n" + "Notas da Vers�o: " + vetor[3] + "\n"
						+ "Pol�tica de Privacidade: " + vetor[4] + "\n" + "E-mail para Suporte: " + vetor[5] + "\n"
						+ "P�blico Alvo: " + vetor[6] + "\n" + "Permiss�es: " + vetor[7] + "\n" + "Compatibilidade: "
						+ vetor[8] + "\n" + "An�ncios: " + vetor[9] + "\n");

			}

			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public boolean excluirApp(String aplicativos, String nomeApp) { // EXCLUIR APP

		aplicativos = aplicativos + "appgratuito.txt";
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
	
	
	public boolean verificarAnuncios() {  //VERIFICAR ANUNCIOS 
		
		
		if(addAnuncios.length() == 4) {
			
			
			return true;
		}else {
			
			
			return false;
		}
		
		
	}

	public String getAddAnuncios() {
		return addAnuncios;
	}

	public void setAddAnuncios(String addAnuncios) {
		this.addAnuncios = addAnuncios;
	}

	// GET E SET

}
