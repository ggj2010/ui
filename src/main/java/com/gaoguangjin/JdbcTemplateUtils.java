package com.gaoguangjin;

import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class JdbcTemplateUtils {
	
	private static JdbcTemplate jdbcTemplate;
	
	public static JdbcTemplate jdbcTemplate() {
		if (jdbcTemplate == null) {
			jdbcTemplate = createJdbcTemplate();
		}
		return jdbcTemplate;
	}
	
	private static JdbcTemplate createJdbcTemplate() {
		
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://123.56.118.135:3306/app?useUnicode=true&characterEncoding=utf-8");
		ds.setUsername("root");
		// ds.setPassword("");
		
		return new JdbcTemplate(ds);
	}
	
}
