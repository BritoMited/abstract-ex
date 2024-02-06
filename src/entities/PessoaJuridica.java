package entities;

public class PessoaJuridica  extends Pessoa{
	
	private Integer quantFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double renda, Integer quantFuncionarios) {
		super(nome, renda);
		this.quantFuncionarios = quantFuncionarios;
	}

	public Integer getQuantFuncionarios() {
		return quantFuncionarios;
	}

	public void setQuantFuncionarios(Integer quantFuncionarios) {
		this.quantFuncionarios = quantFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		
		if(quantFuncionarios > 10) {
			imposto = getRenda() - (getRenda() * 0.14);
		}else {
			imposto = getRenda() - (getRenda() * 0.16);
		}
		
		return imposto;
	}
	
	

}
