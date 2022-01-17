/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Informatica
 */
public class Cabaña {
    private String numeroDeCabaña;
    private int cantidadDeCamas,cantidadDeDias;
    private boolean todoIncluido;

    public Cabaña(String numeroDeCabaña, int cantidadDeCamas, int cantidadDeDias, boolean todoIncluido) {
        this.numeroDeCabaña = numeroDeCabaña;
        this.cantidadDeCamas = cantidadDeCamas;
        this.cantidadDeDias = cantidadDeDias;
        this.todoIncluido = todoIncluido;
    }

    public Cabaña() {
    }
    

    public String getNumeroDeCabaña() {
        return numeroDeCabaña;
    }

    public void setNumeroDeCabaña(String numeroDeCabaña) {
        this.numeroDeCabaña = numeroDeCabaña;
    }

    public int getCantidadDeCamas() {
        return cantidadDeCamas;
    }

    public void setCantidadDeCamas(int cantidadDeCamas) {
        this.cantidadDeCamas = cantidadDeCamas;
    }

    public int getCantidadDeDias() {
        return cantidadDeDias;
    }

    public void setCantidadDeDias(int cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }

    public boolean isTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(boolean todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

   

    public int valorDia(){
        if(todoIncluido==false)
       {
            if(cantidadDeCamas==1)
         return (int) (30000);
        
            if(cantidadDeCamas==2)
           return (int) (38000);
       
            if(cantidadDeCamas==3)
            return (int) (45000);
        
            if(cantidadDeCamas==4)
            return (int) (52000);
  
        return 0;         
    }else{
           if(cantidadDeCamas==1)
         return (int) (30000*1.55);
        
            if(cantidadDeCamas==2)
           return (int) (38000*1.55);
       
            if(cantidadDeCamas==3)
            return (int) (45000*1.55);
        
             if(cantidadDeCamas==4)
             return (int) (52000*1.55);
        
       }
        return 0;
       
    }
    
    public int totalAPagar(int valorDia){
        if(cantidadDeDias>0){
          return (int)(valorDia*cantidadDeDias);
        }
    return 0;
    }
}
