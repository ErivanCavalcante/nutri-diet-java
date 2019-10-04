package com.nutridiet.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnPacientes;
	private JButton btnAlimentos;
	private JButton btnConf;
	
	
	
	
	////////Minhas Variaveis/////////
	int opcaoMenu 							= -1;
	private JPanel panelOpcao;

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() 
	{
		setTitle("DietNutri - Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 598);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		
		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mnArquivo.add(mntmFechar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		
		panelOpcao = new JPanel();
		panelOpcao.setBackground(new Color(248, 248, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelOpcao, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panelOpcao, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
		);
		panelOpcao.setLayout(new BorderLayout(0, 0));
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		btnPacientes = new JButton("Pacientes");
		btnPacientes.setForeground(new Color(255, 255, 255));
		btnPacientes.setBackground(new Color(255, 165, 0));
		btnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				setaOpcaoMenu(0);
			}
		});
		panel.add(btnPacientes);
		
		btnAlimentos = new JButton("Alimentos");
		btnAlimentos.setForeground(new Color(255, 255, 255));
		btnAlimentos.setBackground(new Color(255, 165, 0));
		btnAlimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				setaOpcaoMenu(1);
			}
		});
		panel.add(btnAlimentos);
		
		btnConf = new JButton("Configura\u00E7\u00F5es");
		btnConf.setForeground(new Color(255, 255, 255));
		btnConf.setBackground(new Color(255, 165, 0));
		btnConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setaOpcaoMenu(3);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel.add(panel_1);
		panel.add(btnConf);
		contentPane.setLayout(gl_contentPane);

	}

	void logarSistema()
	{
		
	}
	
	protected void setaOpcaoMenu(int opcao) 
	{
		//Otimizacao
		if(opcaoMenu == opcao)
			return;
		
		//List d botoes
		JButton listaBtn[] = {btnPacientes, btnAlimentos, btnConf};
		
		//Quantiade d botoes 3
		for(int i = 0; i < 3; ++i)
		{
			if(opcao == i)
			{
				listaBtn[i].setBackground(new Color(72, 61, 139));
				continue;
			}
			
			listaBtn[i].setBackground(new Color(255, 165, 0));
		}
		
		//Seta o painel do menu atual
		panelOpcao.removeAll();
		
		switch(opcao) 
		{
			case 0:
				panelOpcao.add(new PainelPacientes());
				break;
			case 1:
				
				break;
			case 2:
	
				break;
			case 3:
				
				break;
		
			default:
				break;
		}
		
		panelOpcao.revalidate();
		panelOpcao.repaint();
		
		//Guarda a opcao atual
		opcaoMenu = opcao;
	}
}
