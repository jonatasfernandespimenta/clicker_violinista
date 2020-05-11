import java.util.Random;

public class Places {
	Random random = new Random();
	
	protected int Pessoas;
	
	public Places() {
		this(0);
	}
	
	public Places(int Pessoas) {
		this.Pessoas = Pessoas;
	}

	public int getPessoas() {
		return this.Pessoas;
	}

	public void setPessoas(int pessoas) {
		Pessoas = pessoas;
	}

	public int Praca() {
		this.setPessoas(random.nextInt(10) + 1);
		return Pessoas;
	}
	
	public int Centro() {
		this.setPessoas(random.nextInt(70) + 1);
		return Pessoas;
	}
	
	public int Rodoviaria() {
		this.setPessoas(random.nextInt(50) + 1);
		return Pessoas;
	}
	
}
