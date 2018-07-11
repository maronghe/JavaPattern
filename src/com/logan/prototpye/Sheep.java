package com.logan.prototpye;

import java.io.Serializable;
import java.util.Date;

/**
 *  ¿É¿ËÂ¡µÄÃàÑò
 * @author MRH
 *
 */
public class Sheep implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Date birthday;
	private JiJiao jijiao;
	public Sheep() {
	}


	public JiJiao getJijiao() {
		return jijiao;
	}



	public void setJijiao(JiJiao jijiao) {
		this.jijiao = jijiao;
	}



	public Sheep(String name, Date birthday,JiJiao jijiao) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.jijiao = jijiao;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object o = super.clone();
		return o;
	}


	@Override
	public String toString() {
		return "Sheep [name=" + name + ", birthday=" + birthday + ", jijiao=" + jijiao.getName() + "]";
	}


}

class JiJiao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
