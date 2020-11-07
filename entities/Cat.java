package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
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
	public void eatVegetable(Vegetable vegetable) {
		
	}

	
	@Override
	public void eat(Eatable eatable) {
		if(eatable instanceof Vegetable) {
			System.out.println("This animal can and is eating vegetables");
		}else if(eatable instanceof Animal) {
			System.out.println("This animal can and is eating other animals");
		}
		
	}
}
