package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numOrder;


    public OrdenacaoNumeros() {
        this.numOrder = new ArrayList<>();
    }

    public void addNum(int e) {
        numOrder.add(e);
    }

    public List<Integer> orderAscending() {
        List<Integer> newList = new ArrayList<>(numOrder);
        Collections.sort(newList);
        return newList;
    }

    public List<Integer> orderDescending() {
        List<Integer> newList = new ArrayList<>(numOrder);
        Collections.sort(newList);
        Collections.reverse(newList);
        return newList;
    }

    @Override
    public String toString() {
        return numOrder + "";
    }


    public static void main(String[] args) {
        OrdenacaoNumeros numbers = new OrdenacaoNumeros();

        System.out.println(numbers);
        numbers.addNum(17);
        numbers.addNum(7);
        numbers.addNum(21);
        numbers.addNum(14);
        numbers.addNum(0);
        numbers.addNum(9);
        System.out.println(numbers);

        System.out.println(numbers.orderAscending());
        System.out.println(numbers.orderDescending());
    }
    
}
