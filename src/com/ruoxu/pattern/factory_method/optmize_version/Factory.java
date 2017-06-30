package com.ruoxu.pattern.factory_method.optmize_version;

public interface Factory {
	<T extends Car> T createCar(Class<T> clazz);
}
