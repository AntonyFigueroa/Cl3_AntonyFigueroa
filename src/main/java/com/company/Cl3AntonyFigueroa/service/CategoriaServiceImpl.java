package com.company.Cl3AntonyFigueroa.service;

import com.company.Cl3AntonyFigueroa.model.Categoria;
import com.company.Cl3AntonyFigueroa.repository.CategoriaRepository;

import java.util.List;

public class CategoriaServiceImpl implements CategoriaService  {

   private CategoriaRepository categoriaRepository;
    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);

    }

    @Override
    public Categoria obtenerEmpleado(Long id) {
        return categoriaRepository.findById(id).get();
    }

    @Override
    public List<Categoria> listarTadasLasCategorias() {
        return (List<Categoria>) categoriaRepository.findAll();
    }
}
