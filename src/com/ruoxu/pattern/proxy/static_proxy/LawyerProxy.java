package com.ruoxu.pattern.proxy.static_proxy;

/**
 * 律师(代理人)
 * 代理模式不仅可以代理一个对象，也可以代理多个对象
 * 
 */
public class LawyerProxy implements ILawsuit{
	
    private ILawsuit mILaysuit ;
    
    /**
     * 代理一个对象
     * @param iLawsuit
     */
 	public LawyerProxy(ILawsuit iLawsuit) {
 		this.mILaysuit = iLawsuit;
 	}
 	
 	/**
 	 * 根据个人资产 代理多个对象
 	 * @param totalMoney
 	 * 
 	public LawyerProxy(int totalMoney) {// 代理模式不仅可以代理一个对象，也可以代理多个对象
 		if(totalMoney > 10000){
 			mILaysuit = new PoorMan();
 		}else{
 			mILaysuit = new WealthMan();
 		}
 	}
 	 */

	@Override
	public void submit() {
		System.out.print("【proxy===");
		mILaysuit.submit();
		System.out.println("===】");
	}

	@Override
	public void burden() {
		System.out.print("【proxy===");
		mILaysuit.burden();
		System.out.println("===】");
	}

	@Override
	public void defend() {
		System.out.print("【proxy===");
		mILaysuit.defend();
		System.out.println("===】");
	}

	@Override
	public void finish() {
		System.out.print("【proxy===");
		mILaysuit.finish();
		System.out.println("===】");
	}
	
}
