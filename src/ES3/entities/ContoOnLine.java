package ES3.entities;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

        public void stampaSaldo() {
            System.out.printin("Titolare: " + titolare + * -Saldo:" + saldo + " - Num movimenti:
            " + nMovimenti
                    + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
        }
            public void preleva ( double x){
                if (x <= maxPrelievo) {
                    super.preleva(x);
                }
            }
        }
