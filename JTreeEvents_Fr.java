import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeEvents_Fr 
{
JTree tree;
JFrame f;
JTreeEvents_Fr()
{
f=new JFrame();
f.setLayout(new BorderLayout());
DefaultMutableTreeNode top=new DefaultMutableTreeNode("Options");
DefaultMutableTreeNode a= new DefaultMutableTreeNode("A");
top.add(a);
DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
a.add(a1);
DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
a.add(a2);
DefaultMutableTreeNode b= new DefaultMutableTreeNode("B");
top.add(b);
DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
b.add(b1);
DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
b.add(b2);
DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
b.add(b3);
tree=new JTree(top);
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JScrollPane(tree,v,h);
f.add(jsp,BorderLayout.CENTER);

f.setSize(500,500);
f.setVisible(true);
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
JTreeEvents_Fr f1=new JTreeEvents_Fr();
}
}


