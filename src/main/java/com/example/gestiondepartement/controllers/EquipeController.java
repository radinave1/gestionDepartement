package com.example.gestiondepartement.controllers;

import com.example.gestiondepartement.dao.Equipe;
import com.example.gestiondepartement.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
public class EquipeController {


    @Autowired //injection de dépendances
    EquipeService equipeService;


    @GetMapping("/equipes")
    public List getEquipes() {

        return equipeService.getEquipes();
    }

    @GetMapping("/equipes/{id}/members")
    public List getMembresByEquipeId(@PathVariable Integer id ) {

        return equipeService.getMembersByEquipeId(id);
    }


}

