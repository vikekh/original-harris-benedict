public abstract class Person {
	private int weight, height, age;
	private String honorific;
	private String name;
	
	protected Person(String name, int weight, int height, int age) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract String getHonorificName();
	
	public int getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
}