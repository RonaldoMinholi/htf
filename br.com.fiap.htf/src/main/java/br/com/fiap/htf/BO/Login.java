package br.com.fiap.htf.BO;



public class Login {
	
private int cd_login;
	
	private String ds_email;
	
	private String ds_senha;

	public int getCd_login() {
		return cd_login;
	}

	public void setCd_login(int cd_login) {
		this.cd_login = cd_login;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public String getDs_senha() {
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}

	@Override
	public String toString() {
		return "Login [cd_login=" + cd_login + ", ds_email=" + ds_email + ", ds_senha=" + ds_senha + "]";
	}

	public Login(int cd_login, String ds_email, String ds_senha) {
		super();
		this.cd_login = cd_login;
		this.ds_email = ds_email;
		this.ds_senha = ds_senha;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

}
