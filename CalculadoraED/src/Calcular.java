
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucasgarcia
 */
public class Calcular {
    /**
     * <pre> 
     * Esta clase pasa una cadena de una operación a notación postfija en una 
     * lista de tipo String. Luego calcula esta lista al resultado de la operación.
     * </pre> 
     */
    
    /**
     * @param cadena de una operación
     * @return lista de Strings en notación postfija
     */
    public static ArrayList<String> pasarALista(String cad){ //igual y la lista tiene que ser un parametro
        PilaA<Character> pila = new PilaA<Character>();
        ArrayList<String> lista = new ArrayList<String>();
        char a;
        String num="";
        boolean numActivo=false,neg=false;
        
        for(int i=0; i<cad.length();i++){
            a=cad.charAt(i);
            neg=false;
            if(a!='(' && a!='+' && a!='-' && a!='*' && a!='/' && a!='^' && a!=')'){
                num=num+a;
                numActivo=true;
            }
            else{
                if(numActivo){
                    lista.add(num);
                    num="";
                    numActivo=false;
                    neg=false;
                }
                else{
                    if(a=='-'){
                        neg=true;
                        num=num+a; 
                    }
                }
                if(a=='('){
                    pila.push(a);
                }
                else{
                    if(a==')'){
                        while(!pila.isEmpty() && pila.peek()!='('){
                            lista.add(Character.toString(pila.pop()));
                        }
                        pila.pop();
                    }
                    else{
                        if(!neg){
                            while(!pila.isEmpty() && compararOp(a, pila.peek())<=0){
                                lista.add(Character.toString(pila.pop()));
                            }
                                
                            pila.push(a);
                        }
                    }
                }
            }
        }
        if(numActivo)
            lista.add(num);
        while(!pila.isEmpty()){
            lista.add(Character.toString(pila.pop()));
        }
        return lista;
    }
    
    /**
     * Un compareTo de operadores
     * @param c1 operador
     * @param c2 operador
     * @return int <ul>
     * <li> positivo si c1 es más importante que c2
     * <li> cero si c1 tiene la misma importancia que c2
     * <li> negativo si c1 es menos importante que c2
     * </ul>
     */
    
    private static int compararOp(char c1, char c2){
        int res,ci1, ci2;
        
        ci1=asignarNumAChar(c1);
        ci2=asignarNumAChar(c2);
        
        if(ci1==ci2){
            res=0;
        }
        else{
            if(ci1>ci2){
                res=1;
            }
            else{
                res=-1;
            }
        }
        return res;
    }
    
    /**
     * Entero representando valor del operador
     * @param c operador
     * @return int <ul>
     * <li> 0 para parentesis
     * <li> 1 para suma o resta
     * <li> 2 para multiplicar y dividir
     * <li> 3 para exponente
     * </ul>
     */
    private static int asignarNumAChar(char c){
        int res;
        
        if(c=='('){
            res=0;
        }
        else{
            if(c=='^'){
                res=3;
            }
            else{
                if(c=='*' || c=='/'){
                    res=2;
                }
                else
                    res=1;
            }
        }
        return res;
    }
    /**
     * Calcula el resultado de una lista de notación postfija
     * @param lista postfija
     * @return resultado de la expresión
     */
    public static double calcular(ArrayList<String> lista){
        double prim,seg,res,c;
        PilaA<Double> pila = new PilaA<Double>();
        
        for(int i=0; i<lista.size();i++){
            try{
                c=Double.parseDouble(lista.get(i));
                pila.push(c);
            }
            catch(NumberFormatException e){
                if(lista.get(i).equals("^")){
                    seg=pila.pop();
                    prim=pila.pop();
                    res=Math.pow(prim, seg);
                    pila.push(res);
                }
                else{
                    seg=pila.pop();
                    prim=pila.pop();
                    if(lista.get(i).equals("*")){
                        res=prim*seg;
                    }
                    else{
                        if(lista.get(i).equals("/")){
                            res=prim/seg; //seg no puede ser 0, CHECAR
                        }
                        else{
                            if(lista.get(i).equals("+")){
                                res=prim+seg;
                            }
                            else{
                                res=prim-seg;
                            }
                        }
                        //pila.push(res);
                    }
                    pila.push(res);
                }
            }
        }
        return pila.pop();
    }
}
