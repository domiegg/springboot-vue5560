package com.entity.view;

import com.entity.DiscussdangjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党建信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@TableName("discussdangjianxinxi")
public class DiscussdangjianxinxiView  extends DiscussdangjianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdangjianxinxiView(){
	}
 
 	public DiscussdangjianxinxiView(DiscussdangjianxinxiEntity discussdangjianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussdangjianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
