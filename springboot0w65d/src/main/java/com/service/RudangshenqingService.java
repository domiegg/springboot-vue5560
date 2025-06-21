package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RudangshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RudangshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RudangshenqingView;


/**
 * 入党申请
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface RudangshenqingService extends IService<RudangshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RudangshenqingVO> selectListVO(Wrapper<RudangshenqingEntity> wrapper);
   	
   	RudangshenqingVO selectVO(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
   	
   	List<RudangshenqingView> selectListView(Wrapper<RudangshenqingEntity> wrapper);
   	
   	RudangshenqingView selectView(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RudangshenqingEntity> wrapper);
   	

}

