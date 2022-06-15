package br.com.fiap.htf.BO;



public class Exercicio {
	
private int cd_exercicio;
	
	private String ds_exercicio;
	
	private float qt_caloria_perdida;

	public int getCd_exercicio() {
		return cd_exercicio;
	}

	public void setCd_exercicio(int cd_exercicio) {
		this.cd_exercicio = cd_exercicio;
	}

	public String getDs_exercicio() {
		return ds_exercicio;
	}

	public void setDs_exercicio(String ds_exercicio) {
		this.ds_exercicio = ds_exercicio;
	}

	public float getQt_caloria_perdida() {
		return qt_caloria_perdida;
	}

	public void setQt_caloria_perdida(float qt_caloria_perdida) {
		this.qt_caloria_perdida = qt_caloria_perdida;
	}

	@Override
	public String toString() {
		return "Exercicio [cd_exercicio=" + cd_exercicio + ", ds_exercicio=" + ds_exercicio + ", qt_caloria_perdida="
				+ qt_caloria_perdida + "]";
	}

	public Exercicio(int cd_exercicio, String ds_exercicio, float qt_caloria_perdida) {
		super();
		this.cd_exercicio = cd_exercicio;
		this.ds_exercicio = ds_exercicio;
		this.qt_caloria_perdida = qt_caloria_perdida;
	}

	public Exercicio() {
		super();
		// TODO Auto-generated constructor stub
	}

}
