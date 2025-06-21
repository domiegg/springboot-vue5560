package com.dao;

import com.entity.DiscussdangjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangjianxinxiVO;
import com.entity.view.DiscussdangjianxinxiView;


/**
 * 党建信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface DiscussdangjianxinxiDao extends BaseMapper<DiscussdangjianxinxiEntity> {
	
	List<DiscussdangjianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
	
	DiscussdangjianxinxiVO selectVO(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
	
	List<DiscussdangjianxinxiView> selectListView(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);

	List<DiscussdangjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
	
	DiscussdangjianxinxiView selectView(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
	

}
