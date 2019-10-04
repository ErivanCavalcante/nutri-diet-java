package com.nutridiet.logica;
import java.awt.EventQueue;

import com.nutridiet.telas.TelaLogin;
import com.nutridiet.telas.TelaPrincipal;
import com.nutridiet.telas.TelaSingup;

public class NutriDiet 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					//Inicia com o pedido para logar
					TelaLogin login = new TelaLogin();
					login.setLocationRelativeTo(null);
					login.setVisible(true);
					
					//Nao logou no sistema acaba o programa
					switch (login.login.pegarOpcaoSelecionada()) 
					{
						case LogicaLogin.OPCAO_LOGAR:
							login.dispose();
							break;
						case LogicaLogin.OPCAO_SINGUP:
						{
							login.dispose();
							
							//Cria o singup
							TelaSingup singup = new TelaSingup();
							singup.setLocationRelativeTo(null);
							singup.setVisible(true);
							
							switch (singup.login.pegarOpcaoSelecionada()) 
							{
								case LogicaLogin.OPCAO_LOGAR:
									singup.dispose();
									break;
								default:
									singup.dispose();
									return;
							}
						}
						break;
						default:
							login.dispose();
							return;
					}
					
					//Logou no sistema
					TelaPrincipal telaPrincipal = new TelaPrincipal();
					telaPrincipal.setLocationRelativeTo(null);
					telaPrincipal.setVisible(true);
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}