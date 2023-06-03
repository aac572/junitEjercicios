package ual.hmis.sesion05;

public class Ejercicio2 {
    /**
     * Comprueba el inicio de sesión de un usuario.
     *
     * @param username nombre de usuario
     * @param password contraseña del usuario
     * @return true si el inicio de sesión es exitoso, false de lo contrario
     */
    public boolean login(String username, String password) {
        if (username == null || password == null)
            return false;
        
        // Comprobar que sean distintos de vacío
        if (username.isEmpty() || password.isEmpty())
            return false;
        
        // Comprobar que la longitud sea < 30
        if (username.length() >= 30 || password.length() >= 30)
            return false;
        
        // Comprobar si hay mayúscula, minúscula y dígito
        boolean mayus = false, minus = false, digit = false;
        for (Character c : password.toCharArray()) {
            if (Character.isDigit(c))
                digit = true;
            if (Character.isLowerCase(c))
                minus = true;
            if (Character.isUpperCase(c))
                mayus = true;
        }
        if (!mayus || !minus || !digit)
            return false;
        
        // Llamar al método de la base de datos
        return compruebaLoginEnBD(username, password);
    }

    /**
     * Comprueba el inicio de sesión de un usuario en la base de datos.
     *
     * @param username nombre de usuario
     * @param password contraseña del usuario
     * @return true si el inicio de sesión es exitoso, false de lo contrario
     */
    public boolean compruebaLoginEnBD(String username, String password) {
        // Método mock (simulado)
        if (username.equals("user") && password.equals("Pass1"))
            return true;
        else
            return false;
    }
}
