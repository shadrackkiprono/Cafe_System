/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shadrack
 */
public class SuperClass_parent {
    public double Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double CheeseBurger;
    
    
    public double MilkShake;
    public double VanillaCone;
    public double ChocolateMilkShake;
    public double Youghurt;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    public double GetAmount()
    {
     Meals = Fish + ChickenBurger + ChickenLegend + CheeseBurger;
     Drinks = MilkShake + VanillaCone + ChocolateMilkShake + Youghurt;
     TotalofMD = Meals + Drinks;
     AllTotalofMD = TotalofMD;
     return AllTotalofMD;   
}
   private  JFrame frame;
   
   public void iExitSystem(){
       frame=new JFrame();
           if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Cafe System",
                JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
         System.exit(0);
           } 
       }
   //==================================Price================================================
    public double pFish =150.00;
    public double pChickenBurger =300.00;
    public double pChickenLegend =250.00;
    public double pCheeseBurger = 200.00;
    
    
    public double pMilkShake =100.00;
    public double pVanillaCone =150.00;
    public double pChocolateMilkShake =70.00;
    public double pYoughurt =70.00;
    //+==================================================
    public double mcTax = 0.16;
    public Double cFindTax(double cAmount)
    {
        double FindTax =  cAmount * mcTax;
        return FindTax;
    }
    //+==================================================
   }

       
       
        
    
