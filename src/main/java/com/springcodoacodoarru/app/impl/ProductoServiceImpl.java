package com.springcodoacodoarru.app.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcodoacodoarru.app.models.Producto;
import com.springcodoacodoarru.app.repository.ProductoRepository;
import com.springcodoacodoarru.app.services.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto IdProducto(String idProducto) {

		Producto producto = null;

		try {

			producto = productoRepository.findById(idProducto);

		} catch (Exception e) {

		}

		return producto;

	}

}