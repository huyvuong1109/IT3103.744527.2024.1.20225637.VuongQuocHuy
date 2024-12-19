

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;



public class StoreScreen extends JFrame {
    private Store store;

    public StoreScreen(Store store) {
        this.store = store;

        // Cài đặt Container chính của JFrame
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        // Cài đặt các thuộc tính JFrame
        setTitle("Store");
        setSize(1024, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Tạo phần phía trên (MenuBar + Header)
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    // Tạo thanh menu
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    // Tạo tiêu đề và nút "View Cart" ở góc trên bên phải
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        // Tiêu đề của ứng dụng
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.BLUE);

        // Nút "View Cart"
        JButton cartButton = new JButton("View Cart");
        cartButton.setPreferredSize(new Dimension(120, 50));
        cartButton.setMaximumSize(new Dimension(120, 50));

        // Xử lý sự kiện khi nhấn nút "View Cart"
        cartButton.addActionListener(e -> {
            new CartScreen(this.store.getCart());
        });

        // Thêm tiêu đề và nút "View Cart" vào header
        header.add(Box.createRigidArea(new Dimension(10, 0))); 
        header.add(title);
        header.add(Box.createHorizontalGlue()); 
        header.add(cartButton);
        header.add(Box.createRigidArea(new Dimension(10, 0))); 

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media);
            center.add(cell);
        }

        return center;
    }
}
