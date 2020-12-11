package com.springcodoacodoarru.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springcodoacodoarru.app.models.Producto;
import com.springcodoacodoarru.app.services.IProductoService;

@RestController

public class ProductoController {

	@Autowired

	private IProductoService productoService;

	@GetMapping(value = "/producto/{idProducto}")

	public ResponseEntity<Producto> findByProducto(@PathVariable Integer idProducto) {

		Producto producto = new Producto();
		producto = productoService.IdProducto(idProducto);
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
}
