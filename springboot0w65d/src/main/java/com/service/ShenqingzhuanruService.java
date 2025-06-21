package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingzhuanruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingzhuanruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingzhuanruView;


/**
 * 申请转入
 *
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
public interface ShenqingzhuanruService extends IService<ShenqingzhuanruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingzhuanruVO> selectListVO(Wrapper<ShenqingzhuanruEntity> wrapper);
   	
   	ShenqingzhuanruVO selectVO(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
   	
   	List<ShenqingzhuanruView> selectListView(Wrapper<ShenqingzhuanruEntity> wrapper);
   	
   	ShenqingzhuanruView selectView(@Param("ew") Wrapper<ShenqingzhuanruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingzhuanruEntity> wrapper);
   	

}

