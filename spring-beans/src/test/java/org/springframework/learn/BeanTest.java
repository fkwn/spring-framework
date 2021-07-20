package org.springframework.learn;

import org.junit.Test;
import org.springframework.beans.factory.xml.BeansDtdResolver;

import java.io.*;

/**
 * <p>Description:  </p>
 *
 * @author yuanxu
 * @email "mailto:yuanxu@fkhwl.com"
 * @date 2021.07.20 15:45
 */
public class BeanTest {
	@Test
	public void testEntityResolver() throws IOException {
		BeansDtdResolver resolver=new BeansDtdResolver();
		resolver.resolveEntity("-//SPRING//DTD BEAN 2.0//EN","http://www.springframework.org/dtd/spring-beans.dtd");
	}
}
