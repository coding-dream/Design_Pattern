package com.ruoxu.pattern.flyweight;
/**
 * 享元模式（是对象池的一种实现，flyweight轻量级）
 * 享元模式尽可能减少内存使用量
 * 
 * 定义：使用共享对象可有效地支持大量的细粒度的对象。
 *
 * 使用场景：
 * 1.系统中存在大量相似对象
 * 2.细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。享元模式通过消息吃的形式有效地减少了重复对象的存在。它通过内部状态标示某个种类的对象，外部程序根据这个不会变化的内部状态从消息池中取出对象，使得同一类对象可以被复用，避免大量重复对象。（这句话结合例子即可理解）
 * 3.需要缓冲池的场景
 */
public class Demo {
	public static void main(String[] args) {
		Ticket ticket_new1 = TicketFactory.getTicket("北京", "上海");
		ticket_new1.showTicketInfo("上铺");
		
		Ticket ticket_new2 = TicketFactory.getTicket("北京", "杭州");
		ticket_new2.showTicketInfo("下铺");
		
		Ticket ticket_cache1 = TicketFactory.getTicket("北京", "上海");
		ticket_cache1.showTicketInfo("下铺");
		
		Ticket ticket_cache2 = TicketFactory.getTicket("北京", "杭州");
		ticket_cache2.showTicketInfo("下铺");
		
	}
}
