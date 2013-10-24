package co.edu.udea;

public class Romano {

	public String convertir(int entero){
		
		String resultado="";
		int i=0;
		
		
		//Refactor para numeros de 20 a 39
		while(entero!=0)
		{
			//	Refactor para numeros de 10 a 19
			if(entero>=10){
				resultado=resultado.concat("X");
				entero=entero-10;
			}
			//Refactor 
			if(entero==9)
			{	
				resultado=resultado.concat("IX");
				entero=entero-9;
			}
			
			if(entero>=5 & entero<9)
			{
				resultado=resultado.concat("V");
				entero=entero-5;
			}
				
			if(entero==4){
				entero=entero-4;
				resultado=resultado.concat("IV");
			}
			
			if(entero<4 & entero!=0)
			{
				entero--;
				resultado=resultado.concat("I");
			}
			
			
		}

		return resultado;
	}
}
