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
public class Company {
    
    /**
     * Nome da empresa
     */
    private String name;
    
    /**
     * Número de contribuinte
     */
    private int vatNumber;

    
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vatNumber
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * @param vatNumber the vatNumber to set
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }
    
    
}
