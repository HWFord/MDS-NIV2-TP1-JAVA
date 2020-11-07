package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
	@Override
	public void move() {
		this.walk();
		
	}
	@Override
	public void walk() {
		System.out.println("This animal is walking");
		
	}
	

	@Override
	public void eat(Animal animal) {
		
	}

	
	@Override
	public void eat(Eatable eatable) {
		if(eatable instanceof Animal) {
			this.eat((Animal)eatable);//caster eatable en animal
		}else if(eatable instanceof Animal) {
			System.out.println("This animal can not eat animals");
		}
		
	}
}
