package 拼图小游戏;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {


    //随机图片路径
    String path;

    int[][] Arr = new int[4][4];

    int x = 0;
    int y = 0;

    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化数据(打乱)
        initDate();

        //随机获取图片类型
        initPictures();

        //初始化图片
        initImage();


        //初始化菜单~
        initJMenuBar();

        //添加键盘监听事件
        this.addKeyListener(this);


        //可视
        this.setVisible(true);


    }

    private void initPictures() {
        Random ra = new Random();

        String[] temp = {"animal", "girl", "sport"};
        int num = ra.nextInt(3);
        int tum = 0;
        if (num == 0) {
            tum = ra.nextInt(8);
        } else if (num == 1) {
            tum = ra.nextInt(13);
        } else {
            tum = ra.nextInt(10);
        }
        path = "E:\\Java_Family\\Java_projects\\UN_1\\image\\" + temp[num] +"\\"+ temp[num] + tum;

    }

    private void initDate() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

      /*  for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + ",");
        }
        System.out.println();*/


        //创建二维数组

        for (int i = 0; i < tempArr.length; i++) {

            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            Arr[i / 4][i % 4] = tempArr[i];


        }
        /*for (int j = 0; j < Arr.length; j++) {
            for (int i = 0; i < Arr.length; i++) {
                System.out.print(Arr[j][i] + ",");
            }
            System.out.println();
        }*/


    }

    private void initImage() {

        //清空已经出现的图片
        this.getContentPane().removeAll();


        //指定图片的位置
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = Arr[i][j];

                ImageIcon icon = new ImageIcon(path +"\\"+ num + ".jpg");
                JLabel jLabel = new JLabel(icon);
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(jLabel);
            }

        }


        //添加背景图片
        ImageIcon icon = new ImageIcon("" +
                "image\\background.png");
        JLabel jLabel = new JLabel(icon);
        jLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLabel);


        //刷新一下界面
        this.getContentPane().repaint();
    }


    private void initJFrame() {
        JFrame gameJframe = new JFrame();
        this.setSize(603, 680);
        this.setTitle("小游戏");
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消默认居中放置
        this.setLayout(null);
        //关闭
        this.setDefaultCloseOperation(3);
    }


    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        //选项
        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        //条目对象
        JMenuItem replay = new JMenuItem("重新游戏");
        JMenuItem reLongin = new JMenuItem("重新登录");
        JMenuItem close = new JMenuItem("关闭游戏");

        JMenuItem puAbout = new JMenuItem("公众号");

        //层层套进去
        functionJmenu.add(replay);
        functionJmenu.add(reLongin);
        functionJmenu.add(close);

        aboutJmenu.add(puAbout);

        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }


    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 32) {
            //看全图
            this.getContentPane().removeAll();
            ImageIcon all = new ImageIcon(path +"\\"+ "all.jpg");
            JLabel jLabel = new JLabel(all);
            jLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel);

            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        //向下移动
        if (code == 40) {
            if (x == 3) {
                return;
            }
            Arr[x][y] = Arr[x + 1][y];
            Arr[x + 1][y] = 0;
            x++;
            initImage();
        }
        //上
        else if (code == 38) {
            if (x == 0) {
                //已经是最后一行了
                return;
            }
            Arr[x][y] = Arr[x - 1][y];
            Arr[x - 1][y] = 0;
            x--;
            initImage();


        } else if (code == 37) {
            //左
            if (y == 0) {
                return;
            }
            Arr[x][y] = Arr[x][y - 1];
            Arr[x][y - 1] = 0;
            y--;
            initImage();

        } else if (code == 39) {
            //右
            if (y == 3) {
                return;
            }
            Arr[x][y] = Arr[x][y + 1];
            Arr[x][y + 1] = 0;
            y++;
            initImage();
        } else if (code == 32) {
            initImage();
        }
    }

    public void keyTyped(KeyEvent e) {

    }


}
