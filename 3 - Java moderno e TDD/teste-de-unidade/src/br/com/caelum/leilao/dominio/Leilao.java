package br.com.caelum.leilao.dominio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		int total = quantidadeDeLancesDoUsuario(lance.getUsuario());

		if (this.lances.isEmpty() || podeDarLance(lance.getUsuario()))
			lances.add(lance);
	}

	private boolean podeDarLance(Usuario usuario) {// evita mais do que cinco lances por usuário
		return !usuario.equals(ultimoLance().getUsuario()) // evita lances em sequência por um mesmo usuário
				&& quantidadeDeLancesDoUsuario(usuario) < 5;
	}

	private int quantidadeDeLancesDoUsuario(Usuario usuario) {
		int total = 0;

		for (Lance l: lances) {
			if (l.getUsuario().equals(usuario)) total++;
		}
		return total;
	}

	private Lance ultimoLance() {
		return this.lances.get(lances.size() - 1);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

    public void dobraLance(Usuario usuario) {
		Lance ultimo = ultimoLanceDo(usuario);
		if(ultimoLanceDo(usuario) != null)
			propoe(new Lance(usuario, ultimo.getValor() * 2));
    }

	private Lance ultimoLanceDo(Usuario usuario) {
		Lance ultimo = null;

		for (Lance lance: lances) {
			if (lance.getUsuario().equals(usuario)) ultimo = lance;
		}
		return ultimo;
	}
}
