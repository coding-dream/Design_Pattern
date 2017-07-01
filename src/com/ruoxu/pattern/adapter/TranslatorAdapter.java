package com.ruoxu.pattern.adapter;

public class TranslatorAdapter implements Greet{
	private ChinaStudent chinaStu;
	public TranslatorAdapter(ChinaStudent chinaStudent) {
		chinaStu = chinaStudent;
	}
	
	@Override
	public void say(String content) {
		// 翻译
		String msg_cn = translate(content);
		chinaStu.sayCN(msg_cn);
		
	}

	private String translate(String content) {
		String msg = null;
		switch (content) {
		case "hello":
			msg = "你好";
			break;
		default:
			msg = "不好意思，我没听清他的话！我再问他一遍！";
			break;
		}
		return msg;
	}
}
