package com.company.Cl3AntonyFigueroa.service;

import com.company.Cl3AntonyFigueroa.model.Categoria;

import java.util.List;

public interface CategoriaService {

    Categoria guardarCategoria (Categoria categoria);

    Categoria actualizarCategoria (Categoria categoria);

    void  eliminarCategoria(Long id);

    Categoria obtenerEmpleado(Long id);

    List<Categoria> listarTadasLasCategorias();
}
