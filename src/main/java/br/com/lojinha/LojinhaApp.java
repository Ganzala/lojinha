package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto ("Sony",Tamanho.MEDIO);
        System.out.println(meuProduto.getMarca());
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(10);
        meuProduto.setMarca("Sony");
        //meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> ItensInclusos = new ArrayList<>();
        ItensInclusos.add ("2controles");
        ItensInclusos.add("3 jogos");
        meuProduto.setItensInclusos(ItensInclusos);


        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());

    }
}
