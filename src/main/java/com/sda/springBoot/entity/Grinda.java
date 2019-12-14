package com.sda.springBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "Grinzi")
public class Grinda {

    private static final String GRINDA_SEQUENCE = "grinda_id_sequence";
    private static final String GRINDA_GENERATOR = "grinda_generator";

    @Id
    @SequenceGenerator(name = "GRINDA_GENERATOR", sequenceName = GRINDA_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GRINDA_GENERATOR)
    private long id;

    @Column(name = "lungime")
    private double lungime;

    @Column(name = "grosime")
    private double grosime;

    @Column(name = "tip_lemn")
    private String tipLemn;

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

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getGrosime() {
        return grosime;
    }

    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public void setTipLemn(String tipLemn) {
        this.tipLemn = tipLemn;
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
