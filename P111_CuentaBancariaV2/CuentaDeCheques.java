package P111_CuentaBancariaV2;

public class CuentaDeCheques extends CuentaBancaria {
    private double Sobregiro;

    public CuentaDeCheques(double cantidad, double sobregiro) {
        super(cantidad);
        Sobregiro = sobregiro;
    }

    @Override
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad)
            Saldo -= cantidad;
        else {
            double requerida = cantidad - Saldo;
            if (Sobregiro >= requerida) {
                Saldo = 0;
                Sobregiro -= requerida;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuentaDeCheques [ " + super.toString() + ", Sobregiro = " + Sobregiro + " ]";
    }
}