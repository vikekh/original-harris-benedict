public class Gentleman extends Person {
	public Gentleman(String name, int weight, int height, int age) {
		super(name, weight, height, age);
	}

	@Override
	public String getHonorificName() {
		return "Mr. " + getName();
	}
}