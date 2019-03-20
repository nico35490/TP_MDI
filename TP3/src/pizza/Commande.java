package pizza;

public class Commande {
	AbstractCommande state;
	//méthode qui change l'état de la commande
	public void setState(AbstractCommande ac) {
		this.state = ac;
	}
	//process va faire évaluer la commande en fonction de son état actuel (attribut AbstractCommand de notre classe concrète)
	public void process() {
		state.process(this);
	}
}
