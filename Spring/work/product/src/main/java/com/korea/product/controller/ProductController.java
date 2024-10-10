package com.korea.product.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("product") //localhost:9090 다음 /product로 
public class ProductController {
	
	private final ProductService service;
	
	
	@GetMapping
	public ResponseEntity<?> productList(){
		List<ProductDTO> dtos = service.showProducts();
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
		
	}
	
	@PostMapping
	//클라이언트에게서 받아야하니까 @@RequestBody를 사용
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		List<ProductDTO> dtos = service.create(dto);
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
		
	}

	
}
