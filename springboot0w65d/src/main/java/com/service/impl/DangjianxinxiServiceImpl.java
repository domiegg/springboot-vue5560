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


import com.dao.DangjianxinxiDao;
import com.entity.DangjianxinxiEntity;
import com.service.DangjianxinxiService;
import com.entity.vo.DangjianxinxiVO;
import com.entity.view.DangjianxinxiView;

@Service("dangjianxinxiService")
public class DangjianxinxiServiceImpl extends ServiceImpl<DangjianxinxiDao, DangjianxinxiEntity> implements DangjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjianxinxiEntity> page = this.selectPage(
                new Query<DangjianxinxiEntity>(params).getPage(),
                new EntityWrapper<DangjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjianxinxiEntity> wrapper) {
		  Page<DangjianxinxiView> page =new Query<DangjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjianxinxiVO> selectListVO(Wrapper<DangjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjianxinxiVO selectVO(Wrapper<DangjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjianxinxiView> selectListView(Wrapper<DangjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjianxinxiView selectView(Wrapper<DangjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
