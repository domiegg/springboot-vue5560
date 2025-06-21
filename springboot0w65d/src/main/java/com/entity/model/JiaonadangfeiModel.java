package com.entity.model;

import com.entity.JiaonadangfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴纳党费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public class JiaonadangfeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 党支部名称
	 */
	
	private String dangzhibumingcheng;
		
	/**
	 * 党支部地址
	 */
	
	private String dangzhibudizhi;
		
	/**
	 * 党费
	 */
	
	private Float dangfei;
		
	/**
	 * 提交日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：党支部名称
	 */
	 
	public void setDangzhibumingcheng(String dangzhibumingcheng) {
		this.dangzhibumingcheng = dangzhibumingcheng;
	}
	
	/**
	 * 获取：党支部名称
	 */
	public String getDangzhibumingcheng() {
		return dangzhibumingcheng;
	}
				
	
	/**
	 * 设置：党支部地址
	 */
	 
	public void setDangzhibudizhi(String dangzhibudizhi) {
		this.dangzhibudizhi = dangzhibudizhi;
	}
	
	/**
	 * 获取：党支部地址
	 */
	public String getDangzhibudizhi() {
		return dangzhibudizhi;
	}
				
	
	/**
	 * 设置：党费
	 */
	 
	public void setDangfei(Float dangfei) {
		this.dangfei = dangfei;
	}
	
	/**
	 * 获取：党费
	 */
	public Float getDangfei() {
		return dangfei;
	}
				
	
	/**
	 * 设置：提交日期
	 */
	 
	public void setTijiaoriqi(Date tijiaoriqi) {
		this.tijiaoriqi = tijiaoriqi;
	}
	
	/**
	 * 获取：提交日期
	 */
	public Date getTijiaoriqi() {
		return tijiaoriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
