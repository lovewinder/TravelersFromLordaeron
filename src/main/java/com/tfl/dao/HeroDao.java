package com.tfl.dao;

import java.util.List;

import com.tfl.entity.Hero;

public interface HeroDao {

	// 查询所有hero
	public List<Hero> queryAllHero();

	// 通过名字查询hero
	public Hero queryHeroByName();

	// 通过类型查询hero
	public List<Hero> queryHeroByAttribute();

	// 通过定位查询hero
	public List<Hero> queryHeroByLocation();
}
