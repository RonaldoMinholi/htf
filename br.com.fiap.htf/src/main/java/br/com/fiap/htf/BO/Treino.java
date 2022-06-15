package br.com.fiap.htf.BO;

import java.sql.Date;

public class Treino {

	
private int cd_treino;
	
	private Date dt_treino;
	
	private int vr_batimento_card;

	public int getCd_treino() {
		return cd_treino;
	}

	public void setCd_treino(int cd_treino) {
		this.cd_treino = cd_treino;
	}

	public Date getDt_treino() {
		return dt_treino;
	}

	public void setDt_treino(Date dt_treino) {
		this.dt_treino = dt_treino;
	}

	public int getVr_batimento_card() {
		return vr_batimento_card;
	}

	public void setVr_batimento_card(int vr_batimento_card) {
		this.vr_batimento_card = vr_batimento_card;
	}

	@Override
	public String toString() {
		return "Treino [cd_treino=" + cd_treino + ", dt_treino=" + dt_treino + ", vr_batimento_card="
				+ vr_batimento_card + "]";
	}

	public Treino(int cd_treino, Date dt_treino, int vr_batimento_card) {
		super();
		this.cd_treino = cd_treino;
		this.dt_treino = dt_treino;
		this.vr_batimento_card = vr_batimento_card;
	}

	public Treino() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
