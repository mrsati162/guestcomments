package com.guestbook.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Table(name="guestbook")
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class GuestBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private @NonNull String guestName;
	
	private String comment;
	
	private @NonNull Date timestamp;

}
