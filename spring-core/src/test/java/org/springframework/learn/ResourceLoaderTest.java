package org.springframework.learn;

import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * <p>Description:  </p>
 *
 * @author yuanxu
 * @email "mailto:yuanxu@fkhwl.com"
 * @date 2021.07.12 17:05
 */
public class ResourceLoaderTest {
	@Test
	public void loadResource(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource fileResource1 = resourceLoader.getResource("H://test.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));
	}
}
