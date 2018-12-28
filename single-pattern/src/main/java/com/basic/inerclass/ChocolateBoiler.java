package com.basic.inerclass;

/**
 * 内部类SingletonHandler只有在getInstance()方法第一次调用的时候才会被加载（实现了延迟加载效果）
 * 而且其加载过程是线程安全的（实现线程安全）。内部类加载的时候只实例化了一次instance
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static class ChocolateBoilerHolder{
		private static ChocolateBoiler uniqueInstance=new ChocolateBoiler();
	}

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		return ChocolateBoilerHolder.uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
