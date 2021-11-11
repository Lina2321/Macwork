package exe09_5;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Anonymous() {
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
					
		);

	}
}
