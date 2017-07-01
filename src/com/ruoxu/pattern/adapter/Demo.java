package com.ruoxu.pattern.adapter;

/**
 * 适配器模式
 * 适配器模式分为两种:
 * 1.类适配器模式。
 * 2.对象适配器模式，
 * 其中类适配器模式虽然可以使用Java接口实现，但是却暴露了被适配器类的method(用户可能因为这样而困惑)，故这里只实现对象适配器模式。
 * 
 * 扩展:
 * Adapter的应用场景
 * 1.应用于->进行不兼容的类型转换
 * 2.应用于->输入时有无数种情况，但是输出时是统一的，可以利用Adapter返回一个统一的输出，而具体的输入留给用户处理，
 * 内部只需知道输出的是符合要求的类型即可。
 * 
 * 最典型的的案例就是Android随处可见的Adapter，如ListView中的Adapter，用户的输入的ItemView各式各样，
 * 但最终都是属于View类型，ListView只需知道getView返回的是一个View即可。
 * 
 * 此处只实现 场景1
 * 
 * @author Limitless
 *
 */
public class Demo {
	public static void main(String[] args) {
		
	}
}
