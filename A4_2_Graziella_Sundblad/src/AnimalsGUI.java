import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;


public class AnimalsGUI extends JFrame {
	
	

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnimalsGUI() {
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Snake("Darth", "Bitis Poisonus", true));
		animalList.add(new Dog("Jar Jar","Caninus Dumbus", 5, true));
		animalList.add(new Hamster("Chewbacca","Hamsteris Crappitus", 2,true));
		animalList.add(new Dog("Yoda","Caninus Einsteinus",6, false));
		animalList.add(new Cat("Kenobi","Felinus Mortalus", 6, 1));
		animalList.add(new Cat("Princess Leia","Felinus Immortalus", 3, 100));
		animalList.add(new Hamster("Anakin","Hamsteris Constipatus", 1,false));		
		animalList.add(new Snake("R2-D2","Corallus Gulligus", false));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 622, 388);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Oxygen", Font.BOLD, 13));
		scrollPane.setViewportView(textArea);
		
		
		
		JLabel lblNewLabel = new JLabel("Animal list");
		lblNewLabel.setBounds(10, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(632, 37, 547, 388);
		lblNewLabel_2.setIcon(new ImageIcon(AnimalsGUI.class.getResource("/images/animals2.jpg")));
		contentPane.add(lblNewLabel_2);
		
		for(Animal a : animalList){
			textArea.append(a.getInfo()+ "\n");
		}
		
	}
}