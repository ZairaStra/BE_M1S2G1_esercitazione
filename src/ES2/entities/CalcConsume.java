package ES2.entities;

public class CalcConsume {
    //ATTRIBUTI
    private double kmRun;
    private double fuelConsume;


    //CISTRUTTORI
    public CalcConsume(double kmRun, double fuelConsume) {
        this.kmRun = kmRun;
        this.fuelConsume = fuelConsume;
    }

    //METODI

    public double kmPerLiter() throws ArithmeticException {
        if (fuelConsume == 0) {
            throw new ArithmeticException("Complimenti, sei appena diventato l'uomo più ricco del mondo");
        }
        return kmRun / fuelConsume;
    }
}