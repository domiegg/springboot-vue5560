package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingzhuanchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingzhuanchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingzhuanchuView;


/**
 * 申请转出
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface ShenqingzhuanchuService extends IService<ShenqingzhuanchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingzhuanchuVO> selectListVO(Wrapper<ShenqingzhuanchuEntity> wrapper);
   	
   	ShenqingzhuanchuVO selectVO(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
   	
   	List<ShenqingzhuanchuView> selectListView(Wrapper<ShenqingzhuanchuEntity> wrapper);
   	
   	ShenqingzhuanchuView selectView(@Param("ew") Wrapper<ShenqingzhuanchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingzhuanchuEntity> wrapper);
   	

}

