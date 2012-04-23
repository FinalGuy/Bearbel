package de.tfojuth.projects.teamworker.blgexport.view.swing.table;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShiftTableModel implements TableModel {

    static final NUMBER_OF_ROWS = 80;
    static final COLUMN_NAMES = ["Personal#", "Storno", "Datum", "Schichtbeginn", "Schichtende", "Qualifikation", "Stundenverrechnungssatz", "Nachname", "Vorname", "Karten#", "Geschlecht"];

    private Object[][] data = new Object[NUMBER_OF_ROWS][COLUMN_NAMES.size];

    private List<TableModelListener> modelListeners = new ArrayList<TableModelListener>();


    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.size
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1) return Boolean.class;
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = aValue;
    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        modelListeners.add(listener);
    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        modelListeners.remove(listener);
    }
}
