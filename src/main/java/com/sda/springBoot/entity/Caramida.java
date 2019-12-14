package com.sda.springBoot.entity;

import javax.persistence.*;
import java.util.Objects;

@NamedQueries({
        @NamedQuery(name = "find_caramida",
        query = "select s from Caramida s")
})

@Entity
@Table(name = "caramida")
public class Caramida {

    private static final String CARAMIDA_SEQUENCE = "caramida_id_sequence";
    private static final String CARAMIDA_GENERATOR = "caramida_generator";

    @Id
    @SequenceGenerator(name = "CARAMIDA_GENERATOR", sequenceName = CARAMIDA_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = CARAMIDA_GENERATOR)
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

    @Override
    public String toString() {
        return "Caramida{" +
                "id=" + id +
                ", tip='" + tip + '\'' +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caramida caramida = (Caramida) o;
        return id == caramida.id &&
                Double.compare(caramida.pret, pret) == 0 &&
                cantitate == caramida.cantitate &&
                Objects.equals(tip, caramida.tip) &&
                Objects.equals(producator, caramida.producator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tip, producator, pret, cantitate);
    }
}
