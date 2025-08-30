package com.aej.cecarticulo.controller;


import com.aej.cecarticulo.model.ArticuloModel;
import com.aej.cecarticulo.services.ArticuloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    ArticuloServiceImpl articuloService;

    @GetMapping
    public List<ArticuloModel> getArticulos(){
        return articuloService.getArticulos();
    }



}
