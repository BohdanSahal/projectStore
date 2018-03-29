
package com.store.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ClothesSize extends AbstractEntity{
    private String bName;
    @OneToMany(mappedBy = "clothesSize")
    private List<Clothes> clothesList = new ArrayList<>();

    public ClothesSize() {

    }

    public ClothesSize(String bName, List<Clothes> clothesList) {
        this.bName = bName;
        this.clothesList = clothesList;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public List<Clothes> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }
}
