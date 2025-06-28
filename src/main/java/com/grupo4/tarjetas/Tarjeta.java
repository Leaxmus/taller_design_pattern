


public abstract class Tarjeta {
    protected int costo;
    protected int tarifa;
    protected double limite;

    public Tarjeta(int costo, int tarifa, double limite) {
        this.costo = costo;
        this.tarifa = tarifa;
        this.limite = limite;
    }
  
    public abstract boolean pago(double monto);

    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public int getTarifa() {
        return tarifa;
    }
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
