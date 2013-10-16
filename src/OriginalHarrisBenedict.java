import java.math.*;

public class OriginalHarrisBenedict {
	private double kcal;
	private Person person;
	
	public OriginalHarrisBenedict() {}
	
	public OriginalHarrisBenedict(Person person) {
		this.person = person;
		calculate();
	}
	
	public void calculate() {
		if (person instanceof Gentleman) {
			kcal = 66.4730 + 13.7516*person.getWeight() + 5.0033*person.getHeight() - 6.7550*person.getAge();
		} else if (person instanceof Lady) {
			kcal = 655.0955 + 9.5634*person.getWeight() + 1.8496*person.getHeight() - 4.6756*person.getAge();
		}
	}
	
	public int getKcal() {
		return (int) Math.round(kcal);
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String toString() {
		return person.getHonorificName() + " has a BMR of " + getKcal() + " kcal/day.";
	}
}