package ES3.entities;

import ES3.exceptions.BancaException;

public class ContoCorrente {
        private String titolare;
        private int nMovimenti;
        private final int maxMovimenti = 50;
        private double saldo;

        public ContoCorrente(String titolare, double saldo) {
            this.titolare = titolare;
            this.saldo = saldo;
            this.nMovimenti = 0;

            public void preleva(double x) throws BancaException {
//                if (nMovimenti < maxMovimenti) saldo = saldo - x;
//                else saldo = saldo - x - 0.50;
                double nuovoSaldo = saldo - x;
                nMovimenti++;

                if (nuovoSaldo < 0) {
                    throw new BancaException("Non hai più denaro");
                }

                if (nMovimenti > maxMovimenti) {
                    saldo = nuovoSaldo - 0.50;
                } else {
                    saldo = nuovoSaldo;
                }

                public double restituisciSaldo () {
                    return saldo;

                }
            }