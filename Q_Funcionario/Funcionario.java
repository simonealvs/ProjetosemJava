package Aula_Q_Funcionario;

public abstract class Funcionario {
	
	private String nome;
	private int matricula;
	private double salarioBase;
	
	public static int cont=0; //Contador de Funcionários
	
	public Funcionario(String nome, int matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		cont+=1;
	}
	
	public Funcionario() {
		this.nome = "-";
		this.matricula = 0;
		this.salarioBase = 0;
		cont+=1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public static String teste() {
		return "oi";
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", salarioBase=" + salarioBase + "]";
	}
	
	public abstract double calculaSalario();
	
}
