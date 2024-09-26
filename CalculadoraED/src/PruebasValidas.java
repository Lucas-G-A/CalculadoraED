/**
 *
 * @author eliasKalby
 * Clase para probar que una expresion matematica es valida
 */
public class PruebasValidas {
	/**
        * <pre> 
        * Esta clase verifica que la expresión que se le ha dado a la calculadora
        * sea válida y se pueda evaluar, checando muchos errores posibles
        * </pre> 
        */
    
    /**
     * @param char de un elemento en el String para verificar si es un operador
     * @return boolean <ul> 
     * <li> true si es operador 
     * <li> false si no lo es
     * </ul>
     */
	private static boolean esOperador(char c) {
	    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
	}
     /**
     * @param char de un elemento en el String para verificar si es un paréntesis
     * @return boolean <ul>
     * <li>true si es paréntesis 
     * <li>false si no es parentesis
     * </ul>
     */
	private static boolean esParentesis(char c) {
	    return c == '(' || c == ')'; 
	}
	
     /**
     * @param cadena de la operación
     * @return Boolean <ul>
     * <li>true si sus parentesis están balanceados 
     * <li>false si sus paréntesis no están balanceados
     * </ul>
     */
	public static boolean parentesisBalanceados(String cadena) {
            PilaA<Character> pila = new PilaA<>();
            if(cadena.length()>0) {
		for(int i=0; i<cadena.length(); i++) {
                    if(cadena.charAt(i)=='(') {
			pila.push('(');
                    }
                    else if(cadena.charAt(i)==')'){ 
			if(!pila.isEmpty()) {
                            pila.pop();
			} 
                        else 
                            return false;
			}
                }
            }
		return pila.isEmpty();
	}
     /**
     * @param cadena de la operación
     * @return Boolean <ul>
     * <li>true si no tiene paréntesis consecutivos 
     * <li>false si tiene paréntesis consecutivos
     * </ul>
     */
	public static boolean parentesisNoConsecutivos(String cadena) {
	    char actual;
            char siguiente;
            
            for (int i = 0; i < cadena.length() - 1; i++) {
	        actual = cadena.charAt(i);
	        siguiente = cadena.charAt(i + 1);
	        if (actual == '(' && siguiente == ')' || actual == ')' && siguiente == '(') {
	            return false; 
	        }
	    }
	    return true; 
	}
     /**
     * @param cadena de la operación
     * @return Boolean <ul>
     * <li>true si la operación no empieza ni acaba con un operador
     * <li>false si la operación empieza o acaba con un operador
     * </ul>
     */
	public static boolean verificarInicioYFin(String cadena) {
            char primero = cadena.charAt(0);
            char ultimo = cadena.charAt(cadena.length()-1);
            char segundo;
            char penultimo;
            
            if(esOperador(primero))
                return false;
            if(esOperador(ultimo))
                return false;
            if (primero == '(' && cadena.length() > 1) {
		segundo = cadena.charAt(1);
		if (segundo == '+'||segundo == '*'||segundo =='/'||segundo == '^') {
		    return false; 
		}
            }
            if (ultimo == ')' && cadena.length() > 1) {
		penultimo = cadena.charAt(cadena.length()-2);
		if (esOperador(penultimo)) {
		    return false; 
		}
            }
        return true;		
	}
     /**
     * @param cadena de la operación
     * @return Boolean <ul>
     * <li>True si todos los métodos anteriores regresan true y no hay operadores consecutivos 
     * <li>false si algun método anterior regresa false o si hay operadores juntos el la expresión
     * </ul>
     */
	public static boolean operadoresJuntos(String cadena) {
            char actual, siguiente, siguienteX2;
            if(!parentesisBalanceados(cadena) || !parentesisNoConsecutivos(cadena) || !verificarInicioYFin(cadena)) {
		return false;
            }
            for(int i=1; i<cadena.length()-3; i++) {
		actual = cadena.charAt(i);
		siguiente = cadena.charAt(i+1);
		siguienteX2 = cadena.charAt(i+2);
		if(esOperador(actual) && esOperador(siguiente)) {
                    return false;
				}
		if(esOperador(actual) && esParentesis(siguiente)) {
                    if(siguienteX2 == '+'||siguienteX2 == '*'||siguienteX2 =='/'||siguienteX2 == '^') {
			return false;
                    }
		}
            }
            return true;
	}
}
