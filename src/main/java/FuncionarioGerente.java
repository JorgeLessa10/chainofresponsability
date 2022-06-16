/*
 ** created by: jorge.lessa
 */
public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(Funcionario funcionario)
    {
        operacoes.add(OperacaoCompra.getOperacaoCompra());
        operacoes.add(OperacaoVenda.getOperacaoVenda());
        operacoes.add(OperacaoLocacao.getOperacaoLocacao());
        setFuncionarioSuperior(null);
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
