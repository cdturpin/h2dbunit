package com.aci.demo.h2dbunit.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by S6N on 6/7/2017.
 */
@Data
@NoArgsConstructor
@Embeddable
public class CharacteristicId implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(columnDefinition = "char", length = 8)
	private String entityId;

	private LocalDate effectiveDate;

	@Column(columnDefinition = "char", length = 1)
	private String longShortInd;

	public String toIdString()
	{
		return String.format("%s_%s_%s", entityId.trim(), effectiveDate, longShortInd);
	}
}
