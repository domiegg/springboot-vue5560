package com.entity.view;

import com.entity.JiaonadangfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缴纳党费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@TableName("jiaonadangfei")
public class JiaonadangfeiView  extends JiaonadangfeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaonadangfeiView(){
	}
 
 	public JiaonadangfeiView(JiaonadangfeiEntity jiaonadangfeiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaonadangfeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
