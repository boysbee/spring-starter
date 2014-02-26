package com.sample.app

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

import com.sample.service.SampleService

object SampleApp {
	
	def main( args : Array[String]) {
		val ctx = new ClassPathXmlApplicationContext("myconf.xml")
		val bean = ctx.getBean("sampleService").asInstanceOf[SampleService]

		println(bean.hello)
	}
}