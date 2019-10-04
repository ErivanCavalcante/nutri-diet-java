package com.nutridiet.telas;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PainelAreaPaciente extends JPanel 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelAreaPaciente() {
		setBackground(new Color(211, 211, 211));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton = new JButton("Anamnese");
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Exame Fisico");
		btnNewButton_4.setForeground(new Color(0, 0, 128));
		btnNewButton_4.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("Exames Bioquimicos");
		btnNewButton_8.setForeground(new Color(0, 0, 128));
		btnNewButton_8.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("Avalia\u00E7\u00E3o Antropometrica");
		btnNewButton_6.setForeground(new Color(0, 0, 128));
		btnNewButton_6.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Necessidades Energeticas");
		btnNewButton_5.setForeground(new Color(0, 0, 128));
		btnNewButton_5.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("Planejamento de Cardapios");
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_9 = new JButton("Suplementa\u00E7\u00E3o");
		btnNewButton_9.setForeground(new Color(0, 0, 128));
		btnNewButton_9.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_3 = new JButton("Orienta\u00E7\u00F5es");
		btnNewButton_3.setForeground(new Color(0, 0, 128));
		btnNewButton_3.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Relatorio");
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_7 = new JButton("Imprimir");
		btnNewButton_7.setForeground(new Color(0, 0, 128));
		btnNewButton_7.setBackground(new Color(70, 130, 180));
		panel_1.add(btnNewButton_7);
		setLayout(groupLayout);

	}
}
