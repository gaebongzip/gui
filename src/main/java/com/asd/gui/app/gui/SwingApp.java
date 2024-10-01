package com.asd.gui.app.gui;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.stereotype.Component;

import javax.swing.*;

@ConditionalOnNotWebApplication
@Component
public class SwingApp extends JFrame {

    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
