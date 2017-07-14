package com.ruoxu.pattern.memento;
/**
 * 备忘录模式
 * 定义：在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样，以后就可将该对象恢复到原先保存的状态。
 * 使用场景：
 * 1.需要保存一个对象在某一时刻的状态或部分状态
 * 2.如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问其内部状态，通过中间对象可以间接访问其内部状态。
 */
public class Demo {
	public static void main(String[] args) {
		CF cf = new CF();
		cf.play();
		
		// 游戏存档
		Caretaker caretaker = new Caretaker();
		caretaker.archive(cf.createMemoto());
		
		cf.quit();
		
		// 恢复游戏 
		CF newGame = new CF();
		newGame.restore(caretaker.getMemoto());
		
	}
}
