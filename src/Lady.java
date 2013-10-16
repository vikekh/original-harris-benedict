public class Lady extends Person {
	private boolean married;
	
	public Lady(String name, int weight, int height, int age, boolean married) {
		super(name, weight, height, age);
		this.married = married;
	}

	@Override
	public String getHonorificName() {
		String honorific = married ? "Mrs" : "Ms";
		return honorific + ". " + getName();
	}
}