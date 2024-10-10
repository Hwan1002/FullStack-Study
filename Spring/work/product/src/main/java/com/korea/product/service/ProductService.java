package com.korea.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//final을 사용하기 위해 반드시 필요한 어노테이션
//필드에 final 이나 @Nolnull이 붙어있는 필드를 매개변수로 갖는 생성자를 생성

public class ProductService {
	
	private final ProductRepository repository;
	
	//조회하기
	public List<ProductDTO> showProducts() {
		//DB에 접근해서 데이터를 조회
		//findAll() : select * from product;
		List<ProductEntity> list = repository.findAll();
		
		//리스트안에 들어있는 entity들을 dto로 변경
		//스트림연산 1.스트림의 생성 2. 중간연산 3. 마무리 연산
		List<ProductDTO> dtos = list.stream().map(ProductDTO::new).collect(Collectors.toList());
		return dtos;
	}
	
	//추가하기
	public List<ProductDTO> create(ProductDTO dto){
		//DTO -> Entity
		ProductEntity entity = ProductDTO.toEntity(dto);
		repository.save(entity);
		return showProducts();
	}
	
	
	
}
