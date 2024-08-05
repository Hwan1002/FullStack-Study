import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("1 ~ 50사이의 번호를 입력하여 맞춰보세요");
    int num = scan.nextInt(50);
    Start st = new Start();
    st.rndNumber(num);
    if(num){
        System.out.printf("고르신 숫자 %d 정답입니다.",num);
    }
}