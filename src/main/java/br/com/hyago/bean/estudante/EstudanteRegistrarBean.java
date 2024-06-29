package br.com.hyago.bean.estudante;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.hyago.model.Estudante;

@ManagedBean
public class EstudanteRegistrarBean implements Serializable{
	
	
	private Estudante estudante = new Estudante();

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
}
