package Aula_Q_Funcionario;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				//Funcionario f=new Funcionario();
				Gerente g=new Gerente("Leandro", 123 ,500);
				Gerente g2=new Gerente("Any", 123 ,10000);
				
				Vendedor v = new Vendedor("Luan", 125, 300,200);
				Vendedor v2 = new Vendedor("Luan2", 1200, 300,100);
				GerenciadorFuncionarios controle=new GerenciadorFuncionarios();
				controle.addFuncionario(v2);
				controle.addFuncionario(g);
				controle.addFuncionario(g2);//matricula igual!
				controle.addFuncionario(v);
				
				//controle.removerFuncionario(125);
				//controle.removerFuncionario(125);
				System.out.println(controle.folhaSalarial());
				System.out.println(controle.somaCom());
	}

}
