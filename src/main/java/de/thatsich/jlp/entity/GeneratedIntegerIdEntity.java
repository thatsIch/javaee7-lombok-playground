package de.thatsich.jlp.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class GeneratedIntegerIdEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Override
	public boolean equals( final Object o )
	{
		if( this == o )
		{
			return true;
		}
		if( o == null || getClass() != o.getClass() )
		{
			return false;
		}

		final GeneratedIntegerIdEntity that = (GeneratedIntegerIdEntity) o;

		return id == that.id;
	}

	@Override
	public int hashCode()
	{
		return (int) ( id ^ ( id >>> 32 ) );
	}
}
