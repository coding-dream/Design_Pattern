package com.ruoxu.pattern.composite.safe;
/**
 * 叶子结点
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
	}

}
