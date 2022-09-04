package com.biricik.ftBootcamp.service.interfaces;

import java.util.List;

import com.biricik.ftBootcamp.service.dtos.CommentDto;
import com.biricik.ftBootcamp.service.requests.FindByEntityIdAndstartDateBetweenEndDateRequest;

public interface CommentService {

	List<CommentDto> findByProductId(int productId);

	List<CommentDto> findByProductIdAndstartDateBetweenEndDate(
			FindByEntityIdAndstartDateBetweenEndDateRequest findByProductIdAndstartDateBetweenEndDateRequest);

	List<CommentDto> findByUserId(int userId);

	List<CommentDto> findByUserIdAndstartDateBetweenEndDate(
			FindByEntityIdAndstartDateBetweenEndDateRequest findByEntityIdAndstartDateBetweenEndDateRequest);
}
