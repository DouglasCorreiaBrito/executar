package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProcurarController implements ActionListener {
	
	private JTextField textField;
	
	 public ProcurarController(JTextField textField) {
		 this.textField = textField;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos .exe", "exe");
		String dirBase = System.getProperty("user.home") + "/Desktop";
		File dir = new File(dirBase);
		
		JFileChooser choose = new JFileChooser();
		choose.setCurrentDirectory(dir);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.setAcceptAllFileFilterUsed(false);
		choose.addChoosableFileFilter(filtro);
		String caminhoArquivo= "";
		
		int retorno = choose.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			
			caminhoArquivo = choose.getSelectedFile().getAbsolutePath();
			textField.setText(caminhoArquivo);
		}
		
	}
	

}
