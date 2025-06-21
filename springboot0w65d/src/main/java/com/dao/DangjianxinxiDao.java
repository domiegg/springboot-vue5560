package com.dao;

import com.entity.DangjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjianxinxiVO;
import com.entity.view.DangjianxinxiView;


/**
 * 党建信息
 * 
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface DangjianxinxiDao extends BaseMapper<DangjianxinxiEntity> {
	
	List<DangjianxinxiVO> selectListVO(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
	
	DangjianxinxiVO selectVO(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
	
	List<DangjianxinxiView> selectListView(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);

	List<DangjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
	
	DangjianxinxiView selectView(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
	

}
