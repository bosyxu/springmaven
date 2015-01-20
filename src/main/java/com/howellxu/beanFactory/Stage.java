package com.howellxu.beanFactory;
/**
 * 单例类的创建
 * @author p_jdhaohxu
 *
 */
public class Stage {
	private int i;
	private Stage(){   //私有的构造方法
	}
	
	public static class StageSingletonHolder{ //内部类，延迟加载实例，可以调用私有的构造方法
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){  //public方法，外部可以调用。
		return StageSingletonHolder.instance;
	}
	
	public void says(){
		System.out.println("count:" + i);
		i++;
	}
	
	public void setI(int i)
	{
		this.i=i;
	}
	public int getI()
	{
		return i;
	}
	
}
