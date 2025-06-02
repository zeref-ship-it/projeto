package Projeto;

public class Funcionario

class Funcionario implements Pagamento {
    protected String nome;
    protected String cargo;
    protected double horasTrabalhadas;
    protected double valorHora;
    protected double descontoIR;
    protected double descontoTotal;
    protected double salarioBruto;
    protected double salarioLiquido;
    protected String dataCadastro;
    protected String dataAlteracao;
    protected String dataCalculo;


    public Funcionario(String nome, String cargo, double horasTrabalhadas, double valorHora, String dataCadastro) {
        this.nome = nome;
        this.cargo = cargo;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.dataCadastro = dataCadastro;
    }


    public void calcularSalarioBruto() {
        this.salarioBruto = this.horasTrabalhadas * this.valorHora;
    }


    public void calcularDescontoIR() {
        this.descontoIR = this.salarioBruto * 0.10; 
    }

    public void calcularDescontoTotal() {
        this.descontoTotal = this.descontoIR; 
    }


    public void calcularSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - this.descontoTotal;
    }


  
    public void calcularSalario() {
        calcularSalarioBruto();
        calcularDescontoIR();
        calcularDescontoTotal();
        calcularSalarioLiquido();
        System.out.println("Salário do Funcionário " + this.nome + ": R$" + String.format("%.2f", this.salarioLiquido));
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
}
{
}
