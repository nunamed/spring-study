package net.biancheng;

import java.util.*;

public class JavaCollection {
	List manList;
	Set manSet;
	Map manMap;
	Properties manProp;
	
	public void setManList(List manList) {
		this.manList=manList;
	}
	public List getManList() {
		System.out.println("List Elements:"+manList);
		return manList;
	}
	public Set getManSet() {
		System.out.println("Set Elements:"+manSet);
		return manSet;
	}
	public void setManSet(Set manSet) {
		this.manSet = manSet;
	}
	public Map getManMap() {
		System.out.println("Map Elements:"+manMap);
		return manMap;
	}
	public void setManMap(Map manMap) {
		this.manMap = manMap;
	}
	public Properties getManProp() {
		System.out.println("Property Elements:"+manProp);
		return manProp;
	}
	public void setManProp(Properties manProp) {
		this.manProp = manProp;
	}
	
}
