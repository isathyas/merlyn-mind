package com.test.spring.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.springboot.dao.PackRepository;
import com.test.spring.springboot.vo.Pack;
import com.test.spring.springboot.vo.Product;

@Service
public class PackService {

	private Logger LOGGER = LoggerFactory.getLogger(PackService.class);

	@Autowired
	private PackRepository packageRepo;

	public boolean addPackage(Pack pack) {
		pack.setTotalPrice(getTotalPrice(pack));
		return packageRepo.addPackage(pack);
	}

	public boolean updatePackage(Pack pack) {
		pack.setTotalPrice(getTotalPrice(pack));
		return packageRepo.updatePackage(pack);
	}

	public boolean deletePackage(String id) {
		return packageRepo.deletePackage(id);
	}

	public Pack getPackage(String id) {
		return packageRepo.getPackage(id);
	}

	public List<Pack> getPackages() {
		return packageRepo.getPackages();
	}

	private float getTotalPrice(Pack pack) {
		float totalP = 0;
		if (pack != null) {
			for (Product p : pack.getProducts()) {
				totalP += p.getUsdPrice();
			}
		}
		return totalP;
	}
}
