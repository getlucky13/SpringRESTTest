package org.example.springresttest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface SurvivorRepository extends PagingAndSortingRepository<Survivor, Long>, CrudRepository<Survivor, Long> {
    List<Survivor> findByLastName(@Param("name") String name);
    List<Survivor> findByBirthplace(@Param("birthplace") String birthplace);
}
