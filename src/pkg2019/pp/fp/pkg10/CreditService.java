/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019.pp.fp.pkg10;

/**
 *
 * @author joaom
 */
public interface CreditService {
    
    public double getAnnualRate();
    
    public void setAnnualRate(double r);
    
    public double computeMonthlyPayment(double ammount, int months);
}
