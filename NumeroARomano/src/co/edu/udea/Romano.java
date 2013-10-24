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
			/*if(entero==5 & entero<9){
				resultado="V";
				entero=entero-5;
			//	i=0;
			
				
				//refactor nros mayores a veinte
				/*while (i<entero)
				{
					resultado=resultado.concat("I");
					i++;
				}*/
			
	
			if(entero==4){
				entero=entero-4;
				resultado=resultado.concat("IV");
			}
			
			if(entero<4 & entero!=0)
			{
				entero--;
				resultado=resultado.concat("I");
		
				/*
				while (i<entero)
				{
					i++;
				}*/
			}
			
		
			//	Refactor 
		
			
		}
			/*
		//Refactor 
		if(entero==10)
		{	
		resultado="X";
		}*/
			
		//Refactor para las 2 primeras pruebas
		/*if(entero==1){
			resultado="I";	
		}
		else if(entero/2==1)
		{
			resultado="II";
		}*/
		
		//Refactor
		
		return resultado;
	}
}
