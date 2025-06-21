package com.dao;

import com.entity.JiaonadangfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaonadangfeiVO;
import com.entity.view.JiaonadangfeiView;


/**
 * 缴纳党费
 * 
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface JiaonadangfeiDao extends BaseMapper<JiaonadangfeiEntity> {
	
	List<JiaonadangfeiVO> selectListVO(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
	
	JiaonadangfeiVO selectVO(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
	
	List<JiaonadangfeiView> selectListView(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);

	List<JiaonadangfeiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
	
	JiaonadangfeiView selectView(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
	

}
