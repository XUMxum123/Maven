package com.managerdao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xum.AmericaPerson;
import com.xum.ChinesePerson;

public class UserDao {
	
	private int id;
	private String name;
	private int age;
	private String province;
	private String sex;
	
	private Set<String> sets;
	private List<String> lists;
	private Map<String, String> maps;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	@Autowired(required=false)
	private AmericaPerson americaPerson;
	@Autowired(required=false)
	@Qualifier("chineseperson2")
	private ChinesePerson chinesePerson;
	
	@Override
	public String toString() {
		return "id=" + this.id +"\n" +
	           "name=" + this.name + "\n" +
			   "age=" + this.age + "\n" +
	           "province=" + this.province + "\n" +
			   "sex=" + this.sex + "\n" +
	           "americaPerson=" + this.americaPerson.sayLanguage() + "\n" +
			   "chinesePerson=" + this.chinesePerson.sayLanguage() + "\n";
	}
	
	public String println() {
		return "sets=" + this.sets.toString() + "\n" + 
			   "lists=" + this.lists.toString() + "\n" +
			   "maps=" + this.maps.toString() + "\n";
	}
	
}
