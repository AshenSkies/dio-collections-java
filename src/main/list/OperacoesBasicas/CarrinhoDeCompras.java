package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double preco, int quantidade) {
        itemList.add(new Item(name, preco, quantidade));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item i : itemList) if(i.getNome().equalsIgnoreCase(name)) itemsToRemove.add(i);

        itemList.removeAll(itemsToRemove);
    }

    public double netValues() {
        double sum = 0.0;
        for (Item i : itemList) sum += i.getPreco() * i.getQuantidade();
        return sum;
    }

    public void print() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras car = new CarrinhoDeCompras();
        car.print();

        car.addItem("Normal Pills", 12.00, 10);
        car.addItem("Not-Normal Pills", 6.00, 30);
        car.addItem("Shinkansen Ticket", 9.00, 25);
        car.addItem("Fire Stone", 14.60, 5);
        car.addItem("Alucard Cape", 3.90, 15);

        car.print();
        System.out.println(car.netValues());

        car.removeItem("Fire Stone");
        car.print();
        System.out.println(car.netValues());
    }
}
