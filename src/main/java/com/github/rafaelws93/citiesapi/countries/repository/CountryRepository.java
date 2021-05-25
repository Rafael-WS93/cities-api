package com.github.rafaelws93.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rafaelws93.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
