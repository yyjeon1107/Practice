package kr.or.connect.reservation.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.ProductImage;

import static kr.or.connect.reservation.dao.ProductImageDaoSqls.*;

@Repository
public class ProductImageDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<ProductImage> rowMapper = BeanPropertyRowMapper.newInstance(ProductImage.class);

	public ProductImageDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<ProductImage> selectByProductId(Integer productId) {
		Map<String, Integer> params = new HashMap<>();
		params.put("productId", productId);
		return jdbc.query(SELECT_BY_PRODUCTID, params, rowMapper);
	}
}
