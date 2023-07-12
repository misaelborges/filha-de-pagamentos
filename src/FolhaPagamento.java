public class FolhaPagamento {

    public Holerite calcularSalario(int quantidadeHorasNormais, int quantidadeHorasExtra, ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();

        holerite.setFuncionario(contrato.getFuncionario());
        holerite.setValorTotalHorasNormais(quantidadeHorasNormais * contrato.getValorHoraNormal());
        holerite.setValorTotalHorasExtras(quantidadeHorasExtra * contrato.getValorHoraExra());

        double subtotal = holerite.getValorTotalHorasNormais() + holerite.getValorTotalHorasExtras();

        if (contrato.adicionalParaFilho()) {
            holerite.setValorAdicionalParaFilhos(subtotal * 0.10);
        }

        holerite.calcularTotal();
        return holerite;
    }

}
