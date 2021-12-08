package ch07;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명 클래스 
class Button{
	Button(String text){
		System.out.println(text);
	}
	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}

public class Ex07_51 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		
		// 클래스의 생성과 정의를 한번에 
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured!!!");
				
			}
		});
	}
}
/*
// 일회성으로 사용하는 클래스를 익명 클래스로 변경 
class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured!!!");
		
	}
}
*/