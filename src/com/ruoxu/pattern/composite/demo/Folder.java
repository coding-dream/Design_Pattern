package com.ruoxu.pattern.composite.demo;

import java.util.Iterator;
import java.util.List;

public class Folder extends AbstractFile{

	public Folder(String name) {
		super(name);
	}

	@Override
	public void addFile(AbstractFile file) {
		files.add(file);
	}

	@Override
	public void rmFile(AbstractFile file) {
		files.remove(file);
	}

	@Override
	public void clear() {
		files.clear();
	}

	@Override
	public void print() {
		System.out.print(getName() + "(" );
		
		Iterator<AbstractFile> iterator = files.iterator();
		while(iterator.hasNext()){
			AbstractFile file = iterator.next();
			file.print();
			if(iterator.hasNext()){
				System.out.print(", "); // 如果当前元素有下一个，加个逗号。
			}
		}
		System.out.print(")" );
	}

	@Override
	public List<AbstractFile> getFiles() {
		return files;
	}
}
