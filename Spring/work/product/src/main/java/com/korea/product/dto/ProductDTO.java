package com.korea.product.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.korea.product.model.ProductEntity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
	private int id;
	private String productName;
	private int stock;
	private int price;
	private LocalDateTime registDate;
	private LocalDateTime updateDate;
	
	//기본생성자에 entity를 dto로 바꾸는 메서드를 만듬
	public ProductDTO(final ProductEntity entity) {
		this.id = entity.getId();
		this.productName = entity.getProductName();
		this.stock = entity.getStock();
		this.price = entity.getPrice();
		this.registDate = entity.getRegistDate();
		this.updateDate = entity.getUpdateDate();
	}
	//DTO객체 생성없이 사용할수 있기때문에 static을 사용
	public static ProductEntity toEntity(ProductDTO dto) {
		return ProductEntity.builder()
				.id(dto.getId())
				.productName(dto.getProductName())
				.stock(dto.getStock())
				.price(dto.getPrice())
				.registDate(dto.getRegistDate())
				.updateDate(dto.getUpdateDate())
				.build();
	}
	
	
}
