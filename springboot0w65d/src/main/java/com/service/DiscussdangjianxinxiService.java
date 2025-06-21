package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangjianxinxiView;


/**
 * 党建信息评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface DiscussdangjianxinxiService extends IService<DiscussdangjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangjianxinxiVO> selectListVO(Wrapper<DiscussdangjianxinxiEntity> wrapper);
   	
   	DiscussdangjianxinxiVO selectVO(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
   	
   	List<DiscussdangjianxinxiView> selectListView(Wrapper<DiscussdangjianxinxiEntity> wrapper);
   	
   	DiscussdangjianxinxiView selectView(@Param("ew") Wrapper<DiscussdangjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangjianxinxiEntity> wrapper);
   	

}

