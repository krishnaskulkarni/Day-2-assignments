
class TeleVision{
	
	boolean state;
	int currentVolume;
	int currentChannel;
	
	public TeleVision(boolean state,int currentVolume, int currentChannel){
		this.state = state;
		this.currentVolume = currentVolume;
		this.currentChannel = currentChannel;
	}
	public int increaseVolume(int increase){
		this.currentVolume = this.currentVolume + increase;	
		return this.currentVolume;
	}
	public int decreaseVolume(int decrease){
		if(this.currentVolume >= decrease){	
			this.currentVolume = this.currentVolume -decrease;
			return this.currentVolume;
		}else	
			this.currentVolume=0;
			return this.currentVolume;
	}
	public int changeChannel(int channel){
		this.currentChannel = channel;	
		return this.currentChannel;
	}
	public boolean onOff(boolean state){
		this.state = state;
		return this.state;
	}	
}