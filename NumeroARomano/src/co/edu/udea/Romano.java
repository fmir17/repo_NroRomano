package co.edu.udea;

public class Romano {

	public String convertir(int entero){
		
		String resultado="";
		String[] simbolos = {"M","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] valores ={1000,500,400,100,90,50,40,10,9,5,4,1};
		
		int i=0;
		
		//Limite del algoritmo. enteros positivos menores de 4000
		if(entero>=1 & entero<4000){
		
		//Se evalua cada uno de los simbolos
		while(entero!=0){
			
			//Se evalua cuantas veces se repite el simbolo, y se va descontando el valor del entero. 
			while(entero>=valores[i])
			{
				resultado=resultado.concat(simbolos[i]);
				entero=entero-valores[i];
			}
			i++;
			
		}
		}
	return resultado;
	}
}
