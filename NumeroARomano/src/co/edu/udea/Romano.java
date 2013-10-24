package co.edu.udea;

public class Romano {

	public String convertir(int entero){
		
		String resultado="";
		

		while(entero!=0)
		{
			if(entero>=50){
				resultado=resultado.concat("L");
				entero=entero-50;
			}
			
			if(entero>=40 & entero <=49){
				resultado=resultado.concat("XL");
				entero=entero-40;
			}
			
			if(entero>=10 & entero <40){
				resultado=resultado.concat("X");
				entero=entero-10;
			}

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
