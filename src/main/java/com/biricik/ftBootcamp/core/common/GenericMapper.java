package com.biricik.ftBootcamp.core.common;

import java.util.List;

import org.mapstruct.Mapping;

public interface GenericMapper <Request,Entity,Response> {

	/**
	 * entity to response
	 * 
	 * @param entity
	 * @return response
	 */
	Response toResponse(Entity entity);
	
	/**
	 * list of entities to list of responses
	 * 
	 * @param entities
	 * @return List of response
	 */
	@Mapping(source = "enitites.id", target = "id" )
	List<Response> toResponses(List<Entity> entities);
	
	
	/**
	 * request to entity
	 * 
	 * @param request
	 * @return entity
	 */
	Entity toEntity(Request request);
	
	
	
}

