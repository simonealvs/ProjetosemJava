package Aula_Q_Funcionario;

public class Gerente extends Funcionario {
	
	public Gerente(String nome,int matricula,double sb){
		super(nome,matricula,sb);
	}
	
	public Gerente(){
		super();
	}
	
	@Override
	public double calculaSalario() {
		return getSalarioBase()*2;
	}

	@Override
	public String toString() {
		return super.toString()+"->Eu sou gerente e recebo: R$"+calculaSalario()+".";
	}
	
}
