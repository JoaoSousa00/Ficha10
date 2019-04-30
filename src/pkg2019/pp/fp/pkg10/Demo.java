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
        
        GasStation BP = new GasStation("BP",123,1.435);
        BP.setGasPrice(1.436);
        System.out.println(BP.getGasPrice());
        System.out.println(BP.getGasTotal(43.67));
    }
    
}
