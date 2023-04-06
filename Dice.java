//Rolling dice
import java.util.Random;
public class Dice {
	int rand;
	Dice(){
		Random random = new Random();
		rand = random.nextInt(2,13);
	}
	int roll(){
		return rand;
	}
}
