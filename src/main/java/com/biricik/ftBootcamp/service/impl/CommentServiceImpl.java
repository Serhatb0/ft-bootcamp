package com.biricik.ftBootcamp.service.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.biricik.ftBootcamp.entities.Comment;
import com.biricik.ftBootcamp.exception.CustomException;
import com.biricik.ftBootcamp.mappers.CommentMapper;
import com.biricik.ftBootcamp.repositories.CommentRepository;
import com.biricik.ftBootcamp.service.dtos.CommentDto;
import com.biricik.ftBootcamp.service.interfaces.CommentService;
import com.biricik.ftBootcamp.service.requests.FindByEntityIdAndstartDateBetweenEndDateRequest;

@Service
public class CommentServiceImpl implements CommentService{
	
	private final CommentRepository commentRepository;
	private final CommentMapper commentMapper;
	
	
	public CommentServiceImpl(CommentRepository commentRepository, CommentMapper commentMapper) {
		this.commentRepository = commentRepository;
		this.commentMapper = commentMapper;
	}



	@Override
	public List<CommentDto> findByProductId(int productId) {
		List<Comment> comments = commentRepository.findByProductId(productId);
		if(comments.isEmpty()) {
			throw new CustomException("Comment Not Found", HttpStatus.NOT_FOUND);
		}
		
		return commentMapper.toResponses(comments);
		
	}

	@Override
	public List<CommentDto> findByProductIdAndstartDateBetweenEndDate(
			FindByEntityIdAndstartDateBetweenEndDateRequest findByEntityIdAndstartDateBetweenEndDateRequest) {
		List<Comment> comments = commentRepository.findByProductIdAndstartDateBetweenEndDate(
				findByEntityIdAndstartDateBetweenEndDateRequest.getId(), 
				findByEntityIdAndstartDateBetweenEndDateRequest.getStartDate(),
				findByEntityIdAndstartDateBetweenEndDateRequest.getEndDate());

		
		if(comments.isEmpty()) {
			throw new CustomException("Comment Not Found", HttpStatus.NOT_FOUND);
		}
		
		return commentMapper.toResponses(comments);
		
		
		
	}

	@Override
	public List<CommentDto> findByUserId(int userId) {
		List<Comment> comments = commentRepository.findByUserId(userId);
		if(comments.isEmpty()) {
			throw new CustomException("Comment Not Found", HttpStatus.NOT_FOUND);
		}
		
		return commentMapper.toResponses(comments);
	}

	@Override
	public List<CommentDto> findByUserIdAndstartDateBetweenEndDate(
			FindByEntityIdAndstartDateBetweenEndDateRequest findByEntityIdAndstartDateBetweenEndDateRequest) {
		List<Comment> comments = commentRepository.findByUserIdAndstartDateBetweenEndDate(
				findByEntityIdAndstartDateBetweenEndDateRequest.getId(), 
				findByEntityIdAndstartDateBetweenEndDateRequest.getStartDate(),
				findByEntityIdAndstartDateBetweenEndDateRequest.getEndDate());
		
		if(comments.isEmpty()) {
			throw new CustomException("Comment Not Found", HttpStatus.NOT_FOUND);
		}
		
		return commentMapper.toResponses(comments);
	}

}
