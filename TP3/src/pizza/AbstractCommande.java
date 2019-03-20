package pizza;

public abstract class AbstractCommande {
	//méthode appelée indirectement par le coordinateur lorsqu'il effectue des opérations
	//sur la commande
	public abstract void process(Commande c);
}
