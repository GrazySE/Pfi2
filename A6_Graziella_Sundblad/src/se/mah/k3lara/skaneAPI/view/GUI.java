
/**author: Graziella Sundblad - Assignment 6*/

package se.mah.k3lara.skaneAPI.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane;
	JTextField fieldSearch;
	JTextField fieldFrom;
	JTextField fieldTo;

	JTextArea areaResult1 = new JTextArea();
	JTextArea areaResult2 = new JTextArea();
	
	GUI g = this;
	private Parser p = new Parser();
	
	Thread t1 = new JourneysThread(p, this);
	Thread t2 = new StationsThread(p, this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setResizable(false);
		setTitle("Grazy's super awesome travel planner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 622);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 0, 416, 247);
		contentPane.add(panel);
		panel.setLayout(null);

		fieldSearch = new JTextField();
		fieldSearch.setBounds(10, 24, 131, 20);
		panel.add(fieldSearch);
		fieldSearch.setColumns(10);

		JButton btn1 = new JButton("Sök");
		btn1.setBounds(10, 55, 131, 51);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				Thread t2 = new StationsThread(p,g);
				
				t2.start();
			}
		});
		panel.add(btn1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 118, 323, 106);
		panel.add(scrollPane);

		scrollPane.setViewportView(areaResult1);

		JLabel lblSkStation = new JLabel("Sök Busshållplats");
		lblSkStation.setBounds(10, 9, 131, 14);
		panel.add(lblSkStation);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(426, 0, 364, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		fieldFrom = new JTextField();
		fieldFrom.setBounds(10, 24, 86, 20);
		panel_1.add(fieldFrom);
		fieldFrom.setColumns(10);

		fieldTo = new JTextField();
		fieldTo.setBounds(10, 77, 86, 20);
		fieldTo.setText("");
		panel_1.add(fieldTo);
		fieldTo.setColumns(10);

		JLabel lblFrn = new JLabel("Från");
		lblFrn.setBounds(10, 11, 46, 14);
		panel_1.add(lblFrn);

		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(10, 64, 46, 14);
		panel_1.add(lblTill);

		JButton btn2 = new JButton("Sök resa");
		btn2.setBounds(106, 23, 101, 74);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread t1 = new JourneysThread(p,g);
				t1.start();

			}
		});
		panel_1.add(btn2);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 109, 350, 113);
		panel_1.add(scrollPane_1);
		scrollPane_1.setViewportView(areaResult2);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 245, 780, 379);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(GUI.class.getResource("/image/assignment6.png")));
	}
}