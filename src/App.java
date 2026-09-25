import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor("Matheus", "52.879.754-2", 3, "Biologia", 42.0);
        professor.registraAulas(100);
        
        Funcionario funcionario = new Funcionario("Roberta", "45.689.786-5", 1, "Financeiro", 2500);
        funcionario.registraFalta();
        funcionario.registraFalta();
        
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(professor);
        colaboradores.add(funcionario);

        for (Colaborador colaborador : colaboradores){
            colaborador.hollerith();
            System.out.println();
        }

        System.out.println("Quantidade de colaboradores: " + colaboradores.size());//(.size()) -> quantidade de elementos na lista;
        System.out.println(colaboradores.get(0).getNome());//(.get(0)) -> pega o elemento da posição 0 da lista;
        System.out.println(colaboradores.get(1).getNome());//(.get(1)) -> pega o elemento da posição 1 da lista;
    
    }
}
