
public class Funcionario extends Colaborador{
    private String departamento;
    private double valeCoxinha = 42;
    private double salarioFixo;
    private int faltas = 0;

    public Funcionario(String nome, String rg, int qtdFilhos, String departamento, double salarioFixo) {
        super(nome, rg, qtdFilhos);
        this.departamento = departamento;
        this.salarioFixo = salarioFixo;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    /*public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }*/

    public double getValeCoxinha() {
        return valeCoxinha;
    }
    /*public void setValeCoxinha(double valeCoxinha) {
        this.valeCoxinha = valeCoxinha;
    }*/

    public double getSalarioFixo() {
        return salarioFixo;
    }
    /*public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }*/

    public int getFaltas() {
        return faltas;
    }
    /*public void setFaltas(int faltas) {
        this.faltas = faltas;
    }*/
    
    public void registraFalta(){
        faltas++;
    }

    @Override
    public double calcularSalario() {
        return (getSalarioFixo() + valeCoxinha + (getAuxilioProcriacao()*getQtdFilhos()) -((getSalarioFixo()/20)*getFaltas()));
    }

    @Override
    public void zerarMes() {
        faltas=0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Funcionario do Departamento: " + this.departamento);
        System.out.println("Quantidades de Faltas: " + this.faltas);
        System.out.println("Salario Liquido = " + calcularSalario());
    }
}