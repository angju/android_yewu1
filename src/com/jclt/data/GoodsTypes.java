package com.jclt.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;

public class GoodsTypes {
	private Map<String, Map<String, List<Goods>>> types;
		
	public void ConstructFromJson(JSONArray jsonlist) {
	}
		
	public List<String> GetFirstTypeList() {
		List<String> list = new ArrayList<String>();
		Set<String> key = types.keySet();
		for (Iterator it=key.iterator(); it.hasNext(); ) {			
			list.add((String)it.next());
		}
		return list;
	}
	public List<String> GetSecondTypeList(String fisrtType) {		
		List<String> list = new ArrayList<String>();
		Map<String, List<Goods>> map = types.get(fisrtType);
		Set<String> key = types.keySet();
		for (Iterator it=key.iterator(); it.hasNext(); ) {
			list.add((String)it.next());
		}
		return list;
	}
	public List<Goods> GetGoodsList(String firstType, String secondType) {
		Map<String, List<Goods>> maps = types.get(firstType);
		List<Goods> list = maps.get(secondType);
		return list;
	}
}
