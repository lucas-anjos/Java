package contas;

public class Conta {
    //atributos
	public String cliente;
	public double saldo;
	//construtor
	public Conta() {
		System.out.println("Ag�ncia 0261");
	}
	//m�todo sem retorno
	public void exibirSaldo() {
		System.out.println("Saldo: R$ "+ saldo);
	}
	//m�todo sem retorno com par�metros(dados = vari�veis)
	void sacar(double valor) {
		saldo -= valor; //saldo = saldo - valor
		System.out.println("D�bito: "+ valor);
	}	
	void depositar(double valor) {
		saldo += valor; //saldo = saldo + valor
		System.out.println("Cr�dito: "+ valor);
	}
	//m�todo sem retorno
	//conta -> classse modelo
	//destino � o objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //1� voc� debita da conta
		destino.depositar(valor);//2� transfer�ncia
		System.out.println("Transfer�ncia: "+ valor);
	}
	//m�todo com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;
	}
}
