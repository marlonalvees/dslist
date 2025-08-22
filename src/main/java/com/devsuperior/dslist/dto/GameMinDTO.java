package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    // (Game entity) estamos instanciando GameMinDTO a partir do Objeto Game copiando os dados do Objeto Game para o GameMinDTO
    public GameMinDTO(Game entity) {
        // Aqui mudamos para o nome do parametro acima que no caso é 'entity' sendo assim nao necessario o 'this' pois nao tem ambiguidade
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
