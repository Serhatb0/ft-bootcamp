package com.biricik.ftBootcamp.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.biricik.ftBootcamp.service.dtos.CommentDto;
import com.biricik.ftBootcamp.service.interfaces.CommentService;
import com.biricik.ftBootcamp.service.requests.FindByEntityIdAndstartDateBetweenEndDateRequest;


@RestController
public class CommentController {
	
	
	private final CommentService commentService;
	
	
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}


	@GetMapping("/findByProductId/{productId}")
	public List<CommentDto> findByProductId(@PathVariable int productId){
		return commentService.findByProductId(productId);
	}
	
	
	@PostMapping("/findByProductIdAndstartDateBetweenEndDate")
	public List<CommentDto> findByProductIdAndstartDateBetweenEndDate(@RequestBody FindByEntityIdAndstartDateBetweenEndDateRequest findByEntityIdAndstartDateBetweenEndDateRequest){
		return commentService.findByProductIdAndstartDateBetweenEndDate(findByEntityIdAndstartDateBetweenEndDateRequest);
	}
	
	@GetMapping("/findByUserId/{userId}")
	public List<CommentDto> findByUserId(@PathVariable int userId){
		return commentService.findByUserId(userId);
	}
	
	@PostMapping("/findByUserIdAndstartDateBetweenEndDate")
	public List<CommentDto> findByUserIdAndstartDateBetweenEndDate(@RequestBody FindByEntityIdAndstartDateBetweenEndDateRequest findByEntityIdAndstartDateBetweenEndDateRequest){

		return commentService.findByUserIdAndstartDateBetweenEndDate(findByEntityIdAndstartDateBetweenEndDateRequest);
	
	}
	
}
