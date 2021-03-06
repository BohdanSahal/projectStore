package com.store.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Season extends AbstractEntity {
    private String dName;
    @OneToMany(mappedBy = "season")
    private List<Clothes> clothesList = new ArrayList<>();


    public Season() {
    }

    public Season(String dName, List<Clothes> clothesList) {
        this.dName = dName;
        this.clothesList = clothesList;
    }

    public String getcName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Clothes> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }
}