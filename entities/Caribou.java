package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

  public Caribou() {
    super();
  }

  public Caribou(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

	@Override
	public void move() {
		boolean result = false;
		if (move instanceof Terrestrial) {
			System.out.println("walking");
		}
		
	}
	
	@Override
	public void eat(Eatable eatable) {
		boolean result = false;
		if (eatable instanceof Herbivorus) {
			eatable = Vegetable;
			result = true;
		}
		return result;
	}
	
}
