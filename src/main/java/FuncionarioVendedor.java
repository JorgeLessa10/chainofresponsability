/*
 ** created by: jorge.lessa
 */
public class FuncionarioVendedor extends Funcionario{

    public FuncionarioVendedor(Funcionario funcionario)
    {
        operacoes.add(OperacaoAtendimento.getOperacaoAtendimento());
        setFuncionarioSuperior(funcionario);
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }
}
