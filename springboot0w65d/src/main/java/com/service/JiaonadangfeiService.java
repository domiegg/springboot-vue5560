package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaonadangfeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaonadangfeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaonadangfeiView;


/**
 * 缴纳党费
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface JiaonadangfeiService extends IService<JiaonadangfeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaonadangfeiVO> selectListVO(Wrapper<JiaonadangfeiEntity> wrapper);
   	
   	JiaonadangfeiVO selectVO(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
   	
   	List<JiaonadangfeiView> selectListView(Wrapper<JiaonadangfeiEntity> wrapper);
   	
   	JiaonadangfeiView selectView(@Param("ew") Wrapper<JiaonadangfeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaonadangfeiEntity> wrapper);
   	

}

