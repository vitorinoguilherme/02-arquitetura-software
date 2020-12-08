import exercicios.Item;
import exercicios.Produto;
import exercicios.Venda;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto("notebook", 2000.0);
        Produto prod2 = new Produto("celular", 1500.0);
        Produto prod3 = new Produto("televisão", 5000.0);

        Venda venda1 = new Venda(01);
        Venda venda2 = new Venda(02);

        Item item1 = new Item(prod1, 1);
        Item item2 = new Item(prod2, 1);
        Item item3 = new Item(prod3, 1);

        venda1.addItem(item1);
        venda1.addItem(item2);
        venda1.addItem(item3);
        venda2.addItem(item1);
        venda2.addItem(item2);
        venda2.addItem(item3);

        double totalVenda1 = venda1.valorTotal();
        System.out.println("Total a pagar: " + totalVenda1);

        double totalVenda2 = venda1.valorTotal();

    }
}
