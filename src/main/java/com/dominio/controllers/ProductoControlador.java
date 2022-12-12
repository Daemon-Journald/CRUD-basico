package com.dominio.controllers;

import com.dominio.entities.Producto;
import com.dominio.services.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Producto controlador
 */
@Controller
@RequestMapping("/productos")
public class ProductoControlador {
     @Autowired
     private ProductoServicio productoServicio;

   

    /**
     * Listar todos los Productos
     *
     * @param model
     * @return
     */
   @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", productoServicio.listarProductos());
        System.out.println("Listando productos:");
        return "productos";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}")
    public String mostrarProducto(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoServicio.obtenerProductoPorId(id));
        return "mostrarproducto";
    }

    // Afficher le formulaire de modification du Producto
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoServicio.obtenerProductoPorId(id));
        return "formularioproducto";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @GetMapping("/nuevo")
    public String nuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "formularioproducto";
    }

    /**
     * Save producto to database.
     *
     * @param producto
     * @return
     */
    @PostMapping("/submit")
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoServicio.guardarProductos(producto);
        return "redirect:/productos";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        productoServicio.eliminarProductoPorId(id);
        return "redirect:/productos";
    }

}
