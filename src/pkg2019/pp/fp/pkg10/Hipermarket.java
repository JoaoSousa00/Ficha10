package pkg2019.pp.fp.pkg10;

/**
 *
 * @author joaom
 */
public class Hipermarket extends Supermarket implements HipermarketService{
    
    private double coffeePrice;
    
    private double annualRate;
    
    private double gasPrice;

    public Hipermarket(String name, int vatNumber, double potatoesPrice, 
            double coffeePrice, double annualRate, double gasPrice) {
        super(name, vatNumber, potatoesPrice);
        this.coffeePrice = coffeePrice;
        this.annualRate = annualRate;
        this.gasPrice = gasPrice;
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
    
    
    @Override
    public double getAnnualRate() {
        return this.annualRate;
    }

    @Override
    public void setAnnualRate(double r) {
        this.annualRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        return(ammount / months);
    } 
    
    
    @Override
    public double getGasPrice() {
        return this.gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        this.gasPrice = p;
    }

    @Override
    public double getGasTotal(double litros) {
        return (litros*this.gasPrice);
    } 
}
