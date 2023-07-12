public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Misael");
        funcionario.setQuantidadeFilhos(1);

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.setFuncionario(funcionario);
        contratoTrabalho.setValorHoraNormal(22);
        contratoTrabalho.setValorHoraExra(30);

        var folha = new FolhaPagamento();

        Holerite holerite = folha.calcularSalario(150,15,contratoTrabalho);

        holerite.imprimir();
    }

}
