package com.jiantosca.api.junk

import org.junit.jupiter.api.Test

import spock.lang.Specification

class SomeCodeTest extends Specification {

	def "test equals and hashCode"() {
		
		when:
		def someCodeOne = new SomeCode("anId");
		def someCodeTwo = new SomeCode("anId");
		
		then:
		someCodeOne.equals(someCodeTwo)
		someCodeOne.hashCode() == someCodeOne.hashCode() 
		
	}
	
	def "test doSomething"() {
		
		given:
		def someCode = new SomeCode(id)
		
		when: 
		def result = someCode.doSomething()
		
		then:
		result.contains(id)
		
		where:
		id    |_
		"one" |_
		"two" |_
		
	}

}
