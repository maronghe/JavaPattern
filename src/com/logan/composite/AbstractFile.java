package com.logan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * �ļ��ӿ�
 * 
 * @author MRH
 *
 */
public interface AbstractFile {
	void killVirus();
}

/**
 * Ҷ�����
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
		System.out.println("--ͼƬ�ļ���" + this.name + ",����ɱ��");
	}

}

/**
 * Ҷ�����
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
		System.out.println("--��Ƶ�ļ���" + this.name + ",����ɱ��");
	}

}

/**
 * �������
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
		System.out.println("-�ļ��У�" + this.folderName + "����ɱ��ʼ");
		for (AbstractFile file : list) {
			file.killVirus();
		}
		System.out.println("-�ļ��У�" + this.folderName + "����ɱ����");
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
