/*
 ** created by: jorge.lessa
 */
public class Operacao {

    private ITipoOperacao tipoOperacao;

    public Operacao(ITipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public ITipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(ITipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
