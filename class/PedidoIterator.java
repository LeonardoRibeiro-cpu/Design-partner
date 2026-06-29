public class PedidoIterator {

    private String[] itens = {
        "Hambúrguer",
        "Batata Frita",
        "Refrigerante",
        "Milk Shake"
    };

    private int indice = 0;

    // ITERATOR: verifica se ainda existe próximo item
    public boolean hasNext() {
        return indice < itens.length;
    }

    // ITERATOR: retorna o próximo item
    public String next() {
        if (hasNext()) {
            return itens[indice++];
        }
        return null;
    }
}