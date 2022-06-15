package br.com.fiap.htf.BO;

import java.sql.Date;

public class ConsumoAlim {

	
	private int cd_consumo_alim;
	
	private Date dt_consumo_alim;
	
	private float qt_caloria_ganha;

	public int getCd_consumo_alim() {
		return cd_consumo_alim;
	}

	public void setCd_consumo_alim(int cd_consumo_alim) {
		this.cd_consumo_alim = cd_consumo_alim;
	}

	public Date getDt_consumo_alim() {
		return dt_consumo_alim;
	}

	public void setDt_consumo_alim(Date dt_consumo_alim) {
		this.dt_consumo_alim = dt_consumo_alim;
	}

	public float getQt_caloria_ganha() {
		return qt_caloria_ganha;
	}

	public void setQt_caloria_ganha(float qt_caloria_ganha) {
		this.qt_caloria_ganha = qt_caloria_ganha;
	}

	@Override
	public String toString() {
		return "ConsumoAlim [cd_consumo_alim=" + cd_consumo_alim + ", dt_consumo_alim=" + dt_consumo_alim
				+ ", qt_caloria_ganha=" + qt_caloria_ganha + "]";
	}

	public ConsumoAlim(int cd_consumo_alim, Date dt_consumo_alim, float qt_caloria_ganha) {
		super();
		this.cd_consumo_alim = cd_consumo_alim;
		this.dt_consumo_alim = dt_consumo_alim;
		this.qt_caloria_ganha = qt_caloria_ganha;
	}

	public ConsumoAlim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
