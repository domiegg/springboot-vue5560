package com.entity.model;

import com.entity.DangzhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 党支部
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public class DangzhibuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 党支部详情
	 */
	
	private String dangzhibuxiangqing;
		
	/**
	 * 党支部地址
	 */
	
	private String dangzhibudizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：党支部详情
	 */
	 
	public void setDangzhibuxiangqing(String dangzhibuxiangqing) {
		this.dangzhibuxiangqing = dangzhibuxiangqing;
	}
	
	/**
	 * 获取：党支部详情
	 */
	public String getDangzhibuxiangqing() {
		return dangzhibuxiangqing;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
