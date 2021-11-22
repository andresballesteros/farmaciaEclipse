package farmacia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class FarmaciaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmaciaJFrame frame = new FarmaciaJFrame();
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
	public FarmaciaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
        this.setTitle("Farmacia");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medicamento");
		lblNewLabel.setBounds(5, 5, 426, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(5, 20, 491, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Medicamento");
		lblNewLabel_1.setBounds(5, 47, 201, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 71, 242, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(254, 47, 210, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione Uno", "Analg\u00E9sico", "Anal\u00E9ptico", "Anest\u00E9sico", "Anti\u00E1cido", "Antidepresivo", "Antibi\u00F3ticos"}));
		comboBox.setBounds(5, 70, 239, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Distribuidor Farmac\u00E9utico");
		lblNewLabel_3.setBounds(5, 101, 201, 13);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cofarma");
		rdbtnNewRadioButton.setBounds(5, 120, 77, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Empsephar");
		rdbtnNewRadioButton_1.setBounds(84, 120, 93, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Cemefar");
		rdbtnNewRadioButton_2.setBounds(179, 120, 73, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Sucursal");
		lblNewLabel_4.setBounds(254, 101, 209, 13);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Principal");
		chckbxNewCheckBox.setBounds(254, 120, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Segundaria");
		chckbxNewCheckBox_1.setBounds(349, 120, 147, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				comboBox.setSelectedItem("Seleccione Uno");
				buttonGroup.clearSelection();
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				
			}
		});
		btnNewButton.setBounds(137, 185, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean error = false;
		        String errorMsg = "";
		        
		        if(textField.getText().equals("") || textField == null) {
		        	error = true;
		            errorMsg = errorMsg + "Debe ingresar un medicamento \n";
		        }
		        
		        if(!textField.getText().equals("") && textField.getText() != null) {
		        	Pattern patMedicamento = Pattern.compile("[0-9a-zA-Z]+");
		            Matcher matMedicamento = patMedicamento.matcher(textField.getText());
		            if (!matMedicamento.matches()) {
		                error = true;
		                errorMsg = errorMsg + "El medicamento solo debe contener números y letras \n";
		            }
		        }
		        
		        if (comboBox.getSelectedItem().equals("Seleccione Uno")) {
		            error = true;
		            errorMsg = errorMsg + "Debe seleccionar un tipo medicamento \n";
		        }
		        
		        if(textField.getText().equals("") || textField == null) {
		        	error = true;
		            errorMsg = errorMsg + "Debe ingresar la cantidad de  medicamentos \n";
		        }
		        
		        if(!textField_1.getText().equals("") && textField_1.getText() != null) {
		        	Pattern patMedicamento = Pattern.compile("[0-9]+");
		            Matcher matMedicamento = patMedicamento.matcher(textField_1.getText());
		            if (!matMedicamento.matches()) {
		                error = true;
		                errorMsg = errorMsg + "La cantidad medicamento debe ser un número positivo \n";
		            }
		        }
		        
		        if (!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected() && !rdbtnNewRadioButton_2.isSelected()) {
		            error = true;
		            errorMsg = errorMsg + "Debe seleccionar un distribuidor farmacéutico \n";
		        }
		        
		        if(!chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_1.isSelected()) {
		        	error = true;
		            errorMsg = errorMsg + "Debe seleccionar un distribuidor farmacéutico \n";
		        }
		        
		        if (error) {
		            JOptionPane.showInternalMessageDialog(null, errorMsg, "Error Validacion", JOptionPane.ERROR_MESSAGE);
		        } else {
		            ResumenPedidoJFrame resumenPedidoJFrame = new ResumenPedidoJFrame(getSelectedButton(buttonGroup),
		                    textField.getText(), textField_1.getText(), comboBox.getSelectedItem().toString(),
		                    direccionSucursales(chckbxNewCheckBox, chckbxNewCheckBox_1));
		            resumenPedidoJFrame.setVisible(true);
		            closeJfrane();
		        }
		        
			}
		});
		btnNewButton_1.setBounds(254, 185, 109, 21);
		contentPane.add(btnNewButton_1);
		
		
	}
	
	public String getSelectedButton(ButtonGroup group) {
        Enumeration<AbstractButton> e = group.getElements();
        while (e.hasMoreElements()) {
            AbstractButton b = e.nextElement();
            if (b.isSelected()) {
                return b.getText();
            }
        }
        return null;
    }
	
	public String direccionSucursales(JCheckBox sucursal1, JCheckBox sucursal2) {
      
        String direccion = "";
        if (sucursal1.isSelected() && sucursal2.isSelected()) {
            direccion = "<html>Para la farmacia situada en Calle de la Rosa n.28"
                    + "<br>y para la situada en Calle Alcazabilla n.3</html>";
        } else if (sucursal1.isSelected() && !sucursal2.isSelected()) {
            direccion = "Para la farmacia situada en Calle de la Rosa n.28";
        } else if (!sucursal1.isSelected() && sucursal2.isSelected()) {
            direccion = "Para la farmacia situada en Calle de la Rosa n.28";
        }
        return direccion;
    }
	
	public void closeJfrane() {
		this.dispose();
	}
	
}
