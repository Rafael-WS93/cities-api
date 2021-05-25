package com.github.rafaelws93.citiesapi.cities.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rafaelws93.citiesapi.cities.entities.City;
import com.github.rafaelws93.citiesapi.cities.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityResource {

  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }


	@GetMapping("/{id}")
	public ResponseEntity<City> getOne(@PathVariable Long id) {
		
		Optional <City> optional = repository.findById(id);
		
		if (optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
}
