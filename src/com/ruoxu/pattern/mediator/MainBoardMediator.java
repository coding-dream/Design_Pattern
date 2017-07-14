package com.ruoxu.pattern.mediator;

public class MainBoardMediator implements Mediator{
	private CDDevice mCdDevice;
	private CPU mCpu;
	private SoundCard mSoundCard;
	private GraphicsCard mGraphicsCard;
	
	@Override
	public void changed(Colleague colleague) {
		// 如果是光驱读取了数据
		if(colleague == mCdDevice){
			handleCD((CDDevice)colleague);
		}else if(colleague == mCpu){// 如果CPU处理完数据
			handleCPU((CPU)mCpu);
		}
	}
	// ============== set ==============
	public void setCdDevice(CDDevice cdDevice) {
		this.mCdDevice = cdDevice;
	}

	public void setCpu(CPU cpu) {
		this.mCpu = cpu;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.mSoundCard = soundCard;
	}

	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.mGraphicsCard = graphicsCard;
	}
	// ============== set ==============
	
	private void handleCD(CDDevice cdDevice) {
		mCpu.decodeData(cdDevice.read());
	}
	
	// 内部业务，private方法放到最后
	private void handleCPU(CPU cpu) {
		mSoundCard.soundPlay(cpu.getDataSound());
		mGraphicsCard.videoPlay(cpu.getDataVideo());
	}
}
