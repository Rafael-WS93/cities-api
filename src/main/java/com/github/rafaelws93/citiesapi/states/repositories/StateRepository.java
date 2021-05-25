package com.github.rafaelws93.citiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rafaelws93.citiesapi.states.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
