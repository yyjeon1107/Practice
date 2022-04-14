package kr.or.connect.reservation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.or.connect.reservation.dao.PromotionDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PromotionsService {

	private final PromotionDao promotionDao;
	
	public Map<String, Object> getPromotions() {
		
		Map<String, Object> promotions = new HashMap<String, Object>();
		promotions.put("size", promotionDao.selectCount());
		promotions.put("items", promotionDao.getPromotions());
		return promotions;
	}
}
