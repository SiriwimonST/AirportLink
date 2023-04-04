import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AirportGUITest extends AirportLink{
    int distance;
    double peoplee;
    String  frist1,last1;
    public AirportGUITest() {
        String place[] = {" ","a","b","c","d"};
        String place1[] = {" ","e","f","g","h"};
        JFrame frame;
        frame = new JFrame();
        JPanel panel,panelback,panelsum;
        panel = new JPanel();
        panelback = new JPanel();
        panelsum = new JPanel();
        JLabel dis,fr,to,line,ppl,tppl,t1,t2,t3,t4,t5,t6,pt,first,last,ppll,cash,sumation,fareLabel,result;
        dis = new JLabel("distance");
        fr = new JLabel("zone from");
        to = new JLabel("zone to");
        line = new JLabel("Bus type");
        ppl = new JLabel("How many ppl?");
        pt = new JLabel("Passenger type");
        tppl = new JLabel("");
        first = new JLabel("departure station");
        t1 = new JLabel("");
        last = new JLabel("terminal station");
        t2 = new JLabel("");
        ppll = new JLabel("total number of passengers");
        t3 = new JLabel("");
        cash = new JLabel("Fares");
        t4 = new JLabel("");
        sumation = new JLabel("total price");
        t5 = new JLabel("");
        t6 = new JLabel("pic");
        fareLabel = new JLabel("Calculate fare",SwingConstants.CENTER);
        result = new JLabel("Result",SwingConstants.CENTER);
        JTextField pps;
        pps = new JTextField("",6);
        JCheckBox cb,cb1;
        cb = new JCheckBox("City line");
        cb1 = new JCheckBox("Express line");
        JComboBox combo,combo1;
        combo = new JComboBox<>(place);
        combo.setSelectedItem(" ");
        combo.setMaximumRowCount(6);
        combo1 = new JComboBox<>(place1);
        combo1.setSelectedItem(" ");
        combo1.setMaximumRowCount(6);
        JButton clear,cal;
        clear = new JButton("Clear");
        cal = new JButton("Calculate");
        Font font,font1;
        font = new Font("TH SarabunPSK", Font.BOLD, 40);
        font1 = new Font("TH SarabunPSK", Font.BOLD, 20);
        line.setFont(font);
        dis.setFont(font);
        ppl.setFont(font);
        fareLabel.setFont(font);
        result.setFont(font1);
        CardLayout cl;
        cl = new CardLayout();
        panelsum.setLayout(cl);
        panelsum.add(panel,"1");
        panelsum.add(panelback,"2");
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg ="";
                if(cb.isSelected()){
                    msg = "City line";
                    tppl.setText(msg);
                }
            }
        });
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg ="";
                if(cb1.isSelected()){
                    msg = "Express line";
                    tppl.setText(msg);
                } 
            }
        });
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelsum, "2");
                
                if(frist1.equals("a") && last1.equals("e"))
                {
                    distance=20;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                    
                }
                
                else if(frist1.equals("a") && last1.equals("f"))
                {
                    distance=20;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("a") && last1.equals("g"))
                {
                    distance=20;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("a") && last1.equals("h"))
                {
                    distance=20;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("b") && last1.equals("e"))
                {
                    distance=25;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("b") && last1.equals("f"))
                {
                    distance=25;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("b") && last1.equals("g"))
                {
                    distance=25;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("b") && last1.equals("h"))
                {
                    distance=25;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("c") && last1.equals("e"))
                {
                    distance=30;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("c") && last1.equals("f"))
                {
                    distance=30;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("c") && last1.equals("g"))
                {
                    distance=30;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("c") && last1.equals("h"))
                {
                    distance=30;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("d") && last1.equals("e"))
                {
                    distance=35;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("d") && last1.equals("f"))
                {
                    distance=35;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("d") && last1.equals("g"))
                {
                    distance=35;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                else if(frist1.equals("d") && last1.equals("h"))
                {
                    distance=35;
                    calculateFare(distance);
                    peoplee = Double.parseDouble(pps.getText());
                    setPeoplee(peoplee);
                    t3.setText(""+getPeoplee()+" people");
                    t4.setText(Double.toString(getCash()));
                    t5.setText(Double.toString(getCash()*peoplee));
                }
                
                
            }
            
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pps.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }  
        });
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("a"))
                {
                    t1.setText("a");
                    frist1="a";
                }
                if(selected.toString().equals("b"))
                {
                    t1.setText("b");
                    frist1="b";
                }
                if(selected.toString().equals("c"))
                {
                    t1.setText("c");
                    frist1="c";
                }
                if(selected.toString().equals("d"))
                {
                    t1.setText("d");
                    frist1="d";
                }
            }   
        });
        combo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("e"))
                {
                    t2.setText("e");
                    last1="e";
                }
                if(selected.toString().equals("f"))
                {
                    t2.setText("f");
                    last1="f";
                }
                if(selected.toString().equals("g"))
                {
                    t2.setText("g");
                    last1="g";
                }
                if(selected.toString().equals("h"))
                {
                    t2.setText("h");
                    last1="h";
                }
            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(line);
        panel.add(cb);  
        panel.add(cb1);
        panel.add(dis);
        panel.add(fr);
        panel.add(combo);
        panel.add(to);
        panel.add(combo1);
        panel.add(ppl);
        panel.add(pps);
        panel.add(clear);
        panel.add(cal);
        panelback.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panelback.setLayout(new GridLayout(0, 1));
        panelback.add(fareLabel);
        panelback.add(result);
        panelback.add(pt);
        panelback.add(tppl);
        panelback.add(first);
        panelback.add(t1);
        panelback.add(last);
        panelback.add(t2);
        panelback.add(ppll);
        panelback.add(t3);
        panelback.add(cash);
        panelback.add(t4);
        panelback.add(sumation);
        panelback.add(t5);
        panelback.add(t6);
        frame.add(panelsum);
        frame.setSize(500,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new AirportGUITest();
    }
}
