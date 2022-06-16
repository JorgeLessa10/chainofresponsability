import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class OperacaoTest {

    FuncionarioGerente gerente;
    FuncionarioCaixa caixa;
    FuncionarioVendedor vendedor;

    @BeforeEach
    void setUp()
    {
        gerente = new FuncionarioGerente(null);
        caixa = new FuncionarioCaixa(gerente);
        vendedor = new FuncionarioVendedor(gerente);
    }

    @Test
    void deveConcluirVendaPeloCaixa(){
        assertEquals("Caixa", caixa.realizarOperacao(new Operacao(OperacaoVenda.getOperacaoVenda())));
    }

    @Test
    void deveConcluirVendaPeloGerente(){
        assertEquals("Gerente", gerente.realizarOperacao(new Operacao(OperacaoVenda.getOperacaoVenda())));
    }

    @Test
    void naoDeveConcluirVendaPeloVendedorMasSimPeloGerente(){
        assertEquals("Gerente", vendedor.realizarOperacao(new Operacao(OperacaoVenda.getOperacaoVenda())));
    }


    @Test
    void deveConcluirLocacaoPeloCaixa(){
        assertEquals("Caixa", caixa.realizarOperacao(new Operacao(OperacaoLocacao.getOperacaoLocacao())));
    }

    @Test
    void deveConcluirLocacaoPeloGerente(){
        assertEquals("Gerente", gerente.realizarOperacao(new Operacao(OperacaoLocacao.getOperacaoLocacao())));
    }

    @Test
    void naoDeveConcluirLocacaoPeloVendedorMasSimPeloGerente(){
        assertEquals("Gerente", vendedor.realizarOperacao(new Operacao(OperacaoLocacao.getOperacaoLocacao())));
    }

    @Test
    void deveConcluirCompraPeloGerente(){
        assertEquals("Gerente", gerente.realizarOperacao(new Operacao(OperacaoCompra.getOperacaoCompra())));
    }

    @Test
    void naoDeveConcluirCompraPeloCaixaMasSimPeloGerente(){
        assertEquals("Gerente", caixa.realizarOperacao(new Operacao(OperacaoCompra.getOperacaoCompra())));
    }

    @Test
    void naoDeveConcluirCompraPeloVendedorMasSimPeloGerente(){
        assertEquals("Gerente", vendedor.realizarOperacao(new Operacao(OperacaoCompra.getOperacaoCompra())));
    }

    @Test
    void deveConcluirAtendimentoPeloVendedor(){
        assertEquals("Vendedor", vendedor.realizarOperacao(new Operacao(OperacaoAtendimento.getOperacaoAtendimento())));
    }

    @Test
    void naoDeveConcluirAtendimentoPeloCaixa(){
        //Atendimento só pode ser realizado pelo vendedor;
        assertEquals("Operação nao pode ser ralizada", caixa.realizarOperacao(new Operacao(OperacaoAtendimento.getOperacaoAtendimento())));
    }

    @Test
    void naoDeveConcluirAtendimentoPeloGerente(){
        //Atendimento só pode ser realizado pelo vendedor;
        assertEquals("Operação nao pode ser ralizada", gerente.realizarOperacao(new Operacao(OperacaoAtendimento.getOperacaoAtendimento())));
    }




}