package de.thatsich.jlp.entity;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity
@Access( AccessType.FIELD )
@NoArgsConstructor( access = AccessLevel.PACKAGE )
@RequiredArgsConstructor
@ToString
@Builder
public class City extends GeneratedIntegerIdEntity
{
	@Getter
	@Column(nullable = false, updatable = false)
	private String name;
}
