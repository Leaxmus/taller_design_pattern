


public class FactoryTarjetaPremium extends FactoryTarjeta {
    @Override
    public Tarjeta CrearTarjeta() {
        return new TarjetaPremium();
    }
}
