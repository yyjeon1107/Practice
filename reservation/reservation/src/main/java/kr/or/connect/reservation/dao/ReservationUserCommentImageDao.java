package kr.or.connect.reservation.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.ReservationUserCommentImage;

import static kr.or.connect.reservation.dao.ReservationUserCommentImageDaoSqls.*;

@Repository
public class ReservationUserCommentImageDao {
    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<ReservationUserCommentImage> rowMapper = BeanPropertyRowMapper.newInstance(ReservationUserCommentImage.class);

    public ReservationUserCommentImageDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }
    
    public List<ReservationUserCommentImage> selectByReservationInfoId(Integer reservationInfoId) {
    	Map<String, Integer> params = new HashMap<>();
    	params.put("reservationInfoId", reservationInfoId);
    	return jdbc.query(SELECT_BY_RESERVATIONINFOID, params, rowMapper);
    }
}
