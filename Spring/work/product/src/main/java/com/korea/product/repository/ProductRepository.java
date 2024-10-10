package com.korea.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.product.model.ProductEntity;

//primary키로 설정된 id의 타입이 int인데 제네릭에서는 적지 못하니까 Integer로 적어야함
//인터페이스를 상속받으면 메서드를 자식 인터페이스가 다 쓸 수 있다.
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
//메서드를 구현하지 않고 직접 호출하여 사용할 수 있다.
	
}
