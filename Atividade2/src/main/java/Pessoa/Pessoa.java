package Pessoa;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named("pessoa")
@SessionScoped
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;

	@Inject
	private PessoaBean pessoaBean;

	// Métodos getters e setters para os campos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String insereUser() {
		pessoaBean.adicionarPessoa();
		return "";
	}
}