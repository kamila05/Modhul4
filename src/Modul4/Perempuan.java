/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author Lenovo
 */
public class Perempuan extends Manusia {
  //constrcutor
    public Perempuan (double TB)
    {
        super(TB);
    }
    //Method HtgBBI merupakan method overidding dari superclass nya
    public final double HtgBBI()
    {
        return (super.getTB()-100)*0.8;
  
    }
    
}