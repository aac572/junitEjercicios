package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({
		"user,Pass1,true",
		"OtroUser, Pass1, false",
		"user,pass1,false",
		"user,PASS1,false",
		"user,Pass,false",
		"'',pass,false",
		"user,'',false",
		"nombredeusuariossuperlagruisimomayorde30caraceteres,pass,false",
		"user,unsuperpasswordlarguisimoconmasde30caracteresgigantedelto,false",
 		"user,passwordincorrect,false",
		"usuario,pass,false"
	})
	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale {2}")
	void testLogin_parametrized(String username, String password, String result) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		// Assert
		assertEquals(Boolean.parseBoolean(result), e2.login(username, password));
	}
	
}
