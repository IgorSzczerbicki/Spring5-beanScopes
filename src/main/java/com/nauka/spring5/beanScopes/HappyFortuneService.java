package com.nauka.spring5.beanScopes;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Szcz�liwa wr�ba";
	}
}