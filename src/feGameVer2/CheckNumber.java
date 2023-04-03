package feGameVer2;

import java.util.Scanner;

public class CheckNumber {
	public int checkAndReturnNumber(int start,int end) {
		int num;
		try {
			num=new Scanner(System.in).nextInt();
			checkNumber(num,start,end);
		}catch(IllegalArgumentException e){
			//こちらで正しい数値が入れられるまでwhileでまわす。
			System.out.println(start+"～"+end+"までの数字が入力されていません\n"
					+ "正しい数字を入力してください");
			num=new Scanner(System.in).nextInt();

			while((num>end||num<start)) {
				System.out.println(start+"～"+end+"までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				num=new Scanner(System.in).nextInt();
			}
		}
		return num;

	}
	public void checkNumber(int num,int start, int end) {
		if(num>end||num<start) {
			throw new IllegalArgumentException(start+"～"+end+"の中から選択してください");
		}


	}

}
