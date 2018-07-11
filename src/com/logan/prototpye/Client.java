package com.logan.prototpye;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式
 * @author MRH
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {

		JiJiao jiao = new JiJiao();
		jiao.setName("Duo");
		
		Sheep sheep = new Sheep("多莉绵羊", new Date(10000000L),jiao);
		// 浅克隆
		//Sheep sheep2 = (Sheep) sheep.clone();
		
		Sheep sheep2 = (Sheep) deepClone(sheep);
		
		
		System.out.println(sheep);
		sheep.getJijiao().setName("謝謝謝謝");
		System.out.println(sheep);
		
		System.out.println(sheep2);

	}
	
	/**
	 * 深克隆
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static Object deepClone(Object obj) throws Exception{
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(obj);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return ois.readObject();
	}
	
}
