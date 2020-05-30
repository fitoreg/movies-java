package com.gashi.fitore.Movies.repository;

import com.gashi.fitore.Movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

// This class extends the JpaRepository that is responsible for storing
// and retrieving data from the H2 Database.
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
