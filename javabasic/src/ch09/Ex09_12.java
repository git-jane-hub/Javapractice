package ch09;

// join() 과 StringJoiner
class Ex09_12 {
	public static void main(String[] args) {
		String str = "dog,tiger,bear,rabbit";
		String[] arr = str.split(",");
		String str2 = String.join("-", arr);
		System.out.println(str2);
	}
}
