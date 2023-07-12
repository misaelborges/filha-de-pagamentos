public class ContratoTrabalho {

    private Funcionario funcionario;
    private double valorHoraNormal;
    private double valorHoraExra;

    boolean adicionalParaFilho() {
        return funcionario.possuiFilho();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraExra() {
        return valorHoraExra;
    }

    public void setValorHoraExra(double valorHoraExra) {
        this.valorHoraExra = valorHoraExra;
    }
}
