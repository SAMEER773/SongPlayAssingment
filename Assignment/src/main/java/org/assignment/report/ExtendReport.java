package org.assignment.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtendReport {

	private ExtendReport() {

	}

	private static ExtentReports extentReports;
	//public static ExtentTest createTest;

	public static void initReports() {

		if (Objects.isNull(extentReports)) {
			extentReports = new ExtentReports();
			ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("index.html");
			extentReports.attachReporter(extentSparkReporter);

			extentSparkReporter.config().setTheme(Theme.DARK);
			extentSparkReporter.config().setDocumentTitle("SongPlay test Report");
			extentSparkReporter.config().setReportName("Song play test");
		}
	}

	public static void flushReports() {

		if (Objects.nonNull(extentReports)) {
			extentReports.flush();

			try {
				Desktop.getDesktop().browse(new File("index.html").toURI());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void createTest(String testcaseName) {
		//ExtentTest createTest = extentReports.createTest(testcaseName);
		ExtentManager.setExtentTest(extentReports.createTest(testcaseName));
	}

}
