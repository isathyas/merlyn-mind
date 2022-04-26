package com.test.spring.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.test.spring.springboot.vo.Pack;

@Repository
public class PackRepository {

	private Map<String, Pack> packages = new HashMap<String, Pack>();

	public boolean addPackage(Pack pack) {
		if (packages.containsKey(pack.getId())) {
			return false;
		} else {
			packages.put(pack.getId(), pack);
			return true;
		}
	}

	public boolean updatePackage(Pack pack) {
		if (packages.containsKey(pack.getId())) {
			packages.put(pack.getId(), pack);
			return true;
		} else {
			return false;
		}
	}

	public boolean deletePackage(String id) {
		if (packages.containsKey(id)) {
			packages.remove(id);
			return true;
		} else {
			return false;
		}
	}

	public Pack getPackage(String id) {
		return packages.get(id);
	}

	public List<Pack> getPackages() {
		return new ArrayList<Pack>(packages.values());
	}
}
