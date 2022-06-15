package br.com.fiap.htf.BO;

import java.sql.Date;

public class Usuario {

	private int cd_usuario;
	
	private String nm_usuario;
	
	private float vr_peso_inicio;
	
	private String ds_genero;
	
	private float vr_altura;
	
	private String ds_email;
	
	private Date dt_nascimento;
	
	private int vr_numero_telefone;

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public float getVr_peso_inicio() {
		return vr_peso_inicio;
	}

	public void setVr_peso_inicio(float vr_peso_inicio) {
		this.vr_peso_inicio = vr_peso_inicio;
	}

	public String getDs_genero() {
		return ds_genero;
	}

	public void setDs_genero(String ds_genero) {
		this.ds_genero = ds_genero;
	}

	public float getVr_altura() {
		return vr_altura;
	}

	public void setVr_altura(float vr_altura) {
		this.vr_altura = vr_altura;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public int getVr_numero_telefone() {
		return vr_numero_telefone;
	}

	public void setVr_numero_telefone(int vr_numero_telefone) {
		this.vr_numero_telefone = vr_numero_telefone;
	}

	@Override
	public String toString() {
		return "Usuario [cd_usuario=" + cd_usuario + ", nm_usuario=" + nm_usuario + ", vr_peso_inicio=" + vr_peso_inicio
				+ ", ds_genero=" + ds_genero + ", vr_altura=" + vr_altura + ", ds_email=" + ds_email
				+ ", dt_nascimento=" + dt_nascimento + ", vr_numero_telefone=" + vr_numero_telefone + "]";
	}

	public Usuario(int cd_usuario, String nm_usuario, float vr_peso_inicio, String ds_genero, float vr_altura,
			String ds_email, Date dt_nascimento, int vr_numero_telefone) {
		super();
		this.cd_usuario = cd_usuario;
		this.nm_usuario = nm_usuario;
		this.vr_peso_inicio = vr_peso_inicio;
		this.ds_genero = ds_genero;
		this.vr_altura = vr_altura;
		this.ds_email = ds_email;
		this.dt_nascimento = dt_nascimento;
		this.vr_numero_telefone = vr_numero_telefone;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
