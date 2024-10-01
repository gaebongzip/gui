package com.asd.gui;

import com.asd.gui.app.db.repository.TestRepository;
import com.asd.gui.app.gui.SwingApp;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.awt.*;
@Slf4j
@SpringBootApplication
public class GuiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GuiApplication.class, args);
		/*
		ConfigurableApplicationContext ctx =  new SpringApplicationBuilder(SwingApp.class)
			.web(WebApplicationType.NONE)
			.headless(false) //We turn off the headless mode, which is suitable for server applications.
			.run(args);
		//We retrieve the Swing appication bean from the application context.
		//The invokeLater() method places the application on the Swing Event Queue.
		//It is used to ensure that all UI updates are concurrency-safe.
		//In other words, it is to prevent GUI from hanging in certain situations.
		EventQueue.invokeLater(()->{
			SwingApp sa =  ctx.getBean(SwingApp.class);
			log.debug("{}", "===EventQueue.invokeLater");
			sa.setVisible(true);
		});
		*/
	}
}
