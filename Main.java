public class Main {
	public static void main(String[] args) {
		Dice Dice_obj= new Dice();
		int steps = Dice_obj.roll();
		Movement_monopoly mov_mon_obj = new Movement_monopoly(steps);
	}
}
