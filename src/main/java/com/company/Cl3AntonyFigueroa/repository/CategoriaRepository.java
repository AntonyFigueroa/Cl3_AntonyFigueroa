package com.company.Cl3AntonyFigueroa.repository;

import com.company.Cl3AntonyFigueroa.model.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria ,Long> {
}
