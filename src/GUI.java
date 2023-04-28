import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Gui extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private DataManager dataManager;
    private JList<String> groupList;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField nameField, ageField, genderField, emailField, phoneField;
    private JButton addButton, editButton, deleteButton;

    public Gui(DataManager dataManager) {
        this.dataManager = dataManager;
        setTitle("Gestion des personnes");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel haut : liste des groupes
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createTitledBorder("Groupes"));
        groupList = new JList<String>(getGroupNames());
        groupList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        groupList.setSelectedIndex(0);
        JScrollPane scrollPane = new JScrollPane(groupList);
        scrollPane.setPreferredSize(new Dimension(200, 0));
        topPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel centre : tableau des personnes
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createTitledBorder("Personnes"));
        tableModel = new Default();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}