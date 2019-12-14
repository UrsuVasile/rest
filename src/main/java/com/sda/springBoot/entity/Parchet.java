package com.sda.springBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "parchet")
public class Parchet {

    private static final String PARCHET_SEQUENCE = "parchet_id_sequence";
    private static final String PARCHET_GENERATOR = "parchet_generator";

    @Id
    @SequenceGenerator(name = "PARCHET_GENERATOR", sequenceName = PARCHET_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PARCHET_GENERATOR)
    private long id;

    @Column(name = "tip")
    private String tip;

    @Column(name = "lungime")
    private double lungime;

    @Column(name = "latime")
    private double latime;

    @Column(name = "culoare")
    private String culoare;

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

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
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
