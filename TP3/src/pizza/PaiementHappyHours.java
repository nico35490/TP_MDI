package pizza;

public class PaiementHappyHours extends PaiementDecorator {
	public PaiementHappyHours(Paiement decorated) {
		super(decorated);
	}
	@Override
	public double calculate() {
		return decorated.calculate()*0.7;
	}

}
