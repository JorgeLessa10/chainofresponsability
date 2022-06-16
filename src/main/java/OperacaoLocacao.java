public class OperacaoLocacao implements ITipoOperacao{

    private static OperacaoLocacao operacaoLocacao = new OperacaoLocacao();

    public OperacaoLocacao() {
    }

    public static OperacaoLocacao getOperacaoLocacao() {
        return operacaoLocacao;
    }
}
