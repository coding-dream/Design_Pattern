package com.ruoxu.pattern.composite.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFile { // 文件夹或者文件
	private String name;
	protected List<AbstractFile> files = new ArrayList<>();
	
	public AbstractFile(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public abstract void addFile(AbstractFile file);

	public abstract void rmFile(AbstractFile file);
	
	public abstract void clear();
	
	public abstract void print();

	public abstract List<AbstractFile> getFiles();
}
