package com.example.gestiondepartement.service;

import com.example.gestiondepartement.dao.Equipe;
import com.example.gestiondepartement.dao.EquipeRepository;
import com.example.gestiondepartement.dao.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipeServiceImpl implements EquipeService {

     @Autowired
     private EquipeRepository equipeRepository;

     @Autowired
     private MemberRepository memberRepository;


     @Override
     public List getEquipes() {
          return equipeRepository.findAll();
     }

     @Override
     public List getMembersByEquipeId(Integer id) {
          return memberRepository.findByEquipeEquipeId(id);

     }

}
