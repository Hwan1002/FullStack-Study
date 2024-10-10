package com.korea.product.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//- 클라이언트와 데이터를 직접적으로 주고받기 위한 ResponseDTO클래스
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ResponseDTO<T> {
	private String error; //에러메시지를 담아서 보내기위한 속성
	private List<T> data;
}
