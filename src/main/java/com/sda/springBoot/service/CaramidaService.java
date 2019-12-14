package com.sda.springBoot.service;

import com.sda.springBoot.dao.CaramidaDAO;
import com.sda.springBoot.dto.CaramidaDTO;
import com.sda.springBoot.entity.Caramida;

import java.util.LinkedList;
import java.util.List;

public class CaramidaService {

    CaramidaDAO caramidaDAO = new CaramidaDAO();


    public List<CaramidaDTO> findCaramida() {
        List<CaramidaDTO> caramidaDTOList = new LinkedList<CaramidaDTO>();
        List<Caramida> caramidaList= caramidaDAO.findCaramida();

        for (int i = 0; i < caramidaList.size(); i++) {
            CaramidaDTO caramidaDTO = new CaramidaDTO();

            caramidaDTO.setCantitate(caramidaList.get(i).getCantitate());
            caramidaDTO.setPret(caramidaList.get(i).getPret());
            caramidaDTO.setProducator(caramidaList.get(i).getProducator());
            caramidaDTO.setTip(caramidaList.get(i).getTip());

            caramidaDTOList.add(caramidaDTO);
        }

        return caramidaDTOList;
    }
}
