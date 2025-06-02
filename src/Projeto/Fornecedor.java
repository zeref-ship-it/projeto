package Projeto;

public class Fornecedor {

    class Fornecedor implements Pagamento {
        protected String nome; 
        protected String dataCadastro;
        protected String dataAlteracao;
        protected String dataCalculo;

        private String cnpj;
        private String nomeEmpresa;
        private double salario;


        public Fornecedor(String nome, String cnpj, String nomeEmpresa, double valorServico, String dataCadastro) {
            this.nome = nome;
            this.dataCadastro = dataCadastro;
            this.cnpj = cnpj;
            this.nomeEmpresa = nomeEmpresa;
            this.salario = valorServico;
        }


        
        public void calcularSalario() {
            System.out.println("Pagamento ao Fornecedor " + this.nomeEmpresa + " (CNPJ: " + this.cnpj + "): R$" + String.format("%.2f", this.salario));
        }
    }
}
