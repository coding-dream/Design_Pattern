package com.ruoxu.pattern.mediator;
/**
 * 中介者模式
 * 定义：中介者模式将多对多的相互作用转换为一对多的相互作用。
 * 
 * 使用场景：当对象之间的交互操作很多且每个对象的行为操作都依赖彼此时，为防止在修改一个对象的行为时，同时涉及修改很多其他对象的行为，可采用中介者模式来解决紧耦合问题。
 * 该模式将对象之间的多对多关系变成一对多关系，中介者对象将系统从网状结构变成以调停者为中心的星状结构，达到降低系统的复杂性，提高可扩展性的作用。
 * 
 * 总结：面向对象的世界里，一个类必然会与其他类产生依赖关系，如果这种依赖关系如网状般错综复杂，那么必然会影响我们代码逻辑以及执行效率，适当使用中介者模式可以对这种依赖关系
 * 进行解耦使逻辑结构清晰。
 */
public class Demo {
	public static void main(String[] args) {
		// 构造主板对象
		MainBoardMediator mediator = new MainBoardMediator();
		
		// 分别构造各个零部件
		CDDevice cdDevice = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard graphicsCard = new GraphicsCard(mediator);
		SoundCard soundCard = new SoundCard(mediator);
		
		// 将各个零部件安装到主板
		mediator.setCdDevice(cdDevice);;
		mediator.setCpu(cpu);
		mediator.setGraphicsCard(graphicsCard);
		mediator.setSoundCard(soundCard);
		
		// 完成后就可以放片了
		cdDevice.load();
		
	}
}
