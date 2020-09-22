import java.awt.*;
class Border {
Frame f;
Button b1,b2,b3,b4,b5;
Border(){
                    f=new Frame();

                    b1=new Button("NORTH");;
                    b2=new Button("SOUTH");;
                    b3=new Button("EAST");;
                    b4=new Button("WEST");;
                    b5=new Button("CENTER");;


                    f.add(b1,BorderLayout.NORTH);
                    f.add(b2,BorderLayout.SOUTH);
                    f.add(b3,BorderLayout.EAST);
                    f.add(b4,BorderLayout.WEST);
                    f.add(b5,BorderLayout.CENTER);

                    f.setSize(300,300);
                    f.setVisible(true);

}

public static void main(String[] args) {
                    new Border();
}
}