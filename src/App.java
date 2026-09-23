public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====================Professor=====================");
        Professor professor = new Professor("Matheus", "52.879.754-2", 3, "Biologia", 100, 42);
        professor.registraAulas(100);
        professor.hollerith();
        
        System.out.println("=====================Funcionario=====================");
        Funcionario funcionario = new Funcionario("Roberta", "45.689.786-5", 1, "Financeiro", 2500);
        funcionario.registraFalta();
        funcionario.registraFalta();
        funcionario.hollerith();
        System.out.println("-----------Sem faltas-----------");
        funcionario.zerarMes();
        funcionario.hollerith();
    }
}
