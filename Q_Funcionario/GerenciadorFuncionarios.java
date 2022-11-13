package Aula_Q_Funcionario;

import java.util.ArrayList;

public class GerenciadorFuncionarios {
	ArrayList<Funcionario> lista;
	
	public GerenciadorFuncionarios() {
		this.lista=new ArrayList<Funcionario>();
	}
	
	public void addFuncionario(Funcionario fun) {
		for(Funcionario f:this.lista) {
			if(f.getMatricula()==fun.getMatricula()) {
				System.out.println("Erro. Matrícula já cadastrada!");
				return;
			}
		}
		this.lista.add(fun);
		System.out.println("Funcionário cadastrado com sucesso!");
	}
	
	public void removerFuncionario(int matricula) {
		for(Funcionario f:this.lista) {
			if(f.getMatricula()==matricula) {
				this.lista.remove(f);
				System.out.println("Matrícula "+matricula+" removida com sucesso!");
				return;
			}
		}
		System.out.println("Matrícula não encontrada!");
	}
	
	
	public double folhaSalarial() {
		double cont=0;
		for(Funcionario f:this.lista) {
			cont+=f.calculaSalario();
		}
		return cont;
	}
	
	public double somaCom() {
		double cont=0;
		
		for(Funcionario f:this.lista) {
			if(f instanceof Vendedor) {
				Vendedor v=(Vendedor)f;
				cont+=v.getComissao();
			}
		}
		return cont;
	}
}
