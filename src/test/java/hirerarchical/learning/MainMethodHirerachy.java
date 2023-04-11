package hirerarchical.learning;

public class MainMethodHirerachy {

	public static void main(String[] args) {
		ClassB cb= new ClassB();
		ClassC cc = new ClassC();
		
		cb.dress();
		cb.fruits();
		
		cc.vegetables();
		cc.country();
	}
}
