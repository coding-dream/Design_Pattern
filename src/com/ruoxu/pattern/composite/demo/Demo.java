package com.ruoxu.pattern.composite.demo;

public class Demo {
	public static void main(String[] args) {
		AbstractFile disk = new Folder("F:");
		
		// F盘根目录有一个文件 test.py
		disk.addFile(new File("test.py"));
		
		// F盘下面有2个目录，Windows，Program File
		AbstractFile windowsFolder = new Folder("Windows");
		windowsFolder.addFile(new File("date.log"));
		
		AbstractFile ProgramFileFolder = new Folder("Program File");
		ProgramFileFolder.addFile(new File("java.exe"));
		
		disk.addFile(windowsFolder);
		disk.addFile(ProgramFileFolder);
		
		disk.print();
	}
}
