package tic_tac_toe.TIC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame{
    int choice=0;
    JFrame f1,f2;
    JPanel p1,p2,p3;
    JButton b1;
    JButton b2;
    JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
    JButton r;
    JLabel l1,pvc,pvp;
    Font font1= new Font("Myriad Pro", Font.BOLD, 30);
    Font font2= new Font("", Font.BOLD, 25);
    Font font3= new Font("", Font.BOLD, 70);
    Font font4= new Font("", Font.BOLD, 21);

    public TicTacToe(){
        f1 = new JFrame("Player VS Robot");
        f2 = new JFrame("Player VS Player");
        setSize(400,210);
        setLayout(new FlowLayout());
        f1.setLayout(new FlowLayout());
        f2.setLayout(new FlowLayout());

        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        l1= new JLabel("Select Any To Continue");
        b1= new JButton("Play  Against  ROBOT");
        b2= new JButton("Play Against PLAYER");
        r= new JButton("BACK TO MAIN MENU");
        r.setFont(font2);
        pvc= new JLabel("PLAYER VS COMPUTER");
        pvc.setFont(font2);
        pvp= new JLabel("PLAYER VS PLAYER");
        pvp.setFont(font1);
        l1.setFont(font1);
        l1.setForeground(Color.BLUE);
        b1.setFont(font2);
        b2.setFont(font2);

        p1.setLayout(new GridLayout(3,3,5,5));
        bt0= new JButton("   ");
        bt0.setFont(font3);
        bt1= new JButton();
        bt1.setFont(font3);
        bt2= new JButton();
        bt2.setFont(font3);
        bt3= new JButton();
        bt3.setFont(font3);
        bt4= new JButton();
        bt4.setFont(font3);
        bt5= new JButton();
        bt5.setFont(font3);
        bt6= new JButton();
        bt6.setFont(font3);
        bt7= new JButton();
        bt7.setFont(font3);
        bt8= new JButton();
        bt8.setFont(font3);

        p1.add(bt0);
        p1.add(bt1); p1.add(bt2);
        p1.add(bt3); p1.add(bt4);
        p1.add(bt5); p1.add(bt6);
        p1.add(bt7); p1.add(bt8);


        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                f2.setVisible(false);
                setVisible(true);


            }
        });




        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
                f1.setSize(400,500);
                p2.add(r);
                p3.add(pvc);
                f1.add(p3);
                f1.add(p1);
                f1.add(p2);
                bt0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0){
                            bt0.setText("X");
                            bt4.setText("O");
                            setter(1);
                        }
                        bt1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt1.setText("X");
                                    bt2.setText("O");
                                    setter(2);
                                }
                                bt3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt3.setText("X");
                                            bt6.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }
                                    }
                                });
                                bt6.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt6.setText("X");
                                            bt3.setText("O");
                                            setter(3);
                                        }
                                        bt7.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt7.setText("X");
                                                    bt5.setText("O");
                                                    setter(4);
                                                    //COM WIN
                                                }
                                            }
                                        });
                                        bt8.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt8.setText("X");
                                                    bt5.setText("O");
                                                    setter(4);
                                                    //COM WIN
                                                }
                                            }
                                        });
                                        bt5.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt5.setText("X");
                                                    bt8.setText("O");
                                                    setter(4);

                                                }
                                                bt7.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        if(choice==4){
                                                            bt7.setText("X");
                                                            bt8.setText("O");
                                                            setter(5);
                                                            // MATCH DRAW
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                bt5.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt5.setText("X");
                                            bt6.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }
                                    }
                                });
                                bt7.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt7.setText("X");
                                            bt6.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }
                                    }
                                });
                                bt8.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt8.setText("X");
                                            bt6.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }
                                    }
                                });


                            }
                        });

                        bt3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt3.setText("X");
                                    bt6.setText("O");
                                    setter(2);
                                }
                                bt1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt1.setText("X");
                                            bt2.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }

                                    }
                                });
                                bt5.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt5.setText("X");
                                            bt2.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }

                                    }
                                });
                                bt7.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt7.setText("X");
                                            bt2.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }

                                    }
                                });
                                bt8.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt8.setText("X");
                                            bt2.setText("O");
                                            setter(3);
                                            //COM WIN
                                        }

                                    }
                                });
                                bt2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(choice==2){
                                            bt2.setText("X");
                                            bt1.setText("O");
                                            setter(3);
                                        }
                                        bt5.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt5.setText("X");
                                                    bt7.setText("O");
                                                    setter(4);
                                                    // COM WIN
                                                }

                                            }
                                        });
                                        bt8.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt8.setText("X");
                                                    bt7.setText("O");
                                                    setter(4);
                                                    // COM WIN
                                                }

                                            }
                                        });
                                        bt7.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if(choice==3){
                                                    bt7.setText("X");
                                                    bt8.setText("O");
                                                    setter(4);

                                                }
                                                bt5.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        if(choice==3){
                                                            bt5.setText("X");
                                                            setter(4);
                                                            // DRAW
                                                        }

                                                    }
                                                });

                                            }
                                        });

                                    }
                                });

                            }
                        });
                        ////////////////////
                        bt2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt2.setText("X");
                                    bt1.setText("O");
                                    setter(2);
                                }

                            }
                        });
                        bt6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt6.setText("X");
                                    bt3.setText("O");
                                    setter(2);
                                }
                            }
                        });
                        bt7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt7.setText("X");
                                    bt5.setText("O");
                                    setter(2);
                                }
                            }
                        });
                        bt5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt5.setText("X");
                                    bt7.setText("O");
                                    setter(2);
                                }
                            }
                        });
                        bt8.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(choice==1){
                                    bt8.setText("X");
                                    bt3.setText("O");
                                    setter(2);
                                }
                            }
                        });


                    }
                });
                bt1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                            bt1.setText("X");
                            bt4.setText("O");
                            setter(1);
                        }
                    }
                });


                bt2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                             bt2.setText("X");
                             bt4.setText("O");
                             setter(1);
                        }
                    }
                });
                bt3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                             bt3.setText("X");
                             bt4.setText("O");
                             setter(1);
                        }
                    }
                });
                bt4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                        bt4.setText("X");
                        bt2.setText("O");
                        setter(1);
                        }
                    }
                });
                bt5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                        bt6.setText("X");
                        bt4.setText("O");
                        setter(1);
                        }
                    }
                });
                bt6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                        bt6.setText("X");
                        bt4.setText("O");
                        setter(1);
                        }
                    }
                });
                bt7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                        bt7.setText("X");
                        bt4.setText("O");
                        setter(1);
                        }
                    }
                });
                bt8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice==0) {
                        bt8.setText("X");
                        bt4.setText("O");
                        setter(1);
                        }
                    }
                });

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
                f2.setSize(400,500);
                p2.add(r);
                p3.add(pvp);
                f2.add(p3);
                f2.add(p1);
                f2.add(p2);
                bt0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt0.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt0.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt1.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt1.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt2.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt2.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt3.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt3.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt4.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt4.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt5.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt5.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt6.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt6.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt7.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt7.setText("O");
                            setter(choice+1);
                        }
                    }
                });
                bt8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(choice%2==0) {
                            bt8.setText("X");
                            setter(choice+1);
                        }
                        else{
                            bt8.setText("O");
                            setter(choice+1);
                        }
                    }
                });

            }
        });

        add(l1);
        add(l1);
        add(b1);
        add(b2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public void setter(int choice){
        this.choice=choice;

}

    public static void main(String[] args) {
        new TicTacToe();
    }
}
