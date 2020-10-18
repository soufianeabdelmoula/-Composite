package ex4;

public class Manager implements Employe {
	private String Nom;
	private String pre;
	private String add;
	private String service;

	@Override
	public String getNom() {

		return Nom;
	}

	@Override
	public void setNom(String nom) {
		this.Nom = nom;
		
	}

	@Override
	public String getpre() {
		
		return pre;
	}

	@Override
	public void setpre(String prenom) {
		this.pre = pre;
		
	}

	@Override
	public String getAdd() {
		// TODO Auto-generated method stub
		return add;
	}

	@Override
	public void setAdd(String adresse) {
		this.add = add;
		
	}

	@Override
	public String getservice() {
		
		return service;
	}

	@Override
	public void setservice(String service) {
		this.service = service;
		
	}

}
