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
public class Demo {

    public static void main(String[] args) {
        
        LargeGasStation BP = new LargeGasStation("BP",123,1.435,0.65);
        BP.setGasPrice(1.437);
        System.out.println(BP.getGasPrice());
        System.out.println(BP.getGasTotal(40.67));
        System.out.println(BP.getCoffeePrice());
        System.out.println(BP.getCoffeeTotal(10));
    }
    
}
