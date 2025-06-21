package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 党支部
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@TableName("dangzhibu")
public class DangzhibuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangzhibuEntity() {
		
	}
	
	public DangzhibuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 党支部名称
	 */
					
	private String dangzhibumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
