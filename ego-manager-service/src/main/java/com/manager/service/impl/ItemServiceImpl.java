package com.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.mapping.ItemMapper;
import com.manager.pojo.Item;
import com.manager.service.ItemService;



@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public Item getItemById(long itemId) {
		// Item item = itemMapper.selectByPrimaryKey(itemId);
		Item item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

}

