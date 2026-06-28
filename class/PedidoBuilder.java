
public class PedidoBuilder {

    private String pao;
    private String carne;
    private String queijo;
    private boolean bacon;
    private boolean alface;
    private boolean tomate;
    private String molho;

    private PedidoBuilder(Builder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.bacon = builder.bacon;
        this.alface = builder.alface;
        this.tomate = builder.tomate;
        this.molho = builder.molho;
    }

    public void exibirPedido() {
        System.out.println("=== Pedido Hamburguer ===");
        System.out.println("Pão: " + pao);
        System.out.println("Carne: " + carne);
        System.out.println("Queijo: " + queijo);
        System.out.println("Bacon: " + bacon);
        System.out.println("Alface: " + alface);
        System.out.println("Tomate: " + tomate);
        System.out.println("Molho: " + molho);
    }

    public static class Builder {

        private String pao;
        private String carne;
        private String queijo;
        private boolean bacon;
        private boolean alface;
        private boolean tomate;
        private String molho;

        public Builder pao(String pao) {
            this.pao = pao;
            return this;
        }

        public Builder carne(String carne) {
            this.carne = carne;
            return this;
        }

        public Builder queijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public Builder bacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Builder alface(boolean alface) {
            this.alface = alface;
            return this;
        }

        public Builder tomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public Builder molho(String molho) {
            this.molho = molho;
            return this;
        }

        public PedidoBuilder build() {
            return new PedidoBuilder(this);
              // aqui CRIA O PEDIDO USANDO OS DADOS DENTRO DA BUILDER 
        }
    }

}
