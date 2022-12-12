package com.dominio.services;

import com.dominio.entities.Producto;
import com.dominio.repositories.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Producto service implement.
 */
@Service
public class ProductoServicioImpl implements ProductoServicio {
     @Autowired
     private ProductoRepositorio productoRepositorio;

    

    @Override
    public Iterable<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Integer id) {
        return productoRepositorio.findById(id).get();
    }

    @Override
    public Producto guardarProductos(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Integer id) {
        productoRepositorio.deleteById(id);
    }

}
