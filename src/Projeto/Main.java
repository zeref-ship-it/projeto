package Projeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Calculando Pagamentos ---");


        Funcionario funcCLT = new CLT("Maria Silva", "Analista", 160, 50.0, "2023-01-15", "123.456.78-9");
        Funcionario funcNaoCLT = new NaoCLT("João Souza", "Desenvolvedor", 120, 70.0, "2024-03-01", "98.765.432/0001-10");
        Funcionario funcGenerico = new Funcionario("Pedro Santos", "Assistente", 100, 30.0, "2022-06-20");


        Fornecedor fornEnergia = new Fornecedor("Companhia de Eletricidade", "11.222.333/0001-44", "Luz SA", 500.0, "2021-05-10");
        Fornecedor fornInternet = new Fornecedor("Provedor de Internet", "44.555.666/0001-77", "Conecta LTDA", 150.0, "2020-08-01");


        Servicos servManutencao = new Servicos("Manutenção Predial", 800.0, "2025-01-01");
        Servicos servConsultoria = new Servicos("Consultoria de TI", 1200.0, "2024-11-01");



        Pagamento[] pagaveis = {funcCLT, funcNaoCLT, funcGenerico, fornEnergia, fornInternet, servManutencao, servConsultoria};


        for (Pagamento pagavel : pagaveis) {
            pagavel.calcularSalario();
            System.out.println("------------------------------------");
        }


        Vendas venda1 = new Vendas(1500.0);
        venda1.registrarVenda();
    }
}