

public class Display extends JPanel {

    private JLabel label ;

    public Display(){
        setBackground(new Color(46,49,50));
        label = new JLabel("1234,56");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("cousier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }
}
