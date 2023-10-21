package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numList;


    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }

    public void addNum(int num) {
        numList.add(num);
    }

    public int sum() {
        int sum = 0;
        if(!numList.isEmpty()) {
            for (Integer i : numList) {
                sum += i;
            }
        }

        return sum;
    }

    public int max() {
        Integer currentMax = null;
        if(!numList.isEmpty()) {
            for (Integer i : numList) {
                if(currentMax == null) currentMax = i;
                else currentMax = Math.max(currentMax, i);
            }
        }
        
        return currentMax;
    }

    public int min() {
        Integer currentMin = null;
        if(!numList.isEmpty()) {
            for (Integer i : numList) {
                if(currentMin == null) currentMin = i;
                else currentMin = Math.min(currentMin, i);
            }
        }
        
        return currentMin;
    }

    public List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();

        if(!numList.isEmpty()) for (Integer i : numList) values.add(i);

        return values;
    }

    @Override
    public String toString() {
        return numList + "";
    }    

    public static void main(String[] args) {
        SomaNumeros numbersList = new SomaNumeros();

        numbersList.addNum(1);
        numbersList.addNum(5);
        numbersList.addNum(10);
        numbersList.addNum(21);
        numbersList.addNum(16);
        numbersList.addNum(6);
        numbersList.addNum(9);
        numbersList.addNum(12);

        System.out.println(numbersList);
        System.out.println(numbersList.max());
        System.out.println(numbersList.min());
        System.out.println(numbersList.sum());
    }
}