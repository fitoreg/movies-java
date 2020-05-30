package com.gashi.fitore.Movies.controller;

import com.gashi.fitore.Movies.model.Movie;
import com.gashi.fitore.Movies.repository.MovieRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

// This header allows us to run the API on multiple browsers
@CrossOrigin(origins = "*", allowedHeaders = "*")

// This Spring annotation declares the MovieController class as a REST Controller
@RestController

// Define the end-point path
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @PostMapping
    public Movie save(@NotNull @RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @PutMapping Movie update(@NotNull @RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        movieRepository.deleteById(id);
    }
}
