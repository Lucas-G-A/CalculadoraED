public class PruebasValidas {
	
	public static boolean esOperador(char c) {
	    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
	}
	
	public static boolean esParentesis(char c) {
	    return c == '(' || c == ')'; 
	}
	

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
	
	public static boolean parentesisNoConsecutivos(String cadena) {
	    for (int i = 0; i < cadena.length() - 1; i++) {
	        char actual = cadena.charAt(i);
	        char siguiente = cadena.charAt(i + 1);
	        if (actual == '(' && siguiente == ')' || actual == ')' && siguiente == '(') {
	            return false; 
	        }
	    }
	    return true; 
	}
	
	public static boolean verificarInicioYFin(String cadena) {
            char primero = cadena.charAt(0);
            char ultimo = cadena.charAt(cadena.length()-1);
		if(esOperador(primero))
                    return false;
		if(esOperador(ultimo))
                    return false;
                if (primero == '(' && cadena.length() > 1) {
		    char segundo = cadena.charAt(1);
		    if (segundo == '+'||segundo == '*'||segundo =='/'||segundo == '^') {
		        return false; 
		    }
		}
                if (ultimo == ')' && cadena.length() > 1) {
		    char penultimo = cadena.charAt(cadena.length()-2);
		    if (esOperador(penultimo)) {
		        return false; 
		    }
		}
            return true;
			
	}
	
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
