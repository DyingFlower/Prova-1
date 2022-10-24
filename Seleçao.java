package Prova;

import java.util.ArrayList;

public class Seleçao {
	private String nome;
	private ArrayList<Goleiro> listagoleiro;
	
	public Seleçao()
	{
		listagoleiro = new ArrayList<Goleiro>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Goleiro> getListagoleiro() {
		return listagoleiro;
	}
	public void setListagoleiro(ArrayList<Goleiro> listagoleiro) {
		this.listagoleiro = listagoleiro;
	}
	
}
