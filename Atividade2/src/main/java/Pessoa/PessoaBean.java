package Pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("pessoaBean")
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Pessoa> pessoas = new ArrayList<>();
	private Pessoa pessoa = new Pessoa();

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void adicionarPessoa() {
		pessoas.add(pessoa);
		pessoa = new Pessoa();
	}
}