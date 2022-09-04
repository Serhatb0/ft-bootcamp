package com.biricik.ftBootcamp.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.biricik.ftBootcamp.core.common.GenericMapper;
import com.biricik.ftBootcamp.entities.Comment;
import com.biricik.ftBootcamp.service.dtos.CommentDto;
import com.biricik.ftBootcamp.service.requests.create.CreateCommentRequest;

@Mapper(
		componentModel = "spring",
		unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CommentMapper extends GenericMapper<CreateCommentRequest,Comment, CommentDto>{

}
