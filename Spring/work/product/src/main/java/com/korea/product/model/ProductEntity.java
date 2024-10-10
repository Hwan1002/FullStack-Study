package com.korea.product.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name ="product")
public class ProductEntity {
	
	@Id //id를 primary key로 지정
	@GeneratedValue(strategy = GenerationType.AUTO)//아이디의 값이 자동으로 올라가게끔
	//바로 아래에 적은것에 대한것에만 적용됌
	private int id;
	private String productName;
	private int stock;
	private int price;
	
	@CreationTimestamp //Insert쿼리가 발생할때 그때의 시간값을 적용시켜준다.
	private LocalDateTime registDate; //등록날짜
	
	@UpdateTimestamp //Update쿼리가 발생할때 그때의 시간값을 적용시켜준다.
	//LocalDateTime.now() 현재 시간을 저장
	private LocalDateTime updateDate = LocalDateTime.now(); //수정날짜
	
	
	
	
	
	
	
}
