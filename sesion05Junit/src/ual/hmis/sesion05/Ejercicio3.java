package ual.hmis.sesion05;

public class Ejercicio3 {

    /**
     * Enmascara una contraseña.
     *
     * @param password contraseña a enmascarar
     * @return la contraseña enmascarada
     */
    public String enmascararPassword(String password) {
        int longitud = password.length();

        if (longitud < 5) {
            return "password demasiado corto";
        } else if (longitud <= 8) {
            return "********";
        } else if (longitud <= 40) { // entre 8 y 12 no se especifica en el enunciado y yo he puesto que devuelva 12 *
            return "************";
        } else {
            return "password demasiado largo";
        }
    }
}
