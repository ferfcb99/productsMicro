package com.productsmicro.models;
import java.io.Serializable;


/**
 * The type Genre dto.
 */
public class GenreDto implements Serializable {

    /**
     * Serial
     */
    private static final long serialVersionUID = -174184170040566297L;

    /**
     * Variable genre_id
     */
    private String genre_id;

    /**
     * Variable genre_name
     */
    private String genre_name;

    /**
     * Variable genre_description
     */
    private String genre_description;

    /**
     * Instantiates a new Genre dto.
     */
    public GenreDto() {
    }

    /**
     * Instantiates a new Genre dto.
     *
     * @param genre_id          the genre id
     * @param genre_name        the genre name
     * @param genre_description the genre description
     */
    public GenreDto(String genre_id, String genre_name, String genre_description) {
        this.genre_id = genre_id;
        this.genre_name = genre_name;
        this.genre_description = genre_description;
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
