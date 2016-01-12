import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum YearType {
	Bad,
	Normal,
	Good
}

public class DragonEra {
	
	public static int dragonCount = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int dragonsStart = Integer.parseInt(scn.nextLine());
		
		List<Dragon> dragons = new ArrayList<>();
		
		for (int i = 1; i <= dragonsStart; i++) {			
			Dragon dragon = new Dragon("Dragon_" + i, 0);
			
			int eggs = Integer.parseInt(scn.nextLine());
			for (int eggCount = 0; eggCount < eggs; eggCount++) {
				Egg egg = new Egg(0, dragon);
				dragon.lay();
			}
			
			dragons.add(dragon);
				
		}
		dragonCount = dragonCount + 1;
		
		int years = Integer.parseInt(scn.nextLine());
		for (int year = 0; year < args.length; year++) {
			String yearType = scn.nextLine();
			YearType yearFactor = YearType.valueOf(yearType);
			
			for (Dragon dragon : dragons) {
				dragon.age();
				dragon.lay();
				
				for (Egg egg : dragon.getEggs()) {
					
					egg.SetYearFactor(yearFactor);
					
					egg.age();
					egg.hatch();
				}
			}
		}
	}
}
class Dragon {
	private String name;
	private int age;
	private List<Egg> eggs;
	private boolean isAlive = true;
	private Integer AGE_DEATH = 6;
	private Integer AGE_LAY_EGGS_START = 3;
	private Integer AGE_LAY_EGGS_END = 4;
	private	List<Dragon> children;
	
	public Dragon (String name, int age){
		this.name = name;
		this.age = age;		
	}
	
	public void lay() {
		if (this.age >= AGE_LAY_EGGS_START 
				&& this.age <= AGE_LAY_EGGS_END) {
			Egg egg = new Egg(0, this);
			this.eggs.add(egg);
		}
	}
	
	public void age() {
		if (this.isAlive) {
			this.age++;
		}
		if (this.age == AGE_DEATH) {
			this.isAlive = false;
		}
	}
	
	public void increaseOffspring(Dragon baby) {
		this.children.add(baby);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Iterable<Egg> getEggs() {
		return this.getEggs();
	}
}

class Egg {
	private int age;
	private Dragon parent;
	private int AGE_HATCH = 2;
	private YearType yearFactor;
	
	public Egg (int age, Dragon parent){
		this.age = age;
		this.parent = parent;	
	}
	
	public void hatch() {
		if (this.age == AGE_HATCH) {
			int yourFactor = this.yearFactor.ordinal();
			for (int i = 0; i < yourFactor; i++) {
				
				Dragon baby = new Dragon(
						this.parent.getName() 
						+ "/" 
						+ "Dragon_" 
						+ DragonEra.dragonCount, 0
					);
					
					this.parent.increaseOffspring(baby);
					DragonEra.dragonCount++;
			}
		}
	}

	public void age() {
		this.age++;
	}
	
	public void SetYearFactor(YearType yearType) {
		this.yearFactor = yearType;
	}
}
