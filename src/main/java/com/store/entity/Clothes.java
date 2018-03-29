
package com.store.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Clothes extends AbstractEntity {

    private BigDecimal price;


    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Brand brand;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gender gender;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Season season;
    @ManyToOne(fetch = FetchType.LAZY)
    private ClothesMaterial clothesMaterials;
    @ManyToOne(fetch = FetchType.LAZY)
    private ClothesSize clothesSize;



    private Clothes() {


    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public ClothesMaterial getClothesMaterials() {
        return clothesMaterials;
    }

    public void setClothesMaterials(ClothesMaterial clothesMaterials) {
        this.clothesMaterials = clothesMaterials;
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(ClothesSize clothesSize) {
        this.clothesSize = clothesSize;
    }
}

