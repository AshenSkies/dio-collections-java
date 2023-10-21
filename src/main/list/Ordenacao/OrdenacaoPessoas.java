package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> orderByAge() {
        List<Pessoa> peopleByAge = new ArrayList<>(pessoaList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Pessoa> orderByHeight() {
        List<Pessoa> peopleByHeight = new ArrayList<>(pessoaList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

}

