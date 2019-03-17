package view;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.CancelarController;
import controller.OkController;
import controller.ProcurarController;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbrir = new JLabel("Abrir:");
		lblAbrir.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblAbrir.setBounds(27, 75, 46, 14);
		contentPane.add(lblAbrir);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnOk.setBounds(81, 115, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnCancelar.setBounds(204, 115, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnProcurar.setBounds(326, 115, 89, 23);
		contentPane.add(btnProcurar);
		
		textField = new JTextField();
		textField.setBounds(72, 71, 354, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCaminho = new JLabel("Digite o caminho do executável ou clique em procurar");
		lblDigiteOCaminho.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblDigiteOCaminho.setBounds(96, 11, 298, 14);
		contentPane.add(lblDigiteOCaminho);
		
		JLabel lblIcone = new JLabel("");
		lblIcone.setBounds(10, 11, 57, 53);
		ImageIcon imagem = new ImageIcon(Tela.class.getResource("/img/java.png"));
		Image imag = imagem.getImage().getScaledInstance(lblIcone.getWidth(), lblIcone.getHeight(),Image.SCALE_SMOOTH);
		lblIcone.setIcon(new ImageIcon(imag));
		contentPane.add(lblIcone);
		
		ProcurarController pc = new ProcurarController(textField);
		btnProcurar.addActionListener(pc);
		
		OkController oc = new OkController(textField,this);
		btnOk.addActionListener(oc);
		
		CancelarController cc = new CancelarController(this);
		btnCancelar.addActionListener(cc);
		
	}
}
