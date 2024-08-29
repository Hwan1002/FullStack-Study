package ex02_Enum;

import java.util.Arrays;
import java.util.List;

public enum CreditCard {
	SHINHAN("신한", Arrays.asList("Mr.life 카드","Deep Dream 카드", "Deep Oil 카드")),
	KB("국민",Arrays.asList("톡톡D 카드", "티타늄 카드", "다담 카드")),
	NH("농협", Arrays.asList("FLEX 카드", "테이크5카드", "올원 파이카드"));
	//Arrays의 list<타입>
	private String name;
	private List<String> cardList;
	
	private CreditCard(String bankName, List<String> asList) {
		this.name = bankName;
		this.cardList = asList;
	}
	
	public String getBank() {
		return name;
	}
	
	public List<String> getCard() {
		return cardList;
	}
}
