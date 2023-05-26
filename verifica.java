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
	JLabel txt = new JLabel("Inserire il numero da rimuovere:");
	JTextArea ins = new JTextArea();
	JLabel resp = new JLabel();
	JButton b4 = new JButton("Rimuovi");
	int tmp;
	public verifica() {
		super ("Verifica");
		JFrame f1= new JFrame("Primo frame");
		Container c = f1.getContentPane();
		c.setLayout(null);
		f1.setSize(600,600);
		f1.setVisible(true);
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
		int temp;
		if(a1.isEmpty()==true) {
			a1.add(n1);
		}
		else {
			if(n1<a1.get(a1.size()-1)) {
				for(int cont=0;cont<a1.size();cont++){
					if(n1<a1.get(cont)) {
						temp=a1.get(cont);
						a1.set(cont, n1);
						n1=temp;
					}
				}
				a1.add(n1);
			}
			else {
				a1.add(n1);
			}
		}
		}
	public void Rimuovi() {
		JFrame f2= new JFrame("Secondo frame");
		f2.setSize(600,600);
		Container z = f2.getContentPane();
		z.setLayout(null);
		z.add(txt);
		z.add(ins);
		z.add(b4);
		z.add(resp);
		txt.setBounds(20,20,200,20);
		ins.setBounds(20,50,50,20);
		b4.setBounds(20,80,100,40);
		resp.setBounds(20,140,250,20);
		resp.setText("");
		ins.setText("");
		f2.setVisible(true);
		b4.addActionListener(e -> Rimuovi2());
		txt.setText("Inserire il numero da rimuovere:");
	}
	public void Rimuovi2() {
		tmp=0;
		int n2=Integer.parseInt(ins.getText());
		for(int cont2=0;cont2<a1.size();cont2++) {
			if(n2==a1.get(cont2)){
				a1.remove(cont2);
				cont2--;
				tmp++;
			}
		}
		if(tmp==0) {
			resp.setText("Non sono presenti numeri "+n2+" da rimuovere");
		}
		else {
			resp.setText("Sono stati rimossi tutti i numeri "+n2);
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
