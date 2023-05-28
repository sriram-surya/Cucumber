package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	public void jvmReport(String jsonpath) {
		File f = new File(("user.dir")+"\\target\\report");
		
		Configuration c = new Configuration(f, jsonpath);
		c.addClassifications("platform", "windows");
		c.addClassifications("browser", "Chrome");
		c.addClassifications("version", "101.001.02");
		c.addClassifications("Windows version", "10");
		
		List li = new ArrayList<String>();
		li.add(jsonpath);
		
	ReportBuilder r = new ReportBuilder(li, c);
	r.generateReports();
	}
}
