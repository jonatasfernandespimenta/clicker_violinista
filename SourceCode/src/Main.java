import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Violino violino = new Violino();
		Places places = new Places();
		
		String opt[] = {"Tocar", "Comprar Cordas", "Listar", "Afinar", "Fechar"};
		String opt1[] = {"Praça", "Centro", "Rodoviaria", "Casamento", "Teatro", "Voltar"};
		int op, op1 = 0;
		
		do {
			op = JOptionPane.showOptionDialog(null, "escolha a opção",
					"menu principal", 1, -1, null, opt, opt);
			
			switch (op) {
			case 0:
				do {
					op1 = JOptionPane.showOptionDialog(null, "escolha onde você irá tocar",
							"menu principal", 1, -1, null, opt1, opt1);
					
					switch (op1) {
					case 0:
						violino.Tocar(places.Praca());
						break;
						
						
					case 1:
						if(violino.getFama() >= 70) {
							violino.Tocar(places.Rodoviaria());
						}else {
							JOptionPane.showMessageDialog(null, "Todos os mendigos te expulsaram"
																+ "\nFama minima necessaria: 70");
						}
						break;
					case 2:
						if(violino.getFama() >= 100) {
							violino.Tocar(places.Centro());
						}else {
							JOptionPane.showMessageDialog(null, "Não há espaço para você no palco do centro da cidade."
																+ "\nFama minima necessaria: 100");
						}
						break;
					case 3:
						if(violino.getFama() >= 300) {
							violino.Tocar(0);
						}else {
							JOptionPane.showMessageDialog(null, "Ninguém quer te contratar pois você não possui fama"
																+ "\nFama minima necessaria: 300");
						}
						break;
						
					case 4:
						if(violino.getFama() >= 500) {
							violino.Tocar(0);
						}else {
							JOptionPane.showMessageDialog(null, "Você tenta entrar no teatro, porem, como não é famoso o suficiente, os seguranças te expulsam"
																+ "\nFama minima necessaria: 500");
						}
						break;
					case 5:
						
						break;
					default:
						break;
					}
				}while(op1 != 5);

				break;
				
			case 1:
				violino.ComprarCordas();
				break;
				
			case 2:
				violino.Listar();
				break;
				
			case 3:
				violino.Afinar();
				break;
				
			default:
				break;
			}
			
		}while(op != 4);
		
	}

}
