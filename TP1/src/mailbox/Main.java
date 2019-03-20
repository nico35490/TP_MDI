package mailbox;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main{

	private void init() {
		System.out.println("init");

		JFrame f = new JFrame();
		f.setTitle("Test de JFrame");
		f.setSize(300, 200);

		JPanel p = new JPanel();

		f.add(p);

		// TODO Register observer
		CounterObserver co = new CounterObserver();
		MailBox.getInstance().attach(co);
		p.add(co);
		MailObserver mo = new MailObserver();
		MailBox.getInstance().attach(mo);
		p.add(mo);
		
		f.setVisible(true);
		f.dispose();

		System.out.println("init");
		f.show();

	}

	private void runScenario() {

		MailBox.getInstance().addMail(new Mail("ESIR" + new Random().nextInt(), "tp fini"));
		System.out.println(MailBox.getInstance().getNbreMail());
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("init");
		Main m = new Main();
		m.init();
		while (true) {
			Thread.sleep(3000);
			m.runScenario();
		}
	}


	class CounterObserver extends JLabel implements Observer {
		public CounterObserver() {
			setText("bla");
		}
		@Override
		public void update(Subject s) {
			MailBox mb = (MailBox) s;
			setText(Integer.toString(mb.getNbreMail()));
		}
	}
	class MailObserver extends JLabel implements Observer {

		@Override
		public void update(Subject s) {
			MailBox mb = (MailBox) s;
			setText(mb.getLastMail().toString());
			
		}

	}

}
