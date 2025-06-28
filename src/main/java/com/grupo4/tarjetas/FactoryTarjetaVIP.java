


public class FactoryTarjetaVIP extends FactoryTarjeta {
    @Override
    public Tarjeta CrearTarjeta() {
        return new TarjetaVIP();
    }
}
