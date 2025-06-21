package com.dao;

import com.entity.ShenqingzhuanchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingzhuanchuVO;
import com.entity.view.ShenqingzhuanchuView;


/**
 * 申请转出
 * 
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface ShenqingzhuanchuDao extends BaseMapper<ShenqingzhuanchuEntity> {
	
	List<ShenqingzhuanchuVO> selectListVO(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
	
	ShenqingzhuanchuVO selectVO(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
	
	List<ShenqingzhuanchuView> selectListView(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);

	List<ShenqingzhuanchuView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
	
	ShenqingzhuanchuView selectView(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
	

}
