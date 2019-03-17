package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OkController implements ActionListener {
	
	private JTextField textField;
	private JFrame jFrame;
	
	public OkController(JTextField textField, JFrame jFrame) {
		this.textField = textField;
		this.jFrame = jFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			Runtime.getRuntime().exec(textField.getText());
			
		}catch (Exception ex) {
			
			JOptionPane.showMessageDialog(null,"Arquivo Inválido","Erro", JOptionPane.ERROR_MESSAGE);
			
		}finally {
			jFrame.dispose();
		}
			
		
		
	}

	
}
