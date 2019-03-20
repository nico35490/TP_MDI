package mailbox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MailBox implements Subject {
	List<Observer> observers = new LinkedList<Observer>();

	private MailBox() {

	}

	private static MailBox instance = null;

	public static MailBox getInstance() {
		if (instance == null)
			instance = new MailBox();
		return instance;
	}

	List<Mail> mail = new ArrayList<Mail>();

	public void addMail(Mail m) {
		this.mail.add(m);
		notifyObservers();
	}

	public Mail getLastMail() {
		return this.mail.get(mail.size() - 1);
	}

	public Integer getNbreMail() {
		return mail.size();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers)
			o.update(this);
	}

}
