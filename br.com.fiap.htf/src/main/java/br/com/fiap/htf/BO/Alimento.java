package br.com.fiap.htf.BO;



public class Alimento {
	
	private int cd_alimento;
	
	private String nm_alimento;
	
	private float qt_caloria;

	public int getCd_alimento() {
		return cd_alimento;
	}

	public void setCd_alimento(int cd_alimento) {
		this.cd_alimento = cd_alimento;
	}

	public String getNm_alimento() {
		return nm_alimento;
	}

	public void setNm_alimento(String nm_alimento) {
		this.nm_alimento = nm_alimento;
	}

	public float getQt_caloria() {
		return qt_caloria;
	}

	public void setQt_caloria(float qt_caloria) {
		this.qt_caloria = qt_caloria;
	}

	@Override
	public String toString() {
		return "Alimento [cd_alimento=" + cd_alimento + ", nm_alimento=" + nm_alimento + ", qt_caloria=" + qt_caloria
				+ "]";
	}

	public Alimento(int cd_alimento, String nm_alimento, float qt_caloria) {
		super();
		this.cd_alimento = cd_alimento;
		this.nm_alimento = nm_alimento;
		this.qt_caloria = qt_caloria;
	}

	public Alimento() {
		super();
		// TODO Auto-generated constructor stub
	}

}
