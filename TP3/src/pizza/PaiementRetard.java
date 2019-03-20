package pizza;

public class PaiementRetard extends PaiementDecorator {
	int nbquartdheure;
	public PaiementRetard(int nbquartdheure, Paiement decorated) {
		super(decorated);
		this.nbquartdheure = nbquartdheure;
	}
	@Override
	public double calculate() {
		if(nbquartdheure >= 10)
			return 0;
		else
		return decorated.calculate()*(1-(0.1*nbquartdheure));
	}

}
