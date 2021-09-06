
public abstract class testeApp {

	public static void main(String[] args) {
		
		int i = 0;
		int x = 0;
		int z = 0;
		int y = 0;
		int w = 0;
		int a = 0;
		
		
		
			for(x = 10; x>0;x--) {
				for(i = 0; i<x; i++) {
					System.out.print(" ");
					
				}
				for(y = 10; y>x; y--) {
					System.out.print("*");
				} for(y = 10; y>x; y--) {
					System.out.print("*");
				} 
				System.out.println("");
				
			}
			
			for(z=10; z>1;z--) {
				for(i = 10; i>z; i--) {
				System.out.print(" ");
				
				
				}for(w = 0; w<i; w++) {
					
				System.out.print("*");
				
				
				}
				for(a = 0; a<i-1; a++) {
					System.out.print("*");
					
				}System.out.println("");
	
		}

			
			
		}

}
