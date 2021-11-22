package yalko;

import java.util.Scanner;

public class RamenProgram {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("라면 몇 개 끓일까요?");
		
		num = input.nextInt();
		
		System.out.println(num + "개 주문 완료! 조리시작!");
		try{
			RamenCook ramenCook = new RamenCook(num);
			new Thread(ramenCook,"A").start();
			new Thread(ramenCook,"B").start();
			new Thread(ramenCook,"C").start();
			new Thread(ramenCook,"D").start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

interface Runnable {
	public void run();
}


class currentThread extends Thread {
	public RamenCook ramenCook;
	static String nam;
	
	currentThread()	{
		this(new RamenCook(5) , "");
	}
	
	currentThread(RamenCook ramenCook , String nam)	{
		this.ramenCook = ramenCook;
		this.nam = nam;
	}
}

class RamenCook extends Thread implements Runnable{	// Runnable 인터페이스 사용 
	// 끓여야 할 라면의 개수 
	private int ramenCount;
	// 각 버너의 상태 
	private String[] burners = {"_","_","_","_"};	// 버너가 비어있음
	
	// 라면이 끓여지려면 생성자에서 파라미터로 라면 개수를 받아옴
	public RamenCook(int count) {
		ramenCount = count;
	}
	
	// Runnable에는 필수적으로 run이라는 함수가 있어, 스레드에서 진행할 작업을 아래 정의 
	@Override
	// 스레드 실행 
	public void run(){
		// 끓여야 할 라면의 개수가 0이 될 때까지 반복 
		while(ramenCount > 0) {
			// synchronized 블럭 내부의 코드는 한번에 한 스레드만 작동 가능 
			synchronized(this) {
				ramenCount--;
				System.out.println(Thread.currentThread().getName() + " : " + ramenCount + "개 남았습니다");
			}
			
			// 4개의 버너중 빈 버너를 찾음
			for(int i = 0; i < burners.length; i++)	{
				if(!burners[i].equals("_"))	{
					continue;
				}
				
				// 둘 이상의 스레드가 한 버너를 차지하지 못하도록 함 
				synchronized(this) {
					//if(burners[i].equals("_"))
					//{
						// 해당 스레드의 이름으로 버너를 차지 
						burners[i] = Thread.currentThread().getName();
						// 라면을 끓임 
						System.out.println("                 " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 ON");
						// 버너 상태 출력 
						showBurners();
					//}
				}
				
				try	{
					// 특정 스레드를 일정 시간동안 정지 - 라면을 끓이는 시간 
					Thread.sleep(2000);	
				}catch(Exception e)	{
					e.printStackTrace();
				}
				
				synchronized(this) {
					// 라면이 끓고 나면 버너를 비움 
					burners[i] = "_";
					System.out.println("                                  " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 OFF" );
					// 버너 상태 출력 
					showBurners();
				}
				break;
			}
			
			try {
				// 다음 라면을 끓이기까지 0에서 1초까지의 랜덤시간이 걸리도록 함 
				Thread.sleep(Math.round(1000 * Math.random()));
			}catch(Exception e)	{
				e.printStackTrace();
			}
		}
	}
	
	// 실행 시점마다 버너의 상태 출력 
	private void showBurners() {
		String stringToPrint = "                                                             ";
		for(int i = 0; i < burners.length; i++)	{
			stringToPrint += (" " + burners[i]);
		}
		System.out.println(stringToPrint);
	}
}
