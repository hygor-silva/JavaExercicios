import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Escolha o que quer desenhar! ");
		System.out.println("1 - Triângulo, 2 - Quadrado ou 3 - Círculo");
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		
		
		switch(num){
		
		case 1: 
			System.out.println("Você escolheu desenha um Triângulo!");
			System.out.println("Digite o valor da base do Triângulo!");
			int baseT = entrada.nextInt();

				for(int w = baseT; w>0;w--) {
					for(int y = 0; y<w; y++) {
						System.out.print(" ");
						
					}System.out.print("*");
					for(int z = baseT; z>w; z--) {
						System.out.print("*");
					} for(int z = baseT; z>w; z--) {
						System.out.print("*");
					} 
					System.out.println("");
				}
			break;
			
		case 2: 
			System.out.println("Você escolheu desenha um Quadrado!");
			System.out.println("Digite o valor da base do Quadrado!");
			int baseQ = entrada.nextInt();
			int i =baseQ;
			int x = baseQ;
				for(x = 0; x<baseQ; x++) {
					for(i = 0; i<baseQ; i++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
			
			break;
			
		case 3: 
			System.out.println("Você escolheu desenha um Círculo!");
			System.out.println("Digite o valor do raio do Círculo!");
			int baseC = entrada.nextInt();
			
			break;
		}

	}

}
