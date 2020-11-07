package com.tactfactory.javaniveau2.tps.tp1;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tactfactory.javaniveau2.tps.tp1.entities.Animal;
import com.tactfactory.javaniveau2.tps.tp1.entities.Caribou;
import com.tactfactory.javaniveau2.tps.tp1.entities.Cat;
import com.tactfactory.javaniveau2.tps.tp1.entities.Deer;
import com.tactfactory.javaniveau2.tps.tp1.entities.Dog;
import com.tactfactory.javaniveau2.tps.tp1.entities.Dolphin;
import com.tactfactory.javaniveau2.tps.tp1.entities.Hyena;
import com.tactfactory.javaniveau2.tps.tp1.entities.Turtle;
import com.tactfactory.javaniveau2.tps.tp1.entities.Vegetable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.utils.StringUtils;
public class Tp1 {

	  public static void main(String[] args) throws InstantiationException, IllegalAccessException,
	      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

	    List<Class<?>> types = new ArrayList<Class<?>>();
	    types.add(Caribou.class);
	    types.add(Cat.class);
	    types.add(Deer.class);
	    types.add(Dog.class);
	    types.add(Dolphin.class);
	    types.add(Hyena.class);
	    types.add(Turtle.class);

	    List<Animal> animals = new ArrayList<Animal>();

	    long id = 0;
	    for (Class<?> klazz : types) {
	      Random rand = new Random();
	      int loop = rand.nextInt(10);
	      for (int i = 0; i < loop; i++) {
	        id++;
	        animals.add((Animal) klazz.getConstructor(Long.class, String.class, Float.class, Float.class).newInstance(id,
	            StringUtils.randomString(2, 20), rand.nextFloat(), rand.nextFloat()));
	      }
	    }

	    Vegetable myVegetable = new Vegetable(1L, "herbe");
	    Animal myAnimal = new Animal() {

	      @Override
	      public void move() {
	      }

	      @Override
	      public void eat(Eatable eatable) {
	      }

	      {
	        setName("viande");
	      }
	    };

	    for (Animal animal : animals) {
	      animal.move();
	      animal.eat(myVegetable);
	      animal.eat(myAnimal);
	    }
	  }

	}