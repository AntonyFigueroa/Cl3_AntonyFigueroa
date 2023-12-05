package com.company.Cl3AntonyFigueroa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.math.BigDecimal;
@Table(name = "Producto")
@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @Column(precision = 10,scale = 2)
    private BigDecimal precio;

    @Column
    private Integer stock;


    @Column
    private String estado;

    @ManyToOne
    private Categoria categoria;
}
