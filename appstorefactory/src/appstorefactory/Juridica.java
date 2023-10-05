package appstorefactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Juridica extends Pessoa {

	private String cnpj;
	private String razaoSocial;
	private String numeroDeInscricao;

	public Juridica() { // CONSTRUTOR VAZIO
		super();
	}

	public Juridica(String cnpj, String razaoSocial, String numeroDeInscricao) { // CONTRUTOR CHEIO
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.numeroDeInscricao = numeroDeInscricao;
	}

	public Juridica(String nome, String telefone, String nomedeUsuario, String senha, String endereco, String email,
			String site, String numeroCartao, int codSeguranca, String validadeCartao, String titulardoCartao) {
		super(nome, telefone, nomedeUsuario, senha, endereco, email, site, numeroCartao, codSeguranca, validadeCartao,
				titulardoCartao);
		// TODO Auto-generated constructor stub
	}

	// METODOS
	public boolean cadastrar(String contas) { // CADASTRAR PESSOA JURIDICA

		contas = contas + "juridica.txt";

		try {

			FileWriter fw = new FileWriter(contas, true); // ABRINDO ARQUIVO EM MODO ESCRITA
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(razaoSocial + "#" + getNome() + "#" + cnpj + "#" + numeroDeInscricao + "#" + getTelefone() + "#"
					+ getEndereco() + "#" + getNomedeUsuario() + "#" + getSenha() + "#" + getEmail() + "#" + getSite());

			bw.newLine();

			bw.close();
			fw.close();

			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	public boolean cadastrarCartao(String contas, String cnpjProcurado) { // CADASTRAR CARTAO PESSOA JURIDICA

		contas = contas + "cadastrarCartaoPessoaJuridica.txt";
		try {

			FileWriter fw = new FileWriter(contas);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Numero do Cartão: " + getNumeroCartao() + "#" + "Código de Segurança: " + getCodSeguranca()
					+ "Validade: " + getValidadeCartao() + "#" + "Titular do Cartão: " + getTitulardoCartao());

			bw.newLine();
			bw.close();
			fw.close();

			return true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

	public boolean excluirConta(String contas, String cnpjProcurado) { // EXCLUIR CONTA FISICA

		contas = contas + "juridica.txt";
		try {

			FileReader fr = new FileReader(contas);
			BufferedReader br = new BufferedReader(fr);

			String temporario = contas.replace(".txt", "temporario.txt");
			FileWriter fw = new FileWriter(temporario, true);
			BufferedWriter bw = new BufferedWriter(fw);

			while (br.ready()) {

				String linha = br.readLine();
				String vetor[] = linha.split("#");

				if (vetor[2].equalsIgnoreCase(cnpjProcurado)) {
				} else {
					bw.write(linha);
					bw.newLine();
				}

			}

			bw.close();
			fw.close();
			br.close();
			fr.close();
			transferir(temporario, contas);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public void exibirContas(String contas) {

		contas = contas + "juridica.txt";

		try {

			FileReader fr = new FileReader(contas);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {

				String linha = br.readLine();
				String vetor[] = linha.split("#");

				System.out.println("Razão Social: " + vetor[0] + "\n" + "Nome Fantasia: " + vetor[1] + "\n" + "Cnpj: "
						+ vetor[2] + "\n" + "Número de Inscrição: " + vetor[3] + "\n" + "Telefone Comercial: "
						+ vetor[4] + "\n" + "Endereço Comercial: " + vetor[5] + "\n" + "Nome de Usuário: " + vetor[6]
						+ "\n" + "E-mail: " + vetor[8] + "\n" + "Site Comercial: " + vetor[9] + "\n");

			}

			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public boolean verificarCnpj() { // VERIFICAR CNPJ

		if (cnpj.length() == 14) {

			return true;

			// XXXXXXXX0001XX - 14 caract

		}

		if (cnpj.length() == 18 && cnpj.charAt(2) == '.' && cnpj.charAt(6) == '.' && cnpj.charAt(10) == '/'
				&& cnpj.charAt(15) == '-') {

			return true;

			// XX.XXX.XXX/0001-XX - 18 caract
		} else {

			return false;
		}

	}

	public boolean verificarNumeroInscricao() {  //VERIFICAR NUMERO DE INSCRIÇÃO

		if (numeroDeInscricao.length() == 12) {

			return true;
			// 388.108.598.269

		}

		if (numeroDeInscricao.length() == 15 && numeroDeInscricao.charAt(3) == '.' && numeroDeInscricao.charAt(7) == '.'
				&& numeroDeInscricao.charAt(11) == '.') {

			return true;

		} else {

			return false;
		}

	}

	// GET E SET

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNumeroDeInscricao() {
		return numeroDeInscricao;
	}

	public void setNumeroDeInscricao(String numeroDeInscricao) {
		this.numeroDeInscricao = numeroDeInscricao;
	}

}
