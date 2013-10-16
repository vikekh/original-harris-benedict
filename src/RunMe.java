public class RunMe {
	public static void main(String[] args) {
		OriginalHarrisBenedict ohb = new OriginalHarrisBenedict();
		Gentleman viktor = new Gentleman("Viktor", 92, 195, 24);
		Lady viktoria = new Lady("Viktoria", 92, 195, 24, false);
		
		ohb.setPerson(viktor);
		ohb.calculate();
		System.out.println(ohb);
		
		ohb.setPerson(viktoria);
		ohb.calculate();
		System.out.println(ohb);
	}
}
