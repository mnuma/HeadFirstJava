package HeadFirstJava10;

import java.util.Date;

public class HeadFirstJava10 {

	//Mathのコンストラクタがprivate宣言されているのでエラー
	//Math mathObject = new Math();

	public void math() {

		/*
		 * Mathクラスメソッド
		 */

		//0.0 ~ 0.1の範囲の無作為の数値を戻す
		Math.random();

		//絶対値を返す
		Math.abs(-243);

		//整数を返す float型なら
		int x = Math.round(42.4f);

		//小数値を返す
		Math.min(24, 240);

		//最大値を返す
		Math.max(24, 240);

	}

	public void wrap() {

	}

	//フォーマッティング
	public void formatsTest() {
		//10進数として扱いカンマを付ける
		String s = String.format("%, d",10000000);
		System.out.println(s);

		Date today = new Date();
		System.out.println(today);
		String text = String.format("%tY/%<tm/%<td", today);
		System.out.println(text);
	}

}
