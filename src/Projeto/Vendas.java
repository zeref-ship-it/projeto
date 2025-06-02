package Projeto;

public class Vendas {

    class Vendas {
        private double fatura;


        public Vendas(double fatura) {
            this.fatura = fatura;
        }

        public void registrarVenda() {
            System.out.println("Venda registrada com fatura de R$" + String.format("%.2f", this.fatura));
        }
    }
}
