package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjianxinxiView;


/**
 * 党建信息
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface DangjianxinxiService extends IService<DangjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjianxinxiVO> selectListVO(Wrapper<DangjianxinxiEntity> wrapper);
   	
   	DangjianxinxiVO selectVO(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
   	
   	List<DangjianxinxiView> selectListView(Wrapper<DangjianxinxiEntity> wrapper);
   	
   	DangjianxinxiView selectView(@Param("ew") Wrapper<DangjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjianxinxiEntity> wrapper);
   	

}

