/*
 ** created by: jorge.lessa
 */
public class OperacaoVenda implements ITipoOperacao{

    private static OperacaoVenda operacaoVenda = new OperacaoVenda();

    public OperacaoVenda() {
    }

    public static OperacaoVenda getOperacaoVenda() {
        return operacaoVenda;
    }
}
