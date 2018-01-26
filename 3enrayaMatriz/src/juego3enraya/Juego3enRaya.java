/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego3enraya;

import java.util.Scanner;

/**
 *
 * @author johne
 */
public class Juego3enRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Juego");
        Scanner Teclado = new Scanner (System.in);
        String Mat [][] = new String [3][3];
        int cont = 1;
        for (int i=0 ; i<Mat.length;i++)
        {
              for (int j=0 ; j<Mat.length;j++)
        {
            Mat[i][j]=""+cont;
            cont++;
        }  
        }
      Imprimir(Mat);
      int comp=0;
      System.out.println("Ingrese el digito que desea ocupar en el juego Player 1 ");
      String Ply1=Teclado.nextLine();
       System.out.println("Ingrese el digito que desea ocupar en el juego Player 2 ");
      String Ply2=Teclado.nextLine();
      boolean Ban = false;
       while(Ban==false)
       {
        System.out.println("Player  1");
        System.out.println("Ingrese el valor de la matriz ");
        String Valor = Teclado.nextLine();
        Mat=Busqueda(Mat,Valor,Ply1);
        Imprimir(Mat);
        Ban=Comprobacion(Mat);
        System.out.println("Player  2");
        System.out.println("Ingrese el valor de la matriz ");
        Valor = Teclado.nextLine();
        Mat=Busqueda(Mat,Valor,Ply2);
        Imprimir(Mat);
        Ban=Comprobacion(Mat);
        Imprimir(Mat);
        Ban=Comprobacion(Mat);
       }

}
    public static void Imprimir(String[][] Mat) 
    {
      for (int i=0 ; i<Mat.length;i++)
        {
              for (int j=0 ; j<Mat.length;j++)
        {
            System.out.print(Mat[i][j]+",");
                    
        } 
              System.out.println(" ");
        }
        System.out.println("________________________________________");
    }
    public static boolean Comprobacion(String[][] Mat) 
    {
        for (int i =0;i<Mat.length;i++)
        {
               if (Mat[i][0]==Mat[i][1] && Mat[i][1] == Mat[i][2])
            {
                System.err.println("Gano el Jugador "+Mat[i][1]);
                return true;
            }  
               if (Mat[0][i]==Mat[1][i]&&Mat[1][i]==Mat[2][i])
            {
               System.err.println("Gano el Jugador " +Mat[1][i]);
                return true;
            }
             if(Mat[0][0] == Mat[1][1] && Mat[1][1]==Mat[2][2])
              {
                  System.out.println("Gano el Jugador "+ Mat[1][1]);
             return true;
           }
             if(Mat[0][2]==Mat[1][1]&& Mat[1][1]==Mat[2][0])
            {
                System.out.println("Gano el Jugador "+ Mat[1][1]);
              return true;
         }
               
      }
      return false;
    }


    public static String[][] Busqueda(String [] [] Mat,String Valor,String jugador)
{
   for (int i=0 ; i<Mat.length;i++)
        {
              for (int j=0 ; j<Mat.length;j++)
        {
            if (Mat[i][j].equals(Valor))
            {
                Mat[i][j]= jugador;
              
            }        
        }     
        }
   return Mat;
}
    
    }

