/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author jrojasce
 */
public class division  {
    public division() throws xeception {
        this.dividir(0);
    }
    public void dividir(int x) throws xeception{
        int r=0;
       if (x==0){
           throw  new xeception("mal");
       }
       else {
          r=5/x;
       
       }
            
         
        }
}

