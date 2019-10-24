package com.orderportal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orderportal.entity.Item;
import com.orderportal.service.ItemService;
import io.swagger.annotations.Api;

/**
 * This class contains all the end point of the item related operations.
 */
@Api
@RestController
@RequestMapping("/item")
public class ItemContoller {
	
	@Autowired
	ItemService itemService ;
	
    /**
	 * End point to fetch all items.
	 *  @return {@link List<Item>}
	 */
	
	@GetMapping("/all")
	  public List<Item> getAllItem() {
	        return itemService.getAllItem();
	       
	}
	
	/**
	 * End point to fetch item by Item Id.
	 *  @return {@link Item}
	 */
	
	@GetMapping("/{id}")
	  public Item getItem(@PathVariable("id") Long id ) {
		
	      return itemService.getItem(id);
		
	}
	
	/**
	 * End point to insert item.
	 * 
	 */
	
	@PostMapping("/insert")
	  public void addItem(@RequestBody Item item) {
	      itemService.addItem(item);
	}
	

}
