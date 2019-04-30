package pkg2019.pp.fp.pkg10;

/**
 *
 * @author joaom
 */
public class GasStation extends Company implements GasService {

    private double gasPrice;

    public GasStation(String name, int vatNumber, double gasPrice) {
        super(name, vatNumber);
        this.gasPrice = gasPrice;
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
