package com.ruoxu.pattern.composite.demo;

import java.util.List;

public class File extends AbstractFile{

	public File(String name) {
		super(name);
	}

	@Override
	public void addFile(AbstractFile file) {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void rmFile(AbstractFile file) {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void print() {
		System.out.print(getName());
	}

	@Override
	public List<AbstractFile> getFiles() {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

}
