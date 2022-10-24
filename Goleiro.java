package Prova;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro extends Particula{
	private int força;
	private  String nome;
	private int id;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenaçao;
	private int equilibrio;
	private int quadrante;
	private int positionx, positiony;
	private int marcado;
	private ArrayList<Chute> listadechutes;
	
	public Goleiro() {
		listadechutes = new ArrayList<Chute>();
	}
	
	
	public ArrayList<Chute> getListadechutes() {
		return listadechutes;
	}


	public void setListadechutes(ArrayList<Chute> listadechutes) {
		for(Chute c : listadechutes)
		{
			this.listadechutes.add(c);
		}
	}


	public int getPositionx() {
		return positionx;
	}
	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}
	public int getPositiony() {
		return positiony;
	}
	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}
	public int getForça() {
		return força;
	}
	public void setForça(int força) {
		this.força = força;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getFlexibilidade() {
		return flexibilidade;
	}
	public void setFlexibilidade(int flexibilidade) {
		this.flexibilidade = flexibilidade;
	}
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	public int getCoordenaçao() {
		return coordenaçao;
	}
	public void setCoordenaçao(int coordenaçao) {
		this.coordenaçao = coordenaçao;
	}
	public int getEquilibrio() {
		return equilibrio;
	}
	public void setEquilibrio(int equilibrio) {
		this.equilibrio = equilibrio;
	}
	public int getQuadrante() {
		return quadrante;
	}
	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	
	
	public int getMarcado() {
		return marcado;
	}


	public void setMarcado() {
		marcado = marcado++;
	}


	public int gerarAAG() {
		int AAG = ((velocidade * 3) + (flexibilidade *2) + (agilidade * 3) + (coordenaçao * 2) + (força)+ (equilibrio *2))/8;
		return AAG;
	}
	public void SorteioAAG(int quadrante) {
		Random random = new Random();
		if(quadrante==1) {
			positionx=random.nextInt(5);
			positiony=random.nextInt(9);
		}
		else if(quadrante==2) {
			positionx=random.nextInt(5);
			positiony=random.nextInt(8,17);
		}
		else if(quadrante==3) {
			positionx=random.nextInt(4,9);
			positiony=random.nextInt(9);
		}
		else {
			positionx=random.nextInt(4,9);
			positiony=random.nextInt(8,17);
		}
	}
	public ArrayList<Integer> coletarvalores(int a, int b,int c) {
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(a);
		t.add(b);
		t.add(c);
		return t;
	}
	public ArrayList<Integer> areadogoleiro(int quadrante) {
		gerarAAG();
		int marcado;
		int a,b,c;
		SorteioAAG(quadrante);
		marcado=positionx;
		a=positionx;
		b=positionx;
		c=positionx;
		int j=0;
		if(gerarAAG()>=1&&gerarAAG()<=4) {
			for(int i = 0; i<=gerarAAG();i++) {
				marcado=positionx--;
				System.out.println("x="+ marcado);
			}
			return coletarvalores(marcado,0,0);
				
			
		}
		else if(gerarAAG()<=8) {
			for(int i=1;i<=4;i++) {
				j=j+1;
				marcado=positionx--;
				System.out.println("x="+ marcado);
			}
			marcado=positiony+1;
			System.out.println("y="+marcado);
			
			for(int i=1;i<=(gerarAAG()-j);i++) {
				System.out.println("X="+a);
				a--;
			}
			return coletarvalores(a,marcado,0);
		}
		else if(gerarAAG()<=12) {
			for(int i=1;i<=4;i++) {
				marcado=positionx--;
				System.out.println("x="+marcado);
			}
			marcado=positiony+1;
			System.out.println("y="+marcado);
			j=4;
			for(int i=1;i<=4;i++) {
				j=j+1;
				System.out.println("X="+a);
				a--;
			}
			marcado=positiony+2;
			System.out.println("y="+marcado);
			for(int i=1; i<=(gerarAAG()-j);i++) {
				System.out.println("xx="+b);
				b--;
			}
			return coletarvalores(a,marcado,b);
		}
		else {
			for(int i=1; i<=4;i++) {
				marcado=positionx--;
				System.out.println("x="+marcado);
			}
			marcado=positiony+1;
			System.out.println("y="+marcado);
			for(int i=1; i<=4;i++) {
				System.out.println("x="+a);
				a--;
			}
			marcado=positiony+2;
			System.out.println("y="+marcado);
			j=8;
			for(int i=1;i<=4;i++) {
				j=j+1;
				System.out.println("xx="+b);
				b--;
			}
			marcado=positiony+3;
			System.out.println("y="+marcado);
			
			for(int i=1; i<=(gerarAAG()-j);i++) {
				System.out.println("xx="+c);
				c--;
			}
			return coletarvalores(a,marcado,c);
		}
	}
}
