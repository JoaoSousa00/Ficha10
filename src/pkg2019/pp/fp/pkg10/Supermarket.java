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
public class Supermarket extends Company implements MarketService {
    
    private double potatoesPrice;

    public Supermarket(String name, int vatNumber, double potatoesPrice) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }
    
    
    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.potatoesPrice = p;
    }

    @Override
    public double getPotatoesTotal(double kilos) {
        return (kilos * this.potatoesPrice);
    }
    
}
