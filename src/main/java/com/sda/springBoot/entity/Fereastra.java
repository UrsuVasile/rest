package com.sda.springBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "ferestre")
public class Fereastra {

    private static final String FEREASTRA_SEQUENCE = "fereastra_id_sequence";
    private static final String FEREASTRA_GENERATOR = "fereastra_generator";

    @Id
    @SequenceGenerator(name = "FEREASTRA_GENERATOR", sequenceName = FEREASTRA_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = FEREASTRA_GENERATOR)
    private long id;

    @Column(name = "tip")
    private String tip;

    @Column(name = "lungime")
    private double lungime;

    @Column(name = "latime")
    private double latime;

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

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
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
