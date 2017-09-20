package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {
		
		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("auragaiparek.com"));
		assertFalse(Validaciones.email("auraga.iparek."));
		assertFalse(Validaciones.email("auraga@"));
		assertFalse(Validaciones.email("auraga@iparekcom"));
		assertFalse(Validaciones.email("auraga@iparek.e"));
		
		
		
		assertTrue(Validaciones.email("auraga@iparek.com"));
		
		
	}
	
	public void testdni() {
		
	assertFalse(Validaciones.dni(null));
	assertFalse(Validaciones.dni(""));
	assertFalse(Validaciones.dni("2eee"));
	assertFalse(Validaciones.dni("1111111"));
	assertFalse(Validaciones.dni("1111111Y"));
	
	assertTrue(Validaciones.dni("11111111H"));
	
	
	
	}
}
