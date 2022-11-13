package Aula_Q_Funcionario;

public class Vendedor extends Funcionario{
	private double comissao;

	public Vendedor(String nome, int matricula, double salarioBase, double comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase()+this.comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	@Override
	public String toString() {
		return super.toString()+"->Eu sou vendedor e recebo: R$"+calculaSalario()+", desse valor eu recebi R$"+this.comissao+"de comissão.";
	}
	
}
