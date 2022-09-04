package com.biricik.ftBootcamp.service.requests;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindByEntityIdAndstartDateBetweenEndDateRequest {

	private int id;
	private Date startDate;
	private Date endDate;
}
