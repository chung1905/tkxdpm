package core;

import main.IView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView implements IView {
    private final MainController controller;

    private Container rootContainer;

    public MainView(MainController controller) {
        this.controller = controller;
    }

    public Container draw() {
        Container rootContainer = getRootContainer();
        BoxLayout layout = new BoxLayout(rootContainer, BoxLayout.PAGE_AXIS);
        rootContainer.setLayout(layout);
        addBtn("Phuong thuc van chuyen", e -> controller.moveToTransportation());
        addBtn("Mat hang kinh doanh", e -> controller.moveToMHKD());
        addBtn("QUIT", e -> System.out.println("QUIT"));

        return rootContainer;
    }

    private void addBtn(String text, ActionListener listener) {
        Container rootContainer = getRootContainer();
        rootContainer.add(createVerticalGlue());
        rootContainer.add(getButton(text, listener));
        rootContainer.add(createVerticalGlue());
    }

    private JButton getButton(String text, ActionListener listener) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.addActionListener(listener);
        return btn;
    }

    private Container getRootContainer() {
        if (rootContainer == null) {
            rootContainer = new Container();
        }

        return rootContainer;
    }

    public Component createVerticalGlue() {
        return new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 600));
    }
}