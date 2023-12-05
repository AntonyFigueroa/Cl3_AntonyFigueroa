package com.company.Cl3AntonyFigueroa.controller;

import com.company.Cl3AntonyFigueroa.model.Producto;
import com.company.Cl3AntonyFigueroa.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class ProductoController {
   @Autowired
    private ProductoService productoService;
    private Object requestMethod;

    @RequestMapping(value = "/producto", method = RequestMethod.GET)
    public List<Producto> listarProducto(){
        return productoService.listarTodosLosProductos();
    }
    @RequestMapping(value = "/producto", method = RequestMethod.POST)
    public Producto guardarProducto(Producto producto){
        return productoService.guardarProducto(producto);
    }
}
