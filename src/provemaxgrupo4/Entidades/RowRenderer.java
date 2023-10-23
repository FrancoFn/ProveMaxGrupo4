/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4.Entidades;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Franco Scaramuzzino
 */
public class RowRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        int stock = (int) table.getModel().getValueAt(row, 4); // Supongo que el stock está en la columna 4
        if (stock < 5) {
            c.setBackground(Color.RED);
        } else {
            c.setBackground(table.getBackground());
        }
        return c;
    }
}
