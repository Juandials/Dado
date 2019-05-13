/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import logica.Dado;

/**
 *
 * @author Estudiantes
 */
public class Cliente {

    public void lanzamiento() {
        Dado a = new Dado();
        a.lanzamiento();
        Dado b = new Dado();
        b.lanzamiento();
        int f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f12=0;
        for (int i = 0; i < 1000; i++) {
            int s=a.lanzamiento()+b.lanzamiento();
            if(s==2){
                f2=f2+1;
            }
            if(s==3){
                f3=f3+1;
            }
            if(s==4){
                f4=f4+1;
            }
            if(s==5){
                f5=f5+1;
            }
            if(s==6){
                f6=f6+1;
            }
             if(s==7){
                f7=f7+1;
            }
              if(s==8){
                f8=f8+1;
            }
               if(s==9){
                f9=f9+1;
            }
                if(s==10){
                f10=f10+1;
            }
                 if(s==11){
                f11=f11+1;
            }
                  if(s==12){
                f12=f12+1;
            }
        }
        System.out.println("\nFrecuencia 2: "+f2+"\nFrecuencia 3: "+f3+"\nFrecuencia 4: "+f4+"\nFrecuencia 5: "+f5+"\nFrecuencia 6: "+f6+"\nFrecuencia 7: "+f7+"\nFrecuencia 8: "+f8+"\nFrecuencia 9: "+f9+"\nFrecuencia 10: "+f10+"\nFrecuencia 11: "+f11+"\nFrecuencia 12: "+f12);
        System.out.println("Suma: "+(f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12));
    }
}
