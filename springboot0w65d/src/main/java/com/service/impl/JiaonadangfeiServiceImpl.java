package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaonadangfeiDao;
import com.entity.JiaonadangfeiEntity;
import com.service.JiaonadangfeiService;
import com.entity.vo.JiaonadangfeiVO;
import com.entity.view.JiaonadangfeiView;

@Service("jiaonadangfeiService")
public class JiaonadangfeiServiceImpl extends ServiceImpl<JiaonadangfeiDao, JiaonadangfeiEntity> implements JiaonadangfeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaonadangfeiEntity> page = this.selectPage(
                new Query<JiaonadangfeiEntity>(params).getPage(),
                new EntityWrapper<JiaonadangfeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaonadangfeiEntity> wrapper) {
		  Page<JiaonadangfeiView> page =new Query<JiaonadangfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaonadangfeiVO> selectListVO(Wrapper<JiaonadangfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaonadangfeiVO selectVO(Wrapper<JiaonadangfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaonadangfeiView> selectListView(Wrapper<JiaonadangfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaonadangfeiView selectView(Wrapper<JiaonadangfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
