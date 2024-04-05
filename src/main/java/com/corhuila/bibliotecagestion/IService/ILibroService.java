package com.corhuila.bibliotecagestion.IService;
import com.corhuila.bibliotecagestion.Entity.Libro;
import java.util.List;
import java.util.Optional;
public interface ILibroService {
    List<Libro> findAll(); // Devuelve una lista de clientes
    Optional<Libro> findById(Long id); // Devuelve un cliente por su id
    Libro save(Libro libro); // Guarda un cliente
    void update(Libro libro, Long id); // Actualiza un cliente
    void delete(Long id); // Elimina un cliente
}
