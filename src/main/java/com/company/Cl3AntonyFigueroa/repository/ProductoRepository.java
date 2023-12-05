package com.company.Cl3AntonyFigueroa.repository;

import com.company.Cl3AntonyFigueroa.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends CrudRepository<Producto, Long> {
}
