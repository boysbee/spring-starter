package com.sample.service

import org.springframework.stereotype.Service

@Service("sampleService")
class SampleService {
	
	def hello() : String = {
		return "Hello"
	}
}