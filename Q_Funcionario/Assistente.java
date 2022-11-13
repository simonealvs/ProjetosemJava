package Aula_Q_Funcionario;

public class Assistente extends Funcionario{

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase();
	}
	
	@Override
	public String toString() {
		return super.toString()+" -> Eu sou assistente e recebo: R$ "+calculaSalario()+".";
	}

}
