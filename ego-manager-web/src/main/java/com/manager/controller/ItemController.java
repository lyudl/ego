package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.pojo.Item;
import com.manager.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
		
		@Autowired
		private ItemService itemService;
		
		@RequestMapping("/{itemId}")
		@ResponseBody
		public Item getItemById(@PathVariable Long itemId) {
			Item Item = itemService.getItemById(itemId);
			System.out.println("ItemController.getItemById()");
			return Item;
		}

}
