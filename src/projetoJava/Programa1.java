package projetoJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa1 {

	public static void main(String[] args) {
		final String user = "Amanda";
		final String pass = "abcde";
		
		JFrame frame = new JFrame ("Acesso ao sistema");/**Nome da janela */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/**fechar o programa quando sair*/
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); /** Gerenciador de layout */
		
		JLabel lbUsuario = new JLabel("Usuario: ");  /**caixa do usuario*/
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe seu usuario de acesso....");
		
		JLabel lbsenha = new JLabel("Senha: "); /**caixa da senha */
		JPasswordField txtSenha = new JPasswordField(20);
		txtSenha.setToolTipText("Informe sua senha de acesso....");
		
		JButton btnLogin = new JButton("Login"); /**botão login */
		
		btnLogin.addActionListener(new ActionListener() {
			/**Notificação de acesso*/
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals(user) && new String(txtSenha.getPassword()).equals(pass)) {
					JOptionPane.showMessageDialog(frame, "Acesso Autorizado");
				}else {
					JOptionPane.showMessageDialog(frame, "Acesso Negado");
				}
			}
		});
		
		/**adiciona os itens no painel */
		panel.add(lbUsuario); 
		panel.add(txtUsuario);
		panel.add(lbsenha);
		panel.add(txtSenha);
		panel.add(btnLogin);
		
		/**add o painel dentro da caixa*/
		frame.setContentPane(panel);
		frame.pack(); /** encapsula*/
		frame.setVisible(true); /** deixa visivel*/
		

	}

}
