private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        Double R,G,B;
        Double Y=Double.parseDouble(jTextField1.getText());
        Double I=Double.parseDouble(jTextField2.getText());
        Double Q=Double.parseDouble(jTextField3.getText());
        DecimalFormat df=new DecimalFormat("#.###");
        /*if(Y>=1||I>=1||Q>=1)
        {
            Y=Y/255;
            I=I/255;
            Q=Q/255;
        }*/
        R=(Y+(0.956*I)+(0.620*Q))*255;
        G=(Y+(0.272*I)-(0.647*Q))*255;
        B=(Y-(1.108*I)+(1.705*Q))*255;
        jTextField10.setText(df.format(R));
        jTextField11.setText(df.format(G));
        jTextField12.setText(df.format(B));
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Double R=0.0,G=0.0,B=0.0;
        Double H=Double.parseDouble(jTextField7.getText());
        Double S=Double.parseDouble(jTextField8.getText());
        Double V=Double.parseDouble(jTextField9.getText());
        Double c,x,m;
        c=V*S;
        x=c*(1-Math.abs((H/60)%2-1));
        m=V-c;
        if(H>=0&&H<60)
        {
            R=c;
            G=x;
            B=0.0;
        }
        else if(H>=60&&H<120)
        {
            R=x;
            G=c;
            B=0.0;
        }
        else if(H>=120&&H<180)
        {
            R=0.0;
            G=c;
            B=x;
        }
        else if(H>=180&&H<240)
        {
            R=0.0;
            G=x;
            B=c;
        }
        else if(H>=240&&H<300)
        {
            R=x;
            G=0.0;
            B=c;
        }
        else if(H>=300&&H<360)
        {
            R=c;
            G=0.0;
            B=x;
        }
        R=(R+m)*255;
        G=(G+m)*255;
        B=(B+m)*255;
        jTextField10.setText(String.valueOf(R));
        jTextField11.setText(String.valueOf(G));
        jTextField12.setText(String.valueOf(B));
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Double R,G,B;
        Double C=Double.parseDouble(jTextField4.getText());
        Double M=Double.parseDouble(jTextField5.getText());
        Double Y=Double.parseDouble(jTextField6.getText());
        if(Y>=1||M>=1||C>=1)
        {
            R=C-255;
            G=M-255;
            B=Y-255;
        }
        else
        {
            R=1-C;
            G=1-M;
            B=1-Y;
        }
        jTextField10.setText(String.valueOf(R));
        jTextField11.setText(String.valueOf(G));
        jTextField12.setText(String.valueOf(B));
    }                           
