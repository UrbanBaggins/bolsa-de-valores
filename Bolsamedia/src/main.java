import java.util.Scanner;

	public class main {
		
		public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	
		int [][] valores = new int [4][7];
		int soma = 0;
		int [][] some = new int [4][1];
		 
		for (int x = 0; x < 4; x++) {
	    	System.out.println("Qual o valor da bolsa na segunda?");
	    		valores[x][0] = input.nextInt();
	    	System.out.println("Qual o valor da bolsa na terça?");
	    		valores[x][1] = input.nextInt();
	    	System.out.println("Qual o valor da bolsa na quarta?");
	    		valores[x][2] = input.nextInt();
	    	System.out.println("Qual o valor da bolsa na quinta?");
	    		valores[x][3] = input.nextInt();
	        System.out.println("Qual o valor da bolsa na sexta?");
	    		valores[x][4] = input.nextInt();
	    	System.out.println("Qual o valor da bolsa na sabado?");
	    		valores[x][5] = input.nextInt();
		    System.out.println("Qual o valor da bolsa na domingo?");
	    		valores[x][6] = input.nextInt();
	    		
	    	if (x == 3) {break;}
	    	else {System.out.println("------------------ PROXIMA SEMANA ------------------");}
	    }
	    System.out.println("------------------ A MATRIZ FICOU ------------------");
	    for(int linha = 0; linha < 4; linha++){
	        for(int coluna = 0; coluna < 7; coluna++){
	            System.out.printf("\t %d \t", valores[linha][coluna]);
	        }
	        System.out.println();
	     }
	    for(int x= 0; x < 4; x++) {
	    	soma = valores[x][0] + valores[x][1] + valores[x][2] + valores[x][3] + valores[x][4] + valores[x][5] + valores[x][6];
	    	some[x][0] = (soma / 7);
	    	
	    }
	    
	    System.out.println("------------------ MÉDIAS SEMANAIS ------------------");
	    
	    for(int linha = 0; linha < 4; linha++){
	        for(int coluna = 0; coluna < 1; coluna++){
	            System.out.printf("\t %d \t", some[linha][coluna]);
	        }
	    }
		
	    System.out.println("------------------ MÉDIAS MENSAL ------------------");
	    
	    int mensal = 0;
	    mensal = (some[0][0] + some[0][0] + some[0][0] + some[0][0]) / 4;
	    System.out.println(mensal);
	}	
}

	

