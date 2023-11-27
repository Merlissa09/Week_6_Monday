    import javax.swing.JFrame;
    import javax.swing.JPanel;

    public class TestJFrame extends JFrame{
        JPanel panel;

        public TestJFrame() {
            super("TicTacToe Game");

            panel = new JPanel();
            setContentPane(panel);

            setLocation(0, 0);
            setSize(500, 600);
            setVisible(true);
        }
    }
