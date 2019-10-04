package com.nutridiet.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.nutridiet.logica.LogicaLogin;
import com.nutridiet.logica.Usuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaLogin extends JDialog 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField edtUsuario;
	private JPasswordField edtSenha;
	private JButton btnSingup;
	
	
	
	///////////Minhas variaveis//////////
	public LogicaLogin login = new LogicaLogin();

	/**
	 * Create the dialog.
	 */
	public TelaLogin() 
	{
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent arg0) 
			{
				resEventoFechar();
			}
		});
		setTitle("DietNutri - Login");
		setResizable(false);
		setModal(true);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(211, 211, 211));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 0, 139));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		
		edtUsuario = new JTextField();
		edtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		
		edtSenha = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUsuario)
					.addContainerGap(253, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(edtUsuario, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSenha)
					.addContainerGap(253, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(edtSenha, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(142, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUsuario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(edtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSenha)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(edtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				resBtnLogar();
			}
		});
		panel_1.add(btnLogin);
		{
			btnSingup = new JButton("Sing Up");
			panel_1.add(btnSingup);
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					resBtnSingup();
				}
			});
		}
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(58, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(47)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_1, edtUsuario, edtSenha, btnSingup, lblUsuario, lblSenha}));
		contentPanel.setLayout(gl_contentPanel);
	}

	protected void resEventoFechar() 
	{
		//Seta a opcao
		setaOpcaoFecha(LogicaLogin.OPCAO_SAIR);
	}

	protected void resBtnSingup() 
	{
		//Seta a opcao
		setaOpcaoFecha(LogicaLogin.OPCAO_SINGUP);
	}

	protected void resBtnLogar() 
	{
		String usuario = edtUsuario.getText();
		String senha = new String(edtSenha.getPassword());
		
		//Valida os campos
		if(usuario.isEmpty() || senha.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Todos os Campos Devem Ser Preenchidos");
			return;
		}
		
		if(usuario.compareToIgnoreCase("taylinne") == 0 && senha.compareTo("12345") == 0)
		{
			//Cria o usuario
			login.criarUsuario(new Usuario(0, "taylinne"));
			
			//Seta a opcao
			setaOpcaoFecha(LogicaLogin.OPCAO_LOGAR);
			return;
		}
		
		JOptionPane.showMessageDialog(this, "Usuario Invalido");
	}

	void setaOpcaoFecha(int opcao)
	{
		login.opcao = opcao;
		
		setVisible(false);
	}
}
