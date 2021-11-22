package farmacia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenPedidoJFrame extends JFrame {

	private JPanel contentPane;
	FarmaciaJFrame farmaciaJFrame = new FarmaciaJFrame();
	/**
	 * Create the frame.
	 */
	public ResumenPedidoJFrame(String distribuidor, String medicamento, String unidades,
            String tipoMedicamento, String direccion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(unidades + " unidades " + tipoMedicamento + " " + medicamento);
		lblNewLabel.setBounds(10, 10, 416, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(direccion);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 33, 416, 112);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeJfrane();
		        farmaciaJFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(94, 155, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pedido enviado de forma correcta");
		        JOptionPane.showMessageDialog(null, "Pedido enviado de forma correcta",
		                "Confirmación", JOptionPane.INFORMATION_MESSAGE);
		        closeJfrane();
		        farmaciaJFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(229, 155, 85, 21);
		contentPane.add(btnNewButton_1);
		
		this.setTitle("Pedido al distribuidor " + distribuidor);
        this.setLocationRelativeTo(null);
		
	}
	
	public void closeJfrane() {
		this.dispose();
	}
}
