package com.logan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件接口
 * 
 * @author MRH
 *
 */
public interface AbstractFile {
	void killVirus();
}

/**
 * 叶子组件
 * 
 * @author MRH
 *
 */
class ImageFile implements AbstractFile {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("--图片文件：" + this.name + ",被查杀！");
	}

}

/**
 * 叶子组件
 * 
 * @author MRH
 *
 */
class VideoFile implements AbstractFile {
	private String name;

	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("--视频文件：" + this.name + ",被查杀！");
	}

}

/**
 * 容器组件
 * 
 * @author MRH
 *
 */
class Folder implements AbstractFile {

	private String folderName;
	private List<AbstractFile> list = new ArrayList<AbstractFile>();

	public Folder(String folderName) {
		super();
		this.folderName = folderName;
	}

	@Override
	public void killVirus() {
		System.out.println("-文件夹：" + this.folderName + "，查杀开始");
		for (AbstractFile file : list) {
			file.killVirus();
		}
		System.out.println("-文件夹：" + this.folderName + "，查杀结束");
	}

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}
}
