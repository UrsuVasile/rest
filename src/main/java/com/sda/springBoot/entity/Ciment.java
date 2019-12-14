package com.sda.springBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "ciment")
public class Ciment {

    private static final String CIMENT_SEQUENCE = "ciment_id_sequence";
    private static final String CIMENT_GENERATOR = "ciment_generator";

    @Id
    @SequenceGenerator(name = "CIMENT_GENERATOR", sequenceName = CIMENT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = CIMENT_GENERATOR)
    private long id;

    @Column(name = "tip")
    private String tip;

    @Column(name = "producator")
    private String producator;

    @Column(name = "pret")
    private double pret;

    @Column(name = "cantitate")
    private int cantitate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
