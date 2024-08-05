import java.util.Random;
public class Start{
    int rndNumber(num){
        Random rnd = new Random();
        int rndNum = rnd.nextInt(50);
        System.out.println(num);
        int count = 0;
        do{
            if(num <  rndNum){
                System.out.print("UP!!");
            }else if(num > rndNum){
                System.out.print("DOWN!!");
            }
            count++;
        }while{
            num == rndNum
            return;
        }
    }
}
    