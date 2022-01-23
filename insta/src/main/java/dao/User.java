package dao;

public class User {
	private String login;
	private String password;
	private String nom;
	private String profil;
	
	public User(String login, String password, String nom, String profil) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.profil = profil;
	}

	public User(String login, String password, String nom) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public Object downloadImages() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	

}

