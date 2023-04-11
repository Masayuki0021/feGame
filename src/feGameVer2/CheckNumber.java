package feGameVer2;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CheckNumber {
	static int num;
	public int checkAndReturnNumber(int start,int end) {
		while(true) {
			try {
				num=new Scanner(System.in).nextInt();
				checkNumber(num,start,end);
				break;
			}catch(IllegalArgumentException e){
				System.out.println(start+"～"+end+"までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}catch(InputMismatchException e){
				System.out.println("正しい数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}catch(Exception e){
				System.out.println("正しい数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}
		}
		return num;
	}
	public void checkNumber(int num,int start, int end) {
		if(num>end||num<start) {
			throw new IllegalArgumentException(start+"～"+end+"の中から選択してください");
		}
	}
	public int checkAndReturnNumberForGameMode3(int start,int end,Map<Integer,String> statusMap) {
		while(true) {
			try {
				num=new Scanner(System.in).nextInt();
				checkNumberForGameMode3(num,start,end,statusMap);
				break;
			}catch(IllegalArgumentException e){
				System.out.println(start+"～"+end+"までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}catch(InputMismatchException e){
				System.out.println("正しい数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}catch(Exception e){
				System.out.println("正しい数字が入力されていません\n"
						+ "正しい数字を入力してください");
			}
		}
		return num;
	}
	public void checkNumberForGameMode3(int num,int start, int end,Map<Integer,String> statusMap) {
		if(num>end||num<start||statusMap.get(num)==null) {
			throw new IllegalArgumentException(start+"～"+end+"の中から選択してください");
		}
	}
}
