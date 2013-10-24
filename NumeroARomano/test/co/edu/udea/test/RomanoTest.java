package co.edu.udea.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.Romano;

public class RomanoTest {

	@Test
	public void testNroUno(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(1);
		assertEquals("I", nroRomano);
		
	}
	
	@Test
	public void testNroDos(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(2);
		assertEquals("II", nroRomano);
		
	}

	@Test
	public void testNroTres(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(3);
		assertEquals("III", nroRomano);
		
	}
	
	
	@Test
	public void testNroCuatro(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(4);
		assertEquals("IV", nroRomano);
		
	}

	@Test
	public void testNroCinco(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(5);
		assertEquals("V", nroRomano);
		
	}
	@Test
	public void testNroSeis(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(6);
		assertEquals("VI", nroRomano);
		
	}
	
	@Test
	public void testNroSiete(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(7);
		assertEquals("VII", nroRomano);
		
	}
	
	@Test
	public void testNroOcho(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(8);
		assertEquals("VIII", nroRomano);
		
	}
	
	@Test
	public void testNroNueve(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(9);
		assertEquals("IX", nroRomano);
		
	}
	
	@Test
	public void testNroDiez(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(10);
		assertEquals("X", nroRomano);
		
	}
	
	@Test
	public void testNroOnce(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(11);
		assertEquals("XI", nroRomano);
		
	}
	
	@Test
	public void testNroTrece(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(13);
		assertEquals("XIII", nroRomano);
		
	}
	
	@Test
	public void testNroDiecinueve(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(19);
		assertEquals("XIX", nroRomano);
		
	}
	
	@Test
	public void testNroCatorce(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(14);
		assertEquals("XIV", nroRomano);
		
	}
	
	@Test
	public void testNroVeinte(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(20);
		assertEquals("XX", nroRomano);
		
	}
	
	@Test
	public void testNroVeinteyCinco(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(25);
		assertEquals("XXV", nroRomano);
		
	}
	
	@Test
	public void testNroTrentayCuatro(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(34);
		assertEquals("XXXIV", nroRomano);
		
	}
	
	@Test
	public void testNroCuarenta(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(40);
		assertEquals("XL", nroRomano);
		
	}
	
	@Test
	public void testNroCuarentaYCinco(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(45);
		assertEquals("XLV", nroRomano);
		
	}
	
	@Test
	public void testNroCincuenta(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(50);
		assertEquals("L", nroRomano);
		
	}
	@Test
	public void testNroSetentaYCuatro(){
		Romano romano = new Romano();
		String nroRomano = romano.convertir(74);
		assertEquals("LXXIV", nroRomano);
		
	}
	
	
	
	
	
}
