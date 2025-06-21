package com.dao;

import com.entity.ShenqingzhuanruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingzhuanruVO;
import com.entity.view.ShenqingzhuanruView;


/**
 * 申请转入
 * 
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface ShenqingzhuanruDao extends BaseMapper<ShenqingzhuanruEntity> {
	
	List<ShenqingzhuanruVO> selectListVO(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
	
	ShenqingzhuanruVO selectVO(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
	
	List<ShenqingzhuanruView> selectListView(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);

	List<ShenqingzhuanruView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
	
	ShenqingzhuanruView selectView(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
	

}
