package agendAspectJ;

import javax.swing.JOptionPane;
import agendAspectJ.Pessoa2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Trab1 {
	
	public static void adicionar(ArrayList<Pessoa2> contact2) {
		Pessoa2 contact = new Pessoa2();
		String x = JOptionPane.showInputDialog("Digite Nome");
		String y = JOptionPane.showInputDialog("Digite o numero");
		contact.setNome(x);
		contact.setNumero(y);
		contact2.add(contact);
		JOptionPane.showMessageDialog(null,"O contato " + contact.getNome()+ 
				" foi adicionado com sucesso");
	}
	
	public static void remover(ArrayList<Pessoa2> contact2) {
		String removeNome = JOptionPane.showInputDialog("Digite Nome de quem deseja remover");
		for(int i=0; i< contact2.size(); i++) {
			if(contact2.get(i).getNome().equals(removeNome)) {
				contact2.remove(i);
				JOptionPane.showMessageDialog(null,"O contato " + removeNome+ 
						" foi removido com sucesso");
			}
		}
	}
	
	public static void adicionaLog() {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date data = new Date(System.currentTimeMillis());
			System.out.println("Contato adicionado as: " + fmt.format(data));
		}
	
	public static void removerLog() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date(System.currentTimeMillis());
		System.out.println("Contato removido as: " + fmt.format(data));
	}
	

	
	public static void main(String[] args) {
		
		int menu = 0;
		ArrayList<Pessoa2> contact2 = new ArrayList();
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(""
					+ " 1- Adicionar Contato\n"
					+ " 2- Visualizar Contato\n"
					+ " 3- Remover Contato\n"
					+ " 4 - Sair")
			);
			
			
			if(menu ==1) {
				
				adicionar(contact2);
				
			} else if(menu == 2) {
				
				for(int i=0; i< contact2.size(); i++) {
					JOptionPane.showMessageDialog(null, "Nome: "+ contact2.get(i).getNome() +
							"\n Telefone: " + contact2.get(i).getNumero());
				}
				
			} else if(menu == 3) {
				remover(contact2);
				
			} else if(menu == 4) {
				menu = 4;
			}
			
			
		}while(menu !=4);
	}

	
	

}