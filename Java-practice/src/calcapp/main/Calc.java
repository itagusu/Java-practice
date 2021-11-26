package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		//FQCN出なくてもエラーにならない　importの記述をしたため
		double total = CalcLogic.tasu(5,3);
		//FQCNで書いても問題はなく動作する
		double delta = calcapp.logics.CalcLogic.hiku(5,3); 
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
