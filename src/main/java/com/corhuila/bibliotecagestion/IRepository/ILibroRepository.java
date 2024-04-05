package com.corhuila.bibliotecagestion.IRepository;

import com.corhuila.bibliotecagestion.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository <Libro, Long> {
}
