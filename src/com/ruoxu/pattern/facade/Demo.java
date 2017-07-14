package com.ruoxu.pattern.facade;
/**
 * 外观模式（门面模式）
 * 使用频率高，常用在SDK中。
 * 
 * 定义：要求一个子系统的外部与其内部通信必须通过一个统一的对象进行。提供一个高层次的接口，使得子系统更易于使用。
 * 总结：外观模式就是统一接口的封装，将子系统的逻辑，交互隐藏起来，为用户提供一个高层次的接口，使得系统更加易用，同时也对外隐藏了具体的实现，减少了用户的使用成本。
 * 缺点：外观模式没有遵循开闭原则，当业务出现变更时，可能需要直接修改外观类。
 * 
 * 使用场景：
 * 1.为一个复杂子系统提供一个简单接口。
 * 2.当你需要构建一个层次结构的子系统时，Facade模式定义子系统中每层的入口点，如果子系统之间是相互依赖的，可以让它们仅通过Facade接口进行通信，从而简化它们之间的依赖关系。
 */
public class Demo {
	public static void main(String[] args) {
		MobilePhone samsung = new MobilePhone();
		// 打电话
		samsung.dial();
		samsung.hangUp();
		
		// 拍照
		samsung.takePicture();
		samsung.closeCamera();

		// 视频通话
		samsung.videoChat();
		samsung.closeCamera();
	}
}
