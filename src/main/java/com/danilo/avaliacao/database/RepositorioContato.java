package com.danilo.avaliacao.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.avaliacao.entidade.Contato;

public interface RepositorioContato extends JpaRepository <Contato,Long>{
    
}
