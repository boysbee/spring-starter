package com.sample.service.test

import org.scalatest.{ FunSuite , BeforeAndAfter }

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

import com.sample.service.SampleService

class SampleServiceTest extends FunSuite with BeforeAndAfter {
	
	var service : SampleService = _
	var ctx : ApplicationContext = _

	before {
		ctx = new ClassPathXmlApplicationContext("myconf.xml")
		service = ctx.getBean("sampleService").asInstanceOf[SampleService]
	}

	test("get bean sampleService") {
		assert(service.hello != null)
	}
}
