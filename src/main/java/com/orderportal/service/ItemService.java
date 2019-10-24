package com.orderportal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orderportal.entity.Item;
import com.orderportal.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
    
	
	  public List<Item> getAllItem(){
		  
	      return itemRepository.findAll();
	     
	   }

	   public Item getItem(Long id) {
		  List<Item> item = itemRepository.findAll();
		   
			Item entity = new Item();
			for(int i=0;i<item.size();i++)
			{
				if(item.get(i).getItemId()==(id))
				{
					entity=item.get(i);
				}
			}
			return entity;
	   }
	
	public Item addItem(Item item){
		
		return itemRepository.save(item);	
		
	   }

}
