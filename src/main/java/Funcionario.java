import java.util.ArrayList;

/*
 ** created by: jorge.lessa
 */
public abstract class Funcionario {

    protected ArrayList operacoes = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getCargo();

    public String realizarOperacao(Operacao operacao)
    {
        if (operacoes.contains(operacao.getTipoOperacao()))
        {
            return this.getCargo();
        }
        else if (funcionarioSuperior != null)
        {
            return funcionarioSuperior.realizarOperacao(operacao);
        }
        return "Operação nao pode ser ralizada";
    }

}
