import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Escolha o que quer desenhar! ");
		System.out.println("1 - Tri�ngulo, 2 - Quadrado ou 3 - C�rculo");
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		
		
		switch(num){
		
		case 1: 
			System.out.println("Voc� escolheu desenha um Tri�ngulo!");
			System.out.println("Digite o valor da base do Tri�ngulo!");
			int baseT = entrada.nextInt();
			int y =baseT;
			int z = baseT;
				for(y = 1; y<baseT;y++) {
					for(z = 1; z<y; z++) {
						System.out.print("*  ");
					}System.out.println("");
				}
				for(z=baseT; z>1;z--) {
					for(y = 1; y<z; y++) {
						System.out.print("*  ");
					}System.out.println("");
			}
			
			break;
			
		case 2: 
			System.out.println("Voc� escolheu desenha um Quadrado!");
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
			System.out.println("Voc� escolheu desenha um C�rculo!");
			System.out.println("Digite o valor do raio do C�rculo!");
			int baseC = entrada.nextInt();
			
			break;
		}

	}

}
