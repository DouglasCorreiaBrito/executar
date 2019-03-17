package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelarController implements ActionListener {
	
	private JFrame jFrame;
	
	public CancelarController( JFrame jFrame) {
		
		this.jFrame = jFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		jFrame.dispose();
		
	}

	
}
