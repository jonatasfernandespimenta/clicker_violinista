import java.util.Random;

import javax.swing.JOptionPane;

public class Violino {
	Random random = new Random();
	Places places = new Places();
	
	
	protected int DurabilidadeCorda;
	protected int Cordas;
	protected double Saldo;
	protected int Fama;
	protected boolean Afinado;
	
	public Violino() {
		this(10, 4, 0.5, 1, true);
	}
	
	public Violino(int DurabilidadeCorda, int Cordas, double Saldo, int Fama, boolean Afinado) {
		this.DurabilidadeCorda = DurabilidadeCorda;
		this.Cordas = Cordas;
		this.Saldo = Saldo;
		this.Fama = Fama;
		this.Afinado = Afinado;
	}

	public int getDurabilidadeCorda() {
		return this.DurabilidadeCorda;
	}
	public void setDurabilidadeCorda(int durabilidadeCorda) {
		DurabilidadeCorda = durabilidadeCorda;
	}
	public int getCordas() {
		return this.Cordas;
	}
	public void setCordas(int cordas) {
		Cordas = cordas;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public int getFama() {
		return this.Fama;
	}

	public void setFama(int fama) {
		Fama = fama;
	}

	public boolean isAfinado() {
		return this.Afinado;
	}

	public void setAfinado(boolean afinado) {
		Afinado = afinado;
	}

	public void Listar() {
		String afinacao;
		
		if(this.isAfinado() == true) {
			afinacao = "Sim";
		}else {
			afinacao = "Não";
		}
		
		JOptionPane.showMessageDialog(null, "Saldo: " + this.getSaldo() + 
											"\nCordas: " + this.getCordas() + 
											"\nFama: " + this.getFama() + 
											"\nInstrumento Afinado: " + afinacao);
	}

	public void Tocar(int pessoas) {
		if(this.getCordas() <= 0) {
			JOptionPane.showMessageDialog(null, "Suas cordas acabaram :/");
		}else {
			JOptionPane.showMessageDialog(null, "Som de violino ._.");
			this.setDurabilidadeCorda(this.getDurabilidadeCorda() - 1);
			
			if(this.getDurabilidadeCorda() <= 0) {
				JOptionPane.showMessageDialog(null, "Uma corda estourou");
				this.setCordas(this.getCordas() - 1);
				
				if(this.getCordas() <= 0) {
					
				}else {
					this.setDurabilidadeCorda(10);
				}
			}
			this.setSaldo(this.getSaldo() + pessoas);
		}
		
		if(this.isAfinado() == true) {
			this.setFama(this.getFama() + pessoas);
		}else {
			this.setFama(this.getFama() - (this.getFama() * pessoas));
		}
		
	}
	
	public void Afinar() {
		this.setAfinado(false);
	}
	
	public void ComprarCordas() {
		if(this.getSaldo() >= 30) {
			JOptionPane.showMessageDialog(null, "1 Corda comprada :D");
			this.setSaldo(this.getSaldo() - 30);
			this.setCordas(this.getCordas() + 1);
		}else {
			JOptionPane.showMessageDialog(null, "Você não tem dinheiro!");
		}
	}
}
