package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
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
	public void eat(Eatable eatable) {
		if(eatable instanceof Vegetable) {
			this.eat((Vegetable)eatable);
		}else {
			System.out.println("This animal can noteat vegetables");
		}
		
	}
	
	@Override
	public void eatVegetable(Vegetable vegetable) {
		
	}
}
