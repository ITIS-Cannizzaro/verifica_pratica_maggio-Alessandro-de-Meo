package verifica_pratica;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class verifica extends JFrame implements ActionListener{
	ArrayList <Integer> a1 = new ArrayList();
	JLabel j1 = new JLabel("Inserisci un numero:");
	JTextArea jt1 = new JTextArea ();
	JButton b1 = new JButton ("Aggiungi");
	JButton b2 = new JButton ("Rimuovi");
	JButton b3 = new JButton ("Visualizza");
	JLabel j2 = new JLabel ("Risultato");
	JTextArea ris = new JTextArea();
	public verifica() {
		super ("Verifica");
		Container c = this.getContentPane();
		c.setLayout(null);
		setSize(600,600);
		setVisible(true);
		c.add(j1);
		c.add(jt1);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(j2);
		c.add(ris);
		j1.setBounds(20,20,150,20);
		jt1.setBounds(20,50,80,20);
		b1.setBounds(20,80,100,40);
		b2.setBounds(130,80,100,40);
		b3.setBounds(240,80,100,40);
		j2.setBounds(20,150,100,20);
		ris.setBounds(20,175,100,20);
		b1.addActionListener(e -> Aggiungi());
		b2.addActionListener(e -> Rimuovi());
		b3.addActionListener(e -> Visualizza());
	}
	public void Aggiungi() {
		int n1=Integer.parseInt(jt1.getText());
		/*int temp;*/
		a1.add(n1);
		/*for(int cont=0;cont<a1.size();cont++){
			if(n1>=a1.get(cont)) {
				a1.add(n1);
				}
			else {
				temp=a1.get(cont);
				a1.set(cont,n1);
				a1.add(temp);
			}
			}*/
		}
	public void Rimuovi() {
		int n2=Integer.parseInt(jt1.getText());
		for(int cont2=0;cont2<a1.size();cont2++) {
			if(n2==a1.get(cont2)){
				a1.remove(cont2);
			}
		}
	}
	public void Visualizza() {
		String st=""+a1;
		ris.setText(st);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			Aggiungi();
			}
		else if(e.getSource()==b2) {
			Rimuovi();
		}
		else if(e.getSource()==b3) {
			Visualizza();
		}
	}
}
