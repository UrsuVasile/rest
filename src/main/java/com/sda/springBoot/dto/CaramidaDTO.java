package com.sda.springBoot.dto;

import java.util.Objects;

public class CaramidaDTO {
    private String tip;
    private String producator;
    private double pret;
    private int cantitate;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaramidaDTO that = (CaramidaDTO) o;
        return Double.compare(that.pret, pret) == 0 &&
                cantitate == that.cantitate &&
                Objects.equals(tip, that.tip) &&
                Objects.equals(producator, that.producator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tip, producator, pret, cantitate);
    }

    @Override
    public String toString() {
        return "CaramidaDTO{" +
                "tip='" + tip + '\'' +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                '}';
    }
}
