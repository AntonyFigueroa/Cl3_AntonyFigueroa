package com.company.Cl3AntonyFigueroa;

import com.company.Cl3AntonyFigueroa.model.Categoria;
import com.company.Cl3AntonyFigueroa.model.Producto;
import com.company.Cl3AntonyFigueroa.repository.CategoriaRepository;
import com.company.Cl3AntonyFigueroa.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class Cl3AntonyFigueroaApplicationTests {

	@Autowired
	private ProductoRepository productoRepository;

	private CategoriaRepository categoriaRepository;
	@Test
	void insertarProducto() {
		Producto producto = new Producto();
		producto.setDescripcion("Celular de alta gama");
		producto.setPrecio(new BigDecimal("2200"));
		producto.setStock(3);
		producto.setEstado("nuevo");
		productoRepository.save(producto);

	}

	@Test
	void insertarCategoria(){
		Categoria categoria = new Categoria();
		categoria.setDescripcion("celular Iphone");
		Categoria categoria1 = categoriaRepository.save(categoria);
	}
	@Test
	void actualizarProducto(){

		Producto producto = productoRepository.findById(1L).orElse(null);

		producto.setEstado("semi nuevo");

		productoRepository.save(producto);
	}

	@Test
	void eliminarproducto(){

		productoRepository.deleteById(1L);

		Producto productoeliminado = productoRepository.findById(1L).orElse(null);

	}

	@Test
	void listarProducto(){
		Iterable<Producto> productos = productoRepository.findAll();
	}

	@Test
	void listarCategoria(){
		Iterable<Categoria> categorias = categoriaRepository.findAll();

	}

}
