package cz.xtf.junit5.config;

import cz.xtf.core.config.XTFConfig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JUnitConfig {
	private static final String CLEAN_OPENSHIFT = "xtf.junit.clean_openshift";
	private static final String USED_IMAGES = "xtf.junit.used_images";

	public static boolean cleanOpenShift() {
		return Boolean.valueOf(XTFConfig.get(CLEAN_OPENSHIFT, "false"));
	}

	public static List<String> usedImages() {
		final String images = XTFConfig.get(USED_IMAGES);
		if(images != null) {
			return Arrays.asList(images.split(","));
		} else {
			return Collections.emptyList();
		}
	}
}
