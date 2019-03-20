package pizza;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//le code ne marche pas concrètement
		//mais nous avons codé les différents pattern utilisés
		Pizza p = new Pizza();
		p.setPrix(10);
		
		double prix;
		//notre réduc = 10% par quart d'heure de retard
		prix = new PaiementRetard(4, p).calculate();
		System.out.println("prix : "+ prix);
		//Exemple d'un calcul de prix d'un pizza en happy hours avec 30min de retard :

		prix = new PaiementRetard(2, new PaiementHappyHours(p)).calculate();

		System.out.println("prix : "+ prix);
	}

}
