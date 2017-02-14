package de.thatsich.jlp.entity;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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
	@Basic(optional = false)
	@Column(nullable = false, updatable = false)
	@NonNull
	private String name;
}
