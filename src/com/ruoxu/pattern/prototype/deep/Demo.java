package com.ruoxu.pattern.prototype.deep;

/**
 * 从浅拷贝->深拷贝的变化就可以看出，只需把User中是【引用类型的成员变量】也实现Cloneable接口，
 * 重写clone方法，User的clone方法增加user.address = this.address.clone();即可。
 * 无论是User还是Address，实现clone方法都不需要管基本类型的数据和String类型，它们会自动拷贝。
 * 
 * @author Limitless
 *
 */
public class Demo {
	public static void main(String[] args) {
		User origin = new User("李明",20,new Address("北京", "崇阳市", "柳州路"));
		System.out.println(origin);
		
		User clone = origin.clone();
		System.out.println(clone);
		
		clone.setName("东东");
		clone.setAge(80);
		clone.getAddress().setCity("上海");
		clone.getAddress().setDistrict("闵行区");
		clone.getAddress().setStreet("莘庄");
		
//		clone.setAddress(new Address("上海", "闵行区", "莘庄")); // 注意这种方式设置是错的，setAddress是一个新的对象，所以不影响origin
		System.out.println(clone);
		
		System.out.println(origin);
		
//		从运行结果可以看出，clone的Address改变后，origin的Address 并不会跟着改变(深拷贝)。
		
	}
}
