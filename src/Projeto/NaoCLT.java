package Projeto;

public class NaoCLT {

    class NaoCLT extends Funcionario {
        private String cnpj;
        private double razaoSocial;
        private double descontoISS;

        public NaoCLT(String nome, String cargo, double horasTrabalhadas, double valorHora, String dataCadastro, String cnpj) {
            super(nome, cargo, horasTrabalhadas, valorHora, dataCadastro);
            this.cnpj = cnpj;
            this.razaoSocial = 0.05;
        }


        public void calcularDescontoISS() {
            this.descontoISS = this.salarioBruto * this.razaoSocial;
        }


        
        public void calcularDescontoTotal() {
            super.calcularDescontoTotal();
            calcularDescontoISS();
            this.descontoTotal += this.descontoISS;
        }


      
        public void calcularSalario() {
            super.calcularSalario();
            System.out.println("  (Não CLT) ISS: R$" + String.format("%.2f", this.descontoISS));
        }
    }

}
