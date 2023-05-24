package ual.hmis.sesion05;

public class Ejercicio2 {
	public boolean login (String username, String password){
		if (username==null||password==null) return false;
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30)
			return false;

		// comprobar si hay mayuscula, minuscula y digito
		boolean mayus=false, minus=false, digit=false;
		for (Character c : password.toCharArray()) {
			if (Character.isDigit(c))digit=true;
			if (Character.isLowerCase(c))minus=true;
			if (Character.isUpperCase(c))mayus=true;
		}
		if (!mayus||!minus||!digit) return false;
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD
	(String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("Pass1"))
			return true;
		else
			return false;
	}
}
