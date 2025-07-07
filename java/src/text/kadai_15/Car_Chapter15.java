package text.kadai_15;

public class Car_Chapter15 {

	// フィールド
	private int gear = 1; // 1速から5速のギアを表す初期値
	private int speed = 10; // ギアチェンジ後の速度を表す初期値
	
	public Car_Chapter15(){
	}

	public Car_Chapter15(int a){
	}

	
	// ギアの変更メソッド
	public void gearChange(int gear) {
		if (gear >= 1 && gear <= 5) {
			System.out.println("ギア" + this.gear + "から" + gear + "に切り替えました");
			this.gear = gear; // ギアを変更

			// ギアに応じた速度を設定
			switch (gear) {
			case 1:
				speed = 10; // 1速の速度
				break;
			case 2:
				speed = 20; // 2速の速度
				break;
			case 3:
				speed = 30; // 3速の速度
				break;
			case 4:
				speed = 40; // 4速の速度
				break;
			case 5:
				speed = 50; // 5速の速度
				break;
			}
			System.out.println("速度は時速" + speed + "kmです");
		} else {
			// 1から5以外のギアが指定された場合
			System.out.println("無効なギアです。ギアは1から5の範囲で指定してください。");
			this.gear = 1; // デフォルトのギアを1速に
			speed = 10; // デフォルトの速度
		}
	}
}