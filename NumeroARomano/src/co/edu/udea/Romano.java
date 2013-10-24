package co.edu.udea;

public class Romano {

	public String convertir(int entero){
		
		String resultado="";
		String[] simbolos = {"C","XC","L","XL","X","IX","V","IV","I"};
		int[] valores ={100,90,50,40,10,9,5,4,1};
		
		int i=0;
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
	return resultado;
	}
}
