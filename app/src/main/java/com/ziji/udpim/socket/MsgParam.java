package com.ziji.udpim.socket;

import com.ziji.udpim.data.MsgEntity;

public class MsgParam {
	
	private MsgEntity mMsgEntity;
	
	public void setMsgEntity(MsgEntity entity){
		this.mMsgEntity = entity;
	}
	
	public MsgEntity getMsgEntity(){
		return mMsgEntity;
	}

}
