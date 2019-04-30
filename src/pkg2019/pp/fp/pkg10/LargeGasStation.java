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
public class LargeGasStation extends GasStation implements CoffeeService {

    private double coffeePrice;

    public LargeGasStation(String name, int vatNumber, double gasPrice, double coffeePrice) {
        super(name, vatNumber, gasPrice);
        this.coffeePrice = coffeePrice;
    }
    
    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        return (coffees * this.coffeePrice);
    }
    
    
    
}