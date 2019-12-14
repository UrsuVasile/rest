package com.sda.springBoot.dao;

import com.sda.springBoot.config.HibernateUtil;
import com.sda.springBoot.entity.Caramida;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CaramidaDAO {

    HibernateUtil hibernateUtil = new HibernateUtil();

    public List<Caramida> findCaramida() {
        hibernateUtil.openSessionAndTransaction();
        List<Caramida> caramidaList = new ArrayList<Caramida>();
        Query query = hibernateUtil.session.createNamedQuery("find_caramida");
        caramidaList = query.getResultList();
        hibernateUtil.closeSessionAndTransaction();
        return caramidaList;
    }
}
