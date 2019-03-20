package pizza;

import org.w3c.dom.views.AbstractView;

//exemple pour le pattern state
public class CommandeEnAttente extends AbstractCommande{
	
	//méthode appelée quand on effectue une opération dans commande et que
	//notre commande est en attente
	@Override
	public void process(Commande c) {
		// elle effectue les traitements nécessaires pour une commande en attente
		// avant de passer en préparation
		//Nous avons pas fait tous les etats
		c.setState(new CommandeEnPreparation());
	}

	
}
