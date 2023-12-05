package com.company.Cl3AntonyFigueroa.service;

import com.company.Cl3AntonyFigueroa.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto guardarProducto (Producto producto);

    Producto actualizarProducto (Producto producto);
    void eliminarProducto (Long id);
    Producto obtener (Long id);
    List<Producto> listarTodosLosProductos();



}
