package com.corhuila.bibliotecagestion.IService;
import com.corhuila.bibliotecagestion.Entity.Autor;
import java.util.List;
import java.util.Optional;
public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de clientes
    Optional<Autor> findById(Long id); // Devuelve un cliente por su id
    Autor save(Autor autor); // Guarda un cliente
    void update(Autor autor, Long id); // Actualiza un cliente
    void delete(Long id); // Elimina un cliente
}
