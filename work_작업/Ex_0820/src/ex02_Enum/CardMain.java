package ex02_Enum;

public class CardMain {

	public static void main(String[] args) {
		CreditCard[] cc = CreditCard.values();
		for(CreditCard s : cc) {
			System.out.println(s.getBank()+s.getCard());
		}
	}

}
