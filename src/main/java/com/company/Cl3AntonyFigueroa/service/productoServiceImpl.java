package com.company.Cl3AntonyFigueroa.service;

import com.company.Cl3AntonyFigueroa.model.Producto;
import com.company.Cl3AntonyFigueroa.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class productoServiceImpl implements  ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);

    }

    @Override
    public Producto obtener(Long id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public List<Producto> listarTodosLosProductos() {
        return (List<Producto>) productoRepository.findAll();
    }


}
