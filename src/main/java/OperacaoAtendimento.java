/*
 ** created by: jorge.lessa
 */
public class OperacaoAtendimento implements ITipoOperacao{

    private static OperacaoAtendimento operacaoAtendimento = new OperacaoAtendimento();

    public OperacaoAtendimento() {
    }

    public static OperacaoAtendimento getOperacaoAtendimento() {
        return operacaoAtendimento;
    }
}
