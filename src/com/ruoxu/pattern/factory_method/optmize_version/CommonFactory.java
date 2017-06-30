package com.ruoxu.pattern.factory_method.optmize_version;
/**
 * 把nomal_version中的2个工厂实现合并
 * @author Administrator
 *
 */
public class CommonFactory implements Factory{

	@Override
	public <T extends Car> T createCar(Class<T> clazz) {
		try {
			Car car = null;
			car = (Car) Class.forName(clazz.getName()).newInstance();
			return (T) car;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
