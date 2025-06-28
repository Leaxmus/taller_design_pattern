


public class FactoryTarjetaBasica extends FactoryTarjeta {
    @Override
    public Tarjeta CrearTarjeta() {
        return new TarjetaBasica();
    }
}
