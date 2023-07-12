public class Holerite {

    private Funcionario funcionario;
    private double valorTotalHorasNormais;
    private double valorTotalHorasExtras;
    private double valorAdicionalParaFilhos;

    public double calcularTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalParaFilhos;
    }

    public void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.getNome());
        System.out.printf("Valor das horas normais: R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filhos: R$ %.2f%n", valorAdicionalParaFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularTotal());
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalHorasNormais() {
        return valorTotalHorasNormais;
    }

    public void setValorTotalHorasNormais(double valorTotalHorasNormais) {
        this.valorTotalHorasNormais = valorTotalHorasNormais;
    }

    public double getValorTotalHorasExtras() {
        return valorTotalHorasExtras;
    }

    public void setValorTotalHorasExtras(double valorTotalHorasExtras) {
        this.valorTotalHorasExtras = valorTotalHorasExtras;
    }

    public double getValorAdicionalParaFilhos() {
        return valorAdicionalParaFilhos;
    }

    public void setValorAdicionalParaFilhos(double valorAdicionalParaFilhos) {
        this.valorAdicionalParaFilhos = valorAdicionalParaFilhos;
    }
}
