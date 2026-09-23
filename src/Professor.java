
public class Professor extends Colaborador{
    private String curso;
    private int qtdAulas;
    private int horaAula;
    
    public Professor(String nome, String rg, int qtdFilhos, String curso, int qtdAulas, int horaAula){
        super (nome, rg,qtdFilhos);
        this.curso = curso;
        this.qtdAulas = 0;
        this.horaAula = horaAula;
    }
    
    public String getCurso() {
        return curso;
    }
    /*public void setCurso(String curso) {
        this.curso = curso;
    }*/
    
    public int getQtdAulas() {
        return qtdAulas;
    }
    /*public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }*/
    
    public double getHoraAula() {
        return horaAula;
    }
    /*public void setHoraAula(double horaAula) {
        this.horaAula = horaAula;
    }*/
    
    
    public void registraAulas(int Qtd){
        qtdAulas += Qtd; 
    }

    @Override
    public double calcularSalario() {
        return (getQtdAulas()*getHoraAula()) + (auxilioProcriação*qtdFilhos);
    }

    @Override
    public void zerarMes() {
        qtdAulas =0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Professor do curso: " + this.curso);
        System.out.println("Quantidades de Aulas: " + this.qtdAulas);
        System.out.println("Valor por Hora Aula: " + this.horaAula);
        System.out.println("Salario Liquido = " + calcularSalario());
    }

    

    
}