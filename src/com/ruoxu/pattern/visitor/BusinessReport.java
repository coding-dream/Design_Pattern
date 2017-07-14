package com.ruoxu.pattern.visitor;

import java.util.LinkedList;
import java.util.List;
/**
 * 定义当中所提到的 【对象结构】，对象结构是一个抽象描述，它内部管理了元素集合，并且可以迭代这些元素供访问者访问。
 */
public class BusinessReport {
	private List<Staff> mStaffs = new LinkedList<>();
	
	public BusinessReport(){
		mStaffs.add(new Manager("王经理"));
		mStaffs.add(new Engineer("工程师-Xiaoming"));
		mStaffs.add(new Engineer("工程师-LiHui"));
		mStaffs.add(new Engineer("工程师-Jack"));
		mStaffs.add(new Engineer("工程师-SunMi"));
	}
	
	public void showReport(Visitor visitor){
		for(Staff staff:mStaffs){
			staff.accept(visitor);
		}
	}
}
