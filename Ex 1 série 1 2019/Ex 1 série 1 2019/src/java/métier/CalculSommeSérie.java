/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métier;

/**
 *
 * @author e-boudhina
 */
public final class CalculSommeSérie {
    int i;
    double s;
    
    //why do i need to set the constructor to public i though it was implicit
    
    public CalculSommeSérie(){
     i=0;
    s=0;
    
    }
    public CalculSommeSérie(int n){
    
        this.CalculeSomme(n);
    
    }

   

  
    
  
    
    public double CalculeSomme(int n){
        s=0;
        for( i = 1 ;i <= n ; i++ )
               {
                   s =  s+ 1./i;
                   
                   
               }
        return s;
       
    }
    
}
