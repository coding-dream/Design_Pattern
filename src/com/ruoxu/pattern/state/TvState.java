package com.ruoxu.pattern.state;

public interface TvState {
	void prevChannel();// 上一频道
	void nextChannel();// 下一频道
	void turnUp();// 调高音量
	void turnDown();// 调低音量
}
