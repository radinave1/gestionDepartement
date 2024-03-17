package com.example.gestiondepartement.service;

import com.example.gestiondepartement.dao.Equipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipeService {

   List getEquipes();

   List getMembersByEquipeId(Integer id);





}
