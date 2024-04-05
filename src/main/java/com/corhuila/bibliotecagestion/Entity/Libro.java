package com.corhuila.bibliotecagestion.Entity;
import jakarta.persistence.*;


@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "isbn", length = 20, nullable = false, unique = true)
    private String isbn;

    @Column(name = "genero", length = 50, nullable = false)
    private String genero;
    @Column(name = "aniopublicacion", length = 50, nullable = false)
    private int anionPublicacion;

    @Column(name = "sinopsis", length = 50, nullable = false)
    private String sinopsis;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor_id;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnionPublicacion() {
        return anionPublicacion;
    }

    public void setAnionPublicacion(int anionPublicacion) {
        this.anionPublicacion = anionPublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autor_id;
    }

    public void setAutor(Autor autor) {
        this.autor_id = autor;
    }


}
