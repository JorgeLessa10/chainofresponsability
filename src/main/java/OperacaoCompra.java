public class OperacaoCompra implements ITipoOperacao{

    private static OperacaoCompra operacaoCompra = new OperacaoCompra();

    public OperacaoCompra() {
    }

    public static OperacaoCompra getOperacaoCompra() {
        return operacaoCompra;
    }
}
