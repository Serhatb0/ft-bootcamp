package com.biricik.ftBootcamp.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.biricik.ftBootcamp.core.common.GenericMapper;
import com.biricik.ftBootcamp.entities.Product;
import com.biricik.ftBootcamp.service.dtos.ProductDto;
import com.biricik.ftBootcamp.service.requests.create.CreateProductRequest;


@Mapper(
		componentModel = "spring",
		unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProductMapper extends GenericMapper<CreateProductRequest, Product, ProductDto>{

}
