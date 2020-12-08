package exercicios;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Venda {
    private Integer codigo;
    private LocalDate date;
    private List<Item> itens;

    public Venda(Integer codigo) {
        this.codigo = codigo;
        this.date = LocalDate.now();
        this.itens = new ArrayList<Item>();
    }

    public Venda(Integer codigo, LocalDate date, List itens) {
        this.codigo = codigo;
        this.date = date;
        this.itens = itens;
    }

    public Venda() {

    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public Double valorTotal() {
        double valorTotal = 0.0;
        for (Item item: itens) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }
}
