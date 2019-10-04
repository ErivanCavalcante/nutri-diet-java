package com.nutridiet.logica;

public class LogicaLogin 
{
	//Opcoes usuadas na tela
	public static final int OPCAO_LOGAR = 0;
	public static final int OPCAO_SINGUP = 1;
	public static final int OPCAO_SAIR = 2;
	
	public int opcao = -1;
	
	//Usuario logado
	Usuario usuario;
	
	public void criarUsuario(Usuario u)
	{
		if(u == null)
			return;
		
		usuario = u;
	}

	public int pegarOpcaoSelecionada()
	{
		return opcao;
	}
	
	public Usuario pegarUsuarioLogado() 
	{
		return usuario;
	}
}
