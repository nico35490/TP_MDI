package pizza;

public class Pizza implements Paiement{

	private String name;

private double prix;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void bake() throws Exception {
	
	
	}

	public void deliver() throws Exception {

	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getPrix();
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}

