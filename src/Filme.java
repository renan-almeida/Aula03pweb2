public class Filme {
    public String titulo;
    public String criador;
    public int anoLançamento;
    public double orçamento;
    public double bilheteria;

    public void ExibirDadosFilme() {
        System.out.println("--------------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Criador: " + criador);
        System.out.println("Ano de lançamento: " + anoLançamento);
        System.out.println("Orçamento: " + orçamento);
        System.out.println("Bilheteria: " + bilheteria);
        System.out.println("--------------------------------");
    }
}

