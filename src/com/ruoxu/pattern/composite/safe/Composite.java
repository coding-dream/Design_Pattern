package com.ruoxu.pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体枝干节点（相当于文件夹）
 */
public class Composite extends Component{
	private List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
		if(null != components){
			for(Component c: components){
				c.doSomething();
			}
		}
	}
	
	/**
	 * 添加子节点
	 */
	public void addChild(Component child){
		components.add(child);
	}
	
	/**
	 * 移除子节点
	 */
	public void removeChild(Component child){
		components.remove(child);
	}
	
	/**
	 * 获取子节点
	 */
	public Component getChild(int index){
		return components.get(index);
	}
}
