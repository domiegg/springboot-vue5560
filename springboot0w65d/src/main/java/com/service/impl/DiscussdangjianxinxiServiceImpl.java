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


import com.dao.DiscussdangjianxinxiDao;
import com.entity.DiscussdangjianxinxiEntity;
import com.service.DiscussdangjianxinxiService;
import com.entity.vo.DiscussdangjianxinxiVO;
import com.entity.view.DiscussdangjianxinxiView;

@Service("discussdangjianxinxiService")
public class DiscussdangjianxinxiServiceImpl extends ServiceImpl<DiscussdangjianxinxiDao, DiscussdangjianxinxiEntity> implements DiscussdangjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangjianxinxiEntity> page = this.selectPage(
                new Query<DiscussdangjianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdangjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangjianxinxiEntity> wrapper) {
		  Page<DiscussdangjianxinxiView> page =new Query<DiscussdangjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangjianxinxiVO> selectListVO(Wrapper<DiscussdangjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangjianxinxiVO selectVO(Wrapper<DiscussdangjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangjianxinxiView> selectListView(Wrapper<DiscussdangjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangjianxinxiView selectView(Wrapper<DiscussdangjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
