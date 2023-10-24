package dev.feliperos;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private String sigla;
    private final List<Cidade> cidades;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public int contarClima(String clima) {
        int contador = 0;
        for (Cidade cidade : this.cidades) {
            if (cidade.getClima().equals(clima)) contador++;
        }
        return contador;
    }

    public String getCidadeMaisPopulosa() {
        String nomeCidade = "Nenhum Registro Inicial!";
        int populacaoCidade = 0;
        for (Cidade cidade : this.cidades) {
            if (cidade.getPopulacao() > populacaoCidade) {
                nomeCidade = cidade.getNome();
                populacaoCidade = cidade.getPopulacao();
            }
        }
        return nomeCidade;
    }

    public float criarMediaAreaCidades() {
        float total = 0;
        for (Cidade cidade : this.cidades) {
            total += cidade.getArea();
        }
        return total / this.cidades.size();
    }
}
