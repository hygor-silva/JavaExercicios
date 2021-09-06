
public abstract class testeApp {

	public static void main(String[] args) {
		
		int i = 0;
		int x = 0;
		int z = 0;
		int y = 0;
		int w = 0;
		int a = 0;
		
		
		
		
			for(x = 6; x>0;x--) {
				if(x <=3) {
					
					
					for(i = 0; i<x-1; i++) {
						System.out.print(" ");
						
					}
					for(y = 6; y>x; y--) {
						System.out.print("*");
					} 
					System.out.print("");
					for(y = 6; y>x; y--) {
						System.out.print("*");
					} 
					System.out.println(" ");
				}
				
				
				
			}System.out.print("");
			System.out.print("");
			for(z=6; z>1;z--) {
				for(i = 6; i>z; i--) {
				System.out.print(" ");
				
				
				}for(w = 0; w<i-1; w++) {
					
				System.out.print("*");
				
				}
				for(a = 0; a<i-1; a++) {
					System.out.print("*");
					
				}System.out.println("");
				if(w <=3) {
				
					break;
				}
	
		}

			
			
		}

}
