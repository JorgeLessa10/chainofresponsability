/*
 ** created by: jorge.lessa
 */
public class FuncionarioCaixa extends Funcionario{

    public FuncionarioCaixa(Funcionario funcionario)
    {
        operacoes.add(OperacaoVenda.getOperacaoVenda());
        operacoes.add(OperacaoLocacao.getOperacaoLocacao());
        setFuncionarioSuperior(funcionario);
    }

    @Override
    public String getCargo() {
        return "Caixa";
    }
}
