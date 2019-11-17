/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;


import métier.CalculSommeSérie;

/**
 *
 * @author e-boudhina
 */
public class Série  {
    
   private Double s;
   private Integer n;
  
   
    public Série()
    { 
       
        s=0.0;
        n=0;
    }

    
    public int getN() {
    
        return n;
    
    }

    public void setN(Integer i) {
        
        this.n = i;
    
    }
    

    public Double getS() {
    
        return s;
    
    }
    
    public void setS(Double d) {
        
        this.s = d;
        
    }
    
    
            
    
}
