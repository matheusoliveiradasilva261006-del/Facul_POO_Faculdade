
public abstract class Colaborador {
    private String nome;
    private String rg;
    private int qtdFilhos;
    private final double auxilioProcriacao = 100;
    
    public double getAuxilioProcriacao() {
        return auxilioProcriacao;
    }

    /*public void setAuxilioProcriacao(double auxilioProcriacao) {
        this.auxilioProcriacao = auxilioProcriacao;
    }*/

    public Colaborador(String nome, String rg, int qtdFilhos){
        this.nome = nome;
        this.rg = rg;
        this.qtdFilhos = qtdFilhos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }
    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }
    
    public abstract double calcularSalario();
    public abstract void zerarMes();
    public void hollerith(){
        System.out.println(nome + " do rg: " + rg + " possui " + qtdFilhos + " de filhos");
    }
    
    
}