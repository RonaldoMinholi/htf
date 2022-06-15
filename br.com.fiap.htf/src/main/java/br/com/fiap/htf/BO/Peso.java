package br.com.fiap.htf.BO;

import java.sql.Date;

public class Peso {
	
	
	private int cd_peso;
	
	private float vr_peso;
	
	private Date dt_peso;

	public int getCd_peso() {
		return cd_peso;
	}

	public void setCd_peso(int cd_peso) {
		this.cd_peso = cd_peso;
	}

	public float getVr_peso() {
		return vr_peso;
	}

	public void setVr_peso(float vr_peso) {
		this.vr_peso = vr_peso;
	}

	public Date getDt_peso() {
		return dt_peso;
	}

	public void setDt_peso(Date dt_peso) {
		this.dt_peso = dt_peso;
	}

	@Override
	public String toString() {
		return "Peso [cd_peso=" + cd_peso + ", vr_peso=" + vr_peso + ", dt_peso=" + dt_peso + "]";
	}

	public Peso(int cd_peso, float vr_peso, Date dt_peso) {
		super();
		this.cd_peso = cd_peso;
		this.vr_peso = vr_peso;
		this.dt_peso = dt_peso;
	}

	public Peso() {
		super();
		// TODO Auto-generated constructor stub
	}

}
