package com.logan.composite;

public class Client {
	
	public static void main(String[] args) {
		//创建树形结构
		Folder folder = new Folder("游戏文件件");
		AbstractFile file1 = new ImageFile("xiaoma.jpg");
		AbstractFile file2 = new ImageFile("xiaoma2.jpg");
		folder.add(file1);
		folder.add(file2);
		Folder folder2 = new Folder("游戏文件件2");
		AbstractFile file12 = new ImageFile("zxc.jpg");
		AbstractFile file22 = new ImageFile("zxc22.jpg");
		folder2.add(file12);
		folder2.add(file22);
		folder.add(folder2);
		
		folder.killVirus();
	}
}
