package com.orderportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orderportal.entity.Item;
import com.orderportal.entity.Order;
import com.orderportal.mapper.OrderVO;
import com.orderportal.mapper.Search;
import com.orderportal.repository.ItemRepository;
import com.orderportal.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	public void addOrder(OrderVO saveOrder){
		
		List<Item> itemList = itemRepository.findAll();
		Order order = new Order();
	    order.setCustomerId(saveOrder.getCustomerId());
		    order.setItemId(saveOrder.getItemId());
		    order.setItemQuantity(saveOrder.getItemquantity());;
	    for(int i=0;i<itemList.size();i++) {
		    	if(itemList.get(i).getItemId()==saveOrder.getItemId())
		    	{
		    		order.setTotalPrice(itemList.get(i).getItemPrice()*saveOrder.getItemquantity());
		    	}
		    }
		    
		    orderRepository.save(order);
		    
	    }
	 
	
			    
		    
    
    public Order getOrderDetail(Long id) {
	     List<Order> order = orderRepository.findAll();
	        Order entity = new Order();
	        for(int i=0;i<order.size();i++)
	        {
		       if(order.get(i).getOrderId()==(id))
		      {
			    entity=order.get(i);
		      }
	        }
	         return entity;
     }



	public List<Order> searchOrder(Search search) {
		 List<Order> order = orderRepository.findAll();
		 List<Order> orderList= new ArrayList<Order>();
		 for(int i=0;i<order.size();i++)
		 {
			 if(order.get(i).getCustomerId()==search.getCustomerId()&&((order.get(i).getDate().compareTo(search.getFromDate()))>=0)&&(order.get(i).getDate().compareTo(search.getToDate())<=0))
			 {
				 orderList.add(order.get(i));
			 }
		 }
		 
		return orderList;
	}	
}
