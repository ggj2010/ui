package com.gaoguangjin.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaoguangjin.JdbcTemplateUtils;

@Controller
public class SurverUserController {
	
	@RequestMapping(value = "diaocha/save", method = { RequestMethod.POST })
	public String saveForm(SurveyUser surveyUser) {
		String sql = "insert into diaocha_user(sex,age,degrees,job,giveup,giveupcontent,giveupreson,useapp,not_use_app_reason,supervise,daka,stranger,money) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		JdbcTemplateUtils.jdbcTemplate().update(sql, surveyUser.getSex(), surveyUser.getAge(), surveyUser.getDegrees(), surveyUser.getJob(),
				surveyUser.getGiveup(), surveyUser.getGiveupcontent(), surveyUser.getGiveupreson(), surveyUser.getUseapp(),
				surveyUser.getNot_use_app_reason(), surveyUser.getSupervise(), surveyUser.getDaka(), surveyUser.getStranger(), surveyUser.getMoney());
		return "redirect:/thanks.html";
	}
	
}
