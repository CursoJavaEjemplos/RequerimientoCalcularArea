package app;
import java.util.Scanner;

public class Calcular {
    /**
     */
    private static int n = 3;
    private static Area[] referenciaObjetosArea = null; //Mi relación 
    private static Float base = null;
    private static Float altura = null;  
    private static Float r = null;     
    public Calcular() {
       // super();
        ///tyfytfy
        //gggggg
    }

    public static void main(String[] args) {
        //Calcular calcular = new Calcular();
        
        referenciaObjetosArea = new Area[n]; //crear n referencias
        
        Scanner t = new Scanner(System.in);
        
        for(int i=0; i < n; i ++) {
          
          referenciaObjetosArea[i] = new Area(); //Crear n objetos del tipo Area{}
            
          System.out.println("Entrar la base para el rectangulo " + i);  
          base = t.nextFloat();
          System.out.println("Entrar la altura para el rectangulo " + i);   
          altura = t.nextFloat(); 
            
          referenciaObjetosArea[i].setAltura(altura);
          referenciaObjetosArea[i].setBase(base);
        }
       
        for(int i=0; i < n; i ++) {
          System.out.println("Rectángulo " + i); 
          r = referenciaObjetosArea[i].getResultadoArea();
          if(referenciaObjetosArea[i].esMayor(789.5f)==true) {
            System.out.println("  Área = " + r + " - Ha superado el valor permitido");    
          }else{
            System.out.println("  Área = " + r);    
          }
        }    
    }
}
