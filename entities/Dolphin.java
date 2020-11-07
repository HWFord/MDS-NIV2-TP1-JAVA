package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  

	@Override
	public void move() {
		this.swim();
		
	}
	
	@Override
	public void swim() {
		System.out.println("This animal is swimming");
		
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
