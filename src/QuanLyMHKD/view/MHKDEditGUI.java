package QuanLyMHKD.view;

import QuanLyMHKD.controller.MHKDEditController;
import QuanLyMHKD.entity.MatHangKinhDoanh;
import QuanLyMHKD.view.edit.MHKDForm;
import main.view.IView;

import java.awt.*;

public class MHKDEditGUI implements IView {
    private final MHKDEditController controller;

    private final MatHangKinhDoanh entity;

    public MHKDEditGUI(MHKDEditController controller, MatHangKinhDoanh entity) {
        this.controller = controller;
        this.entity = entity;
    }

    public Container draw() {
        Container rootContainer = new Container();
        // https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
        rootContainer.setLayout(new BorderLayout(0, 10));

        rootContainer.add((new MHKDForm(this.controller, this.entity)).draw(), BorderLayout.CENTER);

        return rootContainer;
    }
}
