package dentaku;
import java.io.IOException;
import java.util.Scanner;

public class Dentaku {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int i = 0; //変数を初期化
		double sum = 0; //合計値
		String again = ""; 

		for(; i < 1;) { //繰り返す
			System.out.println("演算子を入力してください。");
			System.out.println("足し算：+、引き算：-、掛け算：*、割り算：/");
			String operator = sc.nextLine(); //演算子
			
			if(operator.equals("+")) { //足し算
				System.out.println("足される数を入力してください。");
				double value1 = Double.parseDouble(sc.next()); //小数
				System.out.println("足す数を入力してください。");
				double value2 = Double.parseDouble(sc.next());
				sum = value1 + value2;
				System.out.println(value1 + " + " + value2 + " = " + sum + " です。");
			}
			else if(operator.equals("-")) { //引き算
				System.out.println("引かれる数を入力してください。");
				double value1 = Double.parseDouble(sc.next()); //小数
				System.out.println("引く数を入力してください。");
				double value2 = Double.parseDouble(sc.next());
				sum = value1 - value2;
				System.out.println(value1 + " - " + value2 + " = " + sum + " です。");
			}
			else if(operator.equals("*")) { //掛け算
				System.out.println("掛けられる数を入力してください。");
				double value1 = Double.parseDouble(sc.next()); //小数
				System.out.println("掛ける数を入力してください。");
				double value2 = Double.parseDouble(sc.next());
				sum = value1 * value2;
				System.out.println(value1 + " * " + value2 + " = " + sum + " です。");
			}
			else if(operator.equals("/")) { //割り算
				System.out.println("割られる数を入力してください。");
				double value1 = Double.parseDouble(sc.next()); //小数
				System.out.println("割る数を入力してください。");
				double value2 = Double.parseDouble(sc.next());
				if(value2 == 0) { //0を入力された場合
					System.out.println("0では割れません。");
					System.out.println("もう一度計算しますか。");
					System.out.println("はい：Y いいえ：N");
					again = sc.nextLine();
					if(again.equals("Y")) {
						continue;
					}
					else if(again.equals("N")) {
						break;
					}
					else {
						System.out.println("YかNを入力してください。");
					}
				}
				sum = value1 / value2;
				double remainder = value1 % value2;
				System.out.println(value1 + " / " + value2 + " = " + sum + " 余りが" + remainder + " です。");
			}
			else { //エラー
				System.out.println("+か-か*か/を入力してください。");
			}
			for(; i < 1;) {
				System.out.println("もう一度計算しますか。");
				System.out.println("はい：Y いいえ：N");
				again = sc.nextLine();
				if(again.equals("Y")) {
					break;
				}
				else if(again.equals("N")) {
					break;
				}
				else { //エラー
					System.out.println("YかNを入力してください。");
				}
			}
			if(again.equals("N")) {
				break;
			}
		}
		System.out.println("計算を終了します。");
	}
}