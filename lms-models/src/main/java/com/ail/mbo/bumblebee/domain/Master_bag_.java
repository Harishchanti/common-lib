package com.ail.mbo.bumblebee.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import org.joda.time.DateTime;

@StaticMetamodel(Master_bag.class)
public class Master_bag_ {
	
	public static volatile SingularAttribute<Master_bag, String> code;
	public static volatile SingularAttribute<Master_bag, Long> id;
	public static volatile SingularAttribute<Master_bag, Courier> courier;
	public static volatile SingularAttribute<Master_bag, DateTime> creationTime;
	public static volatile SingularAttribute<Master_bag, DateTime> handoverTime;
	
}
