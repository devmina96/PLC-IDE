package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Controller {

    File file = new File("fileName1.txt");
    PrintWriter pw = new PrintWriter(file);



    @FXML
    Canvas canvas1;


    int i =2;
    int I1;
    int j =0;
    int k = -45;
    int p =0;
    int q=0;
    int r=0;
    int s=0;
    String variable;

    public Controller() throws FileNotFoundException {
    }

    public void canvas1CanvasOnMouseClicked(MouseEvent mouseEvent) {

        if(i<608) {
            if (j == 1) {
                variable = AlertBox.display("Element Number", "--| |--");
                j = 0;
                System.out.println(variable);
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawOS(gc);

            }
            else if (j == 2) {
                variable = AlertBox.display("Element Number", "--|/|--");
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawCS(gc);

            } else if (j == 3) {
                variable = AlertBox.display("Element Number", "--( )--");
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawOR(gc);

            } else if (j == 4) {
                variable = AlertBox.display("Element Number", "--(/)--");
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawCR(gc);

            } else if (j == 5) {
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawSC(gc);

            }else if (j == 6) {
                variable = AlertBox.display("Element Number", "--|V|--");
                System.out.println(variable);
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawvS(gc);

            }
            else if (j == 7) {
                variable = AlertBox.display("Element Number", "--|^|--");
                System.out.println(variable);
                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawupS(gc);

            }
            else if (j == 8) {

                j = 0;
                System.out.println("test");
                GraphicsContext gc = canvas1.getGraphicsContext2D();
                drawPRLL(gc);

            }
        }


    }
    public void NewLineButtonClicked(ActionEvent actionEvent) {
        if(k==-45){
            GraphicsContext gc = canvas1.getGraphicsContext2D();
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.BLUE);
            gc.setLineWidth(2);
            gc.strokeLine(2, 1, 2, 500);
            gc.strokeLine(609, 1, 609, 500);
        }
        else
            pw.println("\n");

        k=k+45;
        i = 2;

        if(q==1)
            k=k+45;


        r=r++;

    }

    public void OSButtonClicked(ActionEvent actionEvent) {
        j = 1;
    }
    public void CSButtonClicked(ActionEvent actionEvent) {
        j = 2;
    }
    public void vSButtonClicked(ActionEvent actionEvent) {
        j=6;
    }
    public void upSButtonClicked(ActionEvent actionEvent) {
        j=7;
    }
    public void ORButtonClicked(ActionEvent actionEvent) {
        j = 3;
    }
    public void CRButtonClicked(ActionEvent actionEvent) {
        j = 4;
    }
    public void SCButtonClicked(ActionEvent actionEvent) {
        j = 5;
    }


    public void RunButtonClicked(ActionEvent actionEvent) {
        pw.close();
    }


    public void drawOS(GraphicsContext gc) {
        if(k>k*r-k)
            s++;

        if(s>1)
            if(k==k*r-k){
                i=i-101*(s-1);
                s=0;
            }

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 40+i, 17.5+k);
        gc.strokeLine(40+i, 10+k, 40+i, 25+k);
        gc.strokeText(variable,45+i,9+k);
        gc.strokeLine(60+i, 10+k, 60+i, 25+k);
        gc.strokeLine(61+i, 17.5+k, 101+i, 17.5+k);

        if(i == 2) {
            pw.println("LD " + variable);
        }
        else
            pw.println("AND " + variable);

        I1 = i;
        i = i+101;

    }

    public void drawCS(GraphicsContext gc) {

        if(k>k*r-k)
            s++;

        if(s>1)
            if(k==k*r-k){
                i=i-101*(s-1);
                s=0;
            }

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 40+i, 17.5+k);
        gc.strokeLine(40+i, 10+k, 40+i, 25+k);
        gc.strokeText(variable,45+i,9+k);
        gc.strokeLine(44+i, 25+k, 56+i, 10+k);
        gc.strokeLine(60+i, 10+k, 60+i, 25+k);
        gc.strokeLine(61+i, 17.5+k, 101+i, 17.5+k);

        if(i == 2) {
            pw.println("LDN " + variable);
        }
        else
            pw.println("ANDN " + variable);

        I1 = i;
        i = i+101;


    }


    public void drawvS(GraphicsContext gc) {

        if(k>k*r-k)
            s++;

        if(s>1)
            if(k==k*r-k){
                i=i-101*(s-1);
                s=0;
            }

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 40+i, 17.5+k);
        gc.strokeLine(40+i, 10+k, 40+i, 25+k);
        gc.strokeText(variable,45+i,9+k);
        gc.strokeLine(50+i, 12+k, 50+i, 23+k);
        gc.strokeLine(50+i, 23+k, 47+i, 18+k);
        gc.strokeLine(50+i, 23+k, 53+i, 18+k);
        gc.strokeLine(60+i, 10+k, 60+i, 25+k);
        gc.strokeLine(61+i, 17.5+k, 101+i, 17.5+k);

        if(i == 2) {
            pw.println("LD " + variable);
        }
        else
            pw.println("AND " + variable);

        I1 = i;
        i = i+101;

    }


    public void drawupS(GraphicsContext gc) {

        if(k>k*r-k)
            s++;

        if(s>1) {
            if (k == k * r - k) {
                i = i - 101 * (s - 1);
                s = 0;
            }
        }

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 40+i, 17.5+k);
        gc.strokeLine(40+i, 10+k, 40+i, 25+k);
        gc.strokeText(variable,45+i,9+k);
        gc.strokeLine(50+i, 12+k, 50+i, 23+k);
        gc.strokeLine(50+i, 12+k, 47+i, 17+k);
        gc.strokeLine(50+i, 12+k, 53+i, 17+k);
        gc.strokeLine(60+i, 10+k, 60+i, 25+k);
        gc.strokeLine(61+i, 17.5+k, 101+i, 17.5+k);

        if(i == 2) {
            pw.println("LD " + variable);
        }
        else
            pw.println("AND " + variable);

        I1 = i;
        i = i+101;

    }




    public void drawOR(GraphicsContext gc) {

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 548, 17.5+k);
        gc.strokeArc(548,10+k,20,15,90,180,ArcType.OPEN);
        gc.strokeText(variable,559,9+k);
        gc.strokeArc(563,10+k,20,15,270,180,ArcType.OPEN);
        gc.strokeLine(583, 17.5+k, 608, 17.5+k);

        if(i == 2) {
            pw.println("LD " + variable);
        }
        else
            pw.println("ST " + variable);

        I1 = i;
        i = i+101;

    }


    public void drawCR(GraphicsContext gc) {

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1+i, 17.5+k, 548, 17.5+k);
        gc.strokeArc(548,10+k,20,15,90,180,ArcType.OPEN);
        gc.strokeText(variable,559,9+k);
        gc.strokeLine(562, 25+k, 568, 10+k);
        gc.strokeArc(563,10+k,20,15,270,180,ArcType.OPEN);
        gc.strokeLine(583, 17.5+k, 608, 17.5+k);

        if(i == 2) {
            pw.println("LD " + variable);
        }
        else
            pw.println("ST " + variable);

        I1 = i;
        i = i+101;

    }

    public void drawSC(GraphicsContext gc) {

        if(k>k*r-k)
            s++;

        if(s>1)
            if(k==k*r-k){
                i=i-101*(s-1);
                s=0;
            }
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(1 + i, 17.5 + k, 100 + i, 17.5 + k);
        i = i + 101;

        //pw.println("SC");

    }


    public void PRLLButtonClicked(ActionEvent actionEvent) {
        j=8;
        p=p+1;

    }

    public void drawPRLL(GraphicsContext gc) {
        if (p==1) {
            i = i - 101;
            q=1;
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.BLUE);
            gc.setLineWidth(1);
            gc.strokeLine(i, 17.5 + k, i, 62.5 + k);
            k=k+45;

        }

        else if (p==2){
            k=k-45;
            gc.setFill(Color.GREEN);
            gc.setStroke(Color.BLUE);
            gc.setLineWidth(1);
            gc.strokeLine(i, 17.5 + k, i, 62.5 + k);


            p=0;
            q=1;
            System.out.println("right");}


        //pw.println("SC");
       // k=k+90;

    }
}