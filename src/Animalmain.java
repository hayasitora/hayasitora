package Animalmain;

public class Animalmain {

	public static void main(String[] args) {
	AnimalAction a=new AnimalAction();
	Dog d=new Dog();
	d.name="碍酒瘤";
	a.action(d);
	
	System.out.println("-----------");
	Cat c=new Cat();
	c.name="绊成捞";
	a.action(c);
	}

}
class Animal{
	protected String name;
	public void cry() {
		System.out.println(name+"啊 家府辰促.");
	}
}
class Dog extends Animal
{
	public void cry() {
		super.cry();
		System.out.println("啃,啃,构,啃");
	}
	public void run() {
		System.out.println(name+"啊 囤促");
	}
}
class Cat extends Animal
{
	public void cry() {
		super.cry();
		System.out.println("局克,局克 具捞,局克");
	}
	public void grooming() {
		System.out.println("弊风怪阑 茄促");
	}
}
class AnimalAction {
	void action(Animal animal) {
		animal.cry();
		if(animal instanceof Dog) {
			((Dog)animal).run();
		}else if(animal instanceof Cat) {
			((Cat)animal).grooming();
		}
	}
}