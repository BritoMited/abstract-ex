package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastoSaude;
	
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double imposto() {
		double imposto = 0;
		
		if(getRenda() < 20000 ) {
			imposto = getRenda() - (getRenda() * 0.15);
		}else {
			imposto = getRenda() - (getRenda() * 0.25);
		}
		if(getGastoSaude() > 0) {
			imposto -= getGastoSaude() * 0.50;
		}
		
		return imposto;
	}
	
	

}
