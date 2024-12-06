package com.gn.study.controllre;

import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Pizza;

public class Run {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		
//		Parent p = new Parent();
//		System.out.println(p.getA());
//		p.getA();
//		Child c = new Child();

		Juice j = new Juice("트로피칼", 500,"용과");
		//j.printInfo();
		j.juiceInfo(); // super.으로 부모클래스에서 호출함
		Pizza p = new Pizza();
		p.printReaction();
	
		Flower f1 = new Flower("장미", "빨간색");
		Flower f2 = new Flower("장미", "빨간색");
		
		if(f1.equals(f2)) {
			System.out.println("같다.");
		}else {
			System.out.println("x");
		}
		
		System.out.println(f1);
		
		
	}

}
