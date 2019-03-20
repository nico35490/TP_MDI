package pizza;

public abstract class PaiementDecorator implements Paiement {
	
	Paiement decorated;
	
	public PaiementDecorator(Paiement decorated) {
		this.decorated = decorated;
	}
	
	@Override
	public abstract double calculate();

}
