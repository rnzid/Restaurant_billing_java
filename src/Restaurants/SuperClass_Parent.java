/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rn zid
 */
public class SuperClass_Parent {
    public double ChickenBurger;
    public double VegBurger;
    public double CheeseBurgerMix;
    public double FiletFish;
    public double BuffBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClassicVanila;
    public double VanillaMilkShake;
    public double ChocolateMilkShake;
    
    
    public double Meal;
    public double Drinks;
    public double Total;
    
    public double AllTotal;
    public double GetAmount()
    {
        Meal= FiletFish+VegBurger+CheeseBurgerMix+ChickenBurger+BuffBurger;
        
        Drinks=MilkShake+ VanillaCone+ VanillaMilkShake+ ChocolateMilkShake;
        Total= Meal+ Drinks;
        AllTotal=Total;
        return AllTotal;
        
        
    }
    private JFrame frame;
    public void iExitSystem()
    {
        frame=new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","Resturant Billing System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    
    }
     
    //=======================price===============
    
     public double pChickenBurger = 150;
    public double pVegBurger = 100;
    public double pCheeseBurgerMix = 200;
    public double pFiletFish = 150;
    public double pBuffBurger = 120;
    
    public double pMilkShake = 60;
    public double pVanillaCone = 75;
    public double pClassicVanila = 75;
    public double pVanillaMilkShake = 90;
    public double pChocolateMilkShake =120;

    
    //===============================================
    
    public double Tax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount -(cAmount * Tax);
        return FindTax;
    }
    
  //===================================================================  
    
}
