package Projeto;

public class Servicos {

    class Servicos implements Pagamento {
        protected String nome;
        protected String dataCadastro;
        protected String dataAlteracao;
        protected String dataCalculo;

        private double salarioBruto;
        private double horasTrabalhadas;
        protected double descontoIR;
        protected double descontoTotal;
        protected double descontoISS;
        protected double descontoINSS;

        public Servicos(String nome, double salarioBruto, String dataCadastro) {
            this.nome = nome;
            this.dataCadastro = dataCadastro;
            this.salarioBruto = salarioBruto;
        }


        public void calcularDescontoIR() {
            this.descontoIR = this.salarioBruto * 0.05;
        }


        public void calcularDescontoISS() {
            this.descontoISS = this.salarioBruto * 0.03;
        }


        public void calcularDescontoINSS() {
            this.descontoINSS = this.salarioBruto * 0.02;
        }


        public void calcularDescontosServicos() {
            calcularDescontoIR();
            calcularDescontoISS();
            calcularDescontoINSS();
            this.descontoTotal = this.descontoIR + this.descontoISS + this.descontoINSS;
        }

        
        public void calcularSalario() {
            calcularDescontosServicos();
            double valorLiquido = this.salarioBruto - this.descontoTotal;
            System.out.println("Pagamento de Serviço (" + this.nome + "): R$" + String.format("%.2f", valorLiquido) +
                    " (Bruto: R$" + String.format("%.2f", this.salarioBruto) + ", Descontos: R$" + String.format("%.2f", this.descontoTotal) + ")");
        }
    }
}
