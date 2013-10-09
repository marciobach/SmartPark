package br.feevale.smartpark.persistencia;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Area implements Tabela {
	
	@Id @GeneratedValue(strategy=AUTO)	
	private int idArea;
	
	@Column(length=200)
	private String dsArea;

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getDsArea() {
		return dsArea;
	}

	public void setDsArea(String dsArea) {
		this.dsArea = dsArea;
	}
	
}