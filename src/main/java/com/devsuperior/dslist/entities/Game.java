package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity   //import:alt+enter
@Table(name = "tb_game")

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "example_game") modifica o nome de uma coluna especifica no banco de dados
    private long id;
    private String titulo;
    private int ano;
    private String genero;
    private String plataforma;
    private float score;
    private String imgUrl;
    private String curtaDescricao;
    private String longaDescricao;

    public Game(long id, String titulo, int ano, String genero, String plataforma, float score, String imgUrl,
                String curtaDescricao, String longaDescricao) {
        this.id = id; //id objeto recebe id do construtor
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.score = score;
        this.imgUrl = imgUrl;
        this.curtaDescricao = curtaDescricao;
        this.longaDescricao = longaDescricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCurtaDescricao() {
        return curtaDescricao;
    }

    public void setCurtaDescricao(String curtaDescricao) {
        this.curtaDescricao = curtaDescricao;
    }

    public String getLongaDescricao() {
        return longaDescricao;
    }

    public void setLongaDescricao(String longaDescricao) {
        this.longaDescricao = longaDescricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
