/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucasgarcia
 */
public class PilaA <T> implements PilaADT<T>{
    private T[] datos;
    private int tope;
    private final int MAX=50;
    
    public PilaA(){
        datos= (T[]) new Object[MAX];
        tope=-1;
    }
    public PilaA(int max){
        datos= (T[]) new Object[max];
        tope=-1;
    }

    @Override
    public void push(T dato) {
        if(tope+1==datos.length){
            expande();
        }
        tope++;
        datos[tope]=dato;
    }
    private void expande(){
        T[] masGrande = (T[]) new Object[datos.length*2];
        
        for(int i=0; i<=tope;i++){
            masGrande[i] = datos[i];
        }
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("La pila está vacía");
        }
        T res=datos[tope];
        datos[tope]=null;
        tope--;
        return res;
    }

    @Override
    public boolean isEmpty() {
        return tope<0;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException("La pila está vacía");
        }
        return datos[tope];
    }
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        for(int i=0; i<=tope;i++){
            cad.append(datos[i] + " ");
        }
        return cad.toString();
    }
}

