package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void addTarefa(String description) {
        tarefaList.add(new Tarefa(description));
    }

    public void removeTarefa(String description) {
        List<Tarefa> tarefasToRemove = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                tarefasToRemove.add(t);
            }
        }

        tarefaList.removeAll(tarefasToRemove);
    }

    public int length() {
        return tarefaList.size();
    }

    public void print() {
        System.out.println(tarefaList);
    }
}
