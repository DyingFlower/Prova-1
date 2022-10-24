package Prova;

public class Particula {
	private int positionx, positiony;
	private int quadrante;
	private boolean acertou;
	private String lugar;
	
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
	public int getQuadrante() {
		return quadrante;
	}
	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	public boolean isAcertou() {
		return acertou;
	}
	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public boolean acertougol(Chute chute){
		chute.getPositionx();
		chute.getPositiony();
		Goleiro gol = new Goleiro();
		gol.gerarAAG();
		gol.areadogoleiro(quadrante);
		int[][]	matrizchute = new int[chute.getPositionx()][chute.getPositiony()];
		int[][] matrizdefesa= new int[gol.areadogoleiro(quadrante).get(0)][gol.areadogoleiro(quadrante).get(1)];
		if(quadrante==1 && chute.getQuadrante()==quadrante) {
			for(int i = 0; i<4 ; i++){
				for(int j = 0; j<8;j++) {
			
				}
			}
		}
		
		if(quadrante==2  && chute.getQuadrante()==quadrante) {
			for(int i = 0; i<4; i++){
				for(int j = 8; j<16;j++) {
					
				}
			}
		}
		
		if(quadrante==3  && chute.getQuadrante()==quadrante) {
			for(int i = 4; i<8 ; i++){
				for(int j = 0; j<8;j++) {
					
				}
			}
		}
		
		if(quadrante==4  && chute.getQuadrante()==quadrante) {
			for(int i = 4; i<8 ; i++){
				for(int j = 8; j<16;j++) {
					
				}
			}
		}
    	return acertou;
	}
}
