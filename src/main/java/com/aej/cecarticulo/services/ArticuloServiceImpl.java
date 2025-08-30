package com.aej.cecarticulo.services;

import com.aej.cecarticulo.dao.ArticuloRepository;
import com.aej.cecarticulo.model.ArticuloModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloServiceImpl implements IArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;


    @Override
    public List<ArticuloModel> getArticulos() {
        return articuloRepository.findAll();
    }
}
