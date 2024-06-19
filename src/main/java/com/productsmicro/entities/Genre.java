package com.productsmicro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

/**
 * The type Genre Model.
 * <p>
 * Fernando Munguia
 */
@Entity
@Table(name = "ss_genre")
public class Genre implements Serializable {

    /**
     * Serial
     */
    private static final long serialVersionUID = -6229725973748148216L;

    /**
     * Field genre_id
     */
    @Id
    @Column(name = "ss_genre_id", nullable = false, unique = true, length = 1)
    private String genre_id;

    /**
     * Field genre_name
     */
    @Column(name = "ss_genre_name", nullable = false, unique = true, length = 50)
    private String genre_name;

    /**
     * Field genre_description
     */
    @Column(name = "ss_genre_description", nullable = false, unique = false, length = 50)
    private String genre_description;


    /**
     * Instantiates a new Genre.
     */
    public Genre() {}

    /**
     * Instantiates a new Genre.
     *
     * @param genre_id          the genre id
     * @param genre_description the genre description
     * @param genre_name        the genre name
     */
    public Genre(String genre_id, String genre_description, String genre_name) {
        this.genre_id = genre_id;
        this.genre_description = genre_description;
        this.genre_name = genre_name;
    }


    /**
     * Gets genre id.
     *
     * @return the genre id
     */
    public String getGenre_id() {
        return genre_id;
    }

    /**
     * Sets genre id.
     *
     * @param genre_id the genre id
     */
    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    /**
     * Gets genre description.
     *
     * @return the genre description
     */
    public String getGenre_description() {
        return genre_description;
    }

    /**
     * Sets genre description.
     *
     * @param genre_description the genre description
     */
    public void setGenre_description(String genre_description) {
        this.genre_description = genre_description;
    }

    /**
     * Gets genre name.
     *
     * @return the genre name
     */
    public String getGenre_name() {
        return genre_name;
    }

    /**
     * Sets genre name.
     *
     * @param genre_name the genre name
     */
    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
