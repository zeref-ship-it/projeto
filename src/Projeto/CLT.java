package Projeto;

public class CLT {

    class CLT extends Funcionario {
        private String nroCarteira;
        private double descontoINSS;

        public CLT(String nome, String cargo, double horasTrabalhadas, double valorHora, String dataCadastro, String nroCarteira) {
            super(nome, cargo, horasTrabalhadas, valorHora, dataCadastro);
            this.nroCarteira = nroCarteira;
        }

        public void calcularDescontoINSS() {
            this.descontoINSS = this.salarioBruto * 0.08;
        }

        @Override
        public void calcularDescontoTotal() {
            super.calcularDescontoTotal();
            calcularDescontoINSS();
            this.descontoTotal += this.descontoINSS;
        }


        @Override
        public void calcularSalario() {
            super.calcularSalario();
            System.out.println("  (CLT) INSS: R$" + String.format("%.2f", this.descontoINSS));
        }
    }

}
