package com.corhuila.bibliotecagestion.IRepository;

import com.corhuila.bibliotecagestion.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository <Autor, Long> {
}
