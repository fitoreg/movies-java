package com.gashi.fitore.Movies.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movies")
@EntityListeners(AuditingEntityListener.class)
public class Movie implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String duration;
    private String genre;
    private String releaseYear;
    private String director;
    private String rating;
    private String country;
    private String trailerURL;
    private String posterThumbnailURL;

    public Movie() {}

    public Movie(Long id, String title, String duration, String genre, String releaseYear, String director, String rating, String country, String trailerURL, String posterThumbnailURL) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.rating = rating;
        this.country = country;
        this.trailerURL = trailerURL;
        this.posterThumbnailURL = posterThumbnailURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTrailerURL() {
        return trailerURL;
    }

    public void setTrailerURL(String trailerURL) {
        this.trailerURL = trailerURL;
    }

    public String getPosterThumbnailURL() {
        return posterThumbnailURL;
    }

    public void setPosterThumbnailURL(String posterThumbnailURL) {
        this.posterThumbnailURL = posterThumbnailURL;
    }
}
