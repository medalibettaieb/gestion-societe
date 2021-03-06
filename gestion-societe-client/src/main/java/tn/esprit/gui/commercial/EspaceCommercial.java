package tn.esprit.gui.commercial;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EspaceCommercial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceCommercial frame = new EspaceCommercial();
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
	public EspaceCommercial() {
		setTitle("Espace Commercial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(false);
		JLabel lblEspaceCommercial = new JLabel("Espace Commercial");
		lblEspaceCommercial.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEspaceCommercial.setBounds(127, 119, 209, 34);
		contentPane.add(lblEspaceCommercial);
	}

}
