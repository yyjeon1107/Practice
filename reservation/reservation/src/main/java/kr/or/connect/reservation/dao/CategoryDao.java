package kr.or.connect.reservation.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Category;

import static kr.or.connect.reservation.dao.CategoryDaoSqls.*;

@Repository
public class CategoryDao {
    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<Category> rowMapper = BeanPropertyRowMapper.newInstance(Category.class);

    public CategoryDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public int getCountAll() {
        return jdbc.queryForObject(SELECT_COUNT_ALL, Collections.emptyMap(), int.class);
    }

    public int getCountById(Integer id) {
    	Map<String, Integer> params = new HashMap<>();
    	params.put("id", id);
        return jdbc.queryForObject(SELECT_COUNT_BY_ID, params, int.class);
    }
    
    public List<Category> getCategories() {
        return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
    }
}
